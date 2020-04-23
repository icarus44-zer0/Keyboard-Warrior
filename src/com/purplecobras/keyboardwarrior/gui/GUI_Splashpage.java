package com.purplecobras.keyboardwarrior.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public abstract class GUI_SplashPage implements ActionListener {

    public static final String splashPage_frameLabel = "<html><font size=5>Keyboard Shortcut</font></html>";
    public static final String addButtonLabel = "ADD";
    public static final String editButtonLabel = "EDIT";
    public static final String exitButtonLabel = "EXIT";

    public static JButton add_Button = new JButton(addButtonLabel);
    public static JButton edit_Button = new JButton(editButtonLabel);
    public static JButton exit_Button = new JButton(exitButtonLabel);
    public static JPanel splashPage_Panel = new JPanel(new BorderLayout());
    public static JPanel splashPage_Buttons = new JPanel(new FlowLayout());


    public static void splashPage_Setup() {
        GUI_KBW.contentPane = (JPanel) GUI_KBW.frame.getContentPane();
        GUI_KBW.contentPane.setLayout(GUI_KBW.contentPaneLayout = new CardLayout());
        splashPage_Panel.add(new JLabel(splashPage_frameLabel, JLabel.CENTER), BorderLayout.NORTH);
        splashPage_Panel.add(new JLabel("Exit", JLabel.CENTER), BorderLayout.SOUTH);

        splashPage_loadButtons();
        splashPage_setColors();
        exitPressed();
        editPressed();
        addPressed();
    }

    private static void splashPage_setColors() {
        splashPage_Panel.setBackground(GUI_KBW.PANEL_COLOR);
        exit_Button.setBackground(GUI_KBW.BUTTON_COLOR);
        add_Button.setBackground(GUI_KBW.BUTTON_COLOR);
        edit_Button.setBackground(GUI_KBW.BUTTON_COLOR);
    }

    private static void splashPage_loadButtons() {
        splashPage_Panel.add(splashPage_Buttons, BorderLayout.SOUTH);
        splashPage_Buttons.add(add_Button);
        splashPage_Buttons.add(edit_Button);
        splashPage_Buttons.add(exit_Button);

    }

    private static void exitPressed() {
        exit_Button.addActionListener(e -> {
            GUI_KBW.frame.dispatchEvent(new WindowEvent(GUI_KBW.frame, WindowEvent.WINDOW_CLOSING));
        });
    }

    private static void addPressed() {
        add_Button.addActionListener(e -> {
            GUI_KBW.contentPaneLayout.show(GUI_KBW.contentPane, GUI_KBW.newShortcutPage_Label);
        });
    }

    private static void editPressed() {
        edit_Button.addActionListener(e -> {
            GUI_KBW.contentPaneLayout.show(GUI_KBW.contentPane, GUI_KBW.shortcutTable_Lable);
        });
    }

}