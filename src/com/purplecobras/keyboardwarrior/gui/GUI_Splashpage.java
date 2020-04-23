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
        KBW_GUI.contentPane = (JPanel) KBW_GUI.frame.getContentPane();
        KBW_GUI.contentPane.setLayout(KBW_GUI.contentPaneLayout = new CardLayout());
        splashPage_Panel.add(new JLabel(splashPage_frameLabel, JLabel.CENTER), BorderLayout.NORTH);
        splashPage_Panel.add(new JLabel("Exit", JLabel.CENTER), BorderLayout.SOUTH);

        splashPage_loadButtons();
        splashPage_setColors();
        exitPressed();
        editPressed();
        addPressed();
    }

    private static void splashPage_setColors() {
        splashPage_Panel.setBackground(KBW_GUI.PANEL_COLOR);
        exit_Button.setBackground(KBW_GUI.BUTTON_COLOR);
        add_Button.setBackground(KBW_GUI.BUTTON_COLOR);
        edit_Button.setBackground(KBW_GUI.BUTTON_COLOR);
    }

    private static void splashPage_loadButtons() {
        splashPage_Panel.add(splashPage_Buttons, BorderLayout.SOUTH);
        splashPage_Buttons.add(add_Button);
        splashPage_Buttons.add(edit_Button);
        splashPage_Buttons.add(exit_Button);

    }

    private static void exitPressed() {
        exit_Button.addActionListener(e -> {
            KBW_GUI.frame.dispatchEvent(new WindowEvent(KBW_GUI.frame, WindowEvent.WINDOW_CLOSING));
        });
    }

    private static void addPressed() {
        add_Button.addActionListener(e -> {
            KBW_GUI.contentPaneLayout.show(KBW_GUI.contentPane, KBW_GUI.newShortcutPage_Label);
        });
    }

    private static void editPressed() {
        edit_Button.addActionListener(e -> {
            KBW_GUI.contentPaneLayout.show(KBW_GUI.contentPane, KBW_GUI.shortcutTable_Lable);
        });
    }

}