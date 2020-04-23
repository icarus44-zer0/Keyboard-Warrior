package com.purplecobras.keyboardwarrior.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public abstract class GUI_Splashpage implements ActionListener {
    
    public static final String Splashpage_frameLabel = "<html><font size=5>Keyboard Shortcut</font></html>";
    public static final String appNameLabel = "Keyboard Warrior";
    public static final String addButtonLabel = "ADD";
    public static final String editButtonLabel = "EDIT";
    public static final String exitButtonLabel = "EXIT";

    public static JButton add_Button = new JButton(addButtonLabel);
    public static JButton edit_Button = new JButton(editButtonLabel);
    public static JButton exit_Button = new JButton(exitButtonLabel);
    public static JPanel Splashpage_Panel = new JPanel(new BorderLayout());
    public static JPanel Splashpage_Buttons = new JPanel(new FlowLayout());


    public static void Splashpage_Setup() {
        KBW_GUI.contentPane = (JPanel) KBW_GUI.frame.getContentPane();
        KBW_GUI.contentPane.setLayout(KBW_GUI.contentPaneLayout = new CardLayout());
        Splashpage_Panel.add(new JLabel(Splashpage_frameLabel, JLabel.CENTER), BorderLayout.NORTH);
        Splashpage_Panel.add(new JLabel("Exit", JLabel.CENTER), BorderLayout.SOUTH);

        Splashpage_loadButtons();
        Splashpage_setColors();
        exitPressed();
        editPressed();
        addPressed();
    }

    private static void Splashpage_setColors() {
        Splashpage_Panel.setBackground(KBW_GUI.PANEL_COLOR);
        exit_Button.setBackground(KBW_GUI.BUTTON_COLOR);
        add_Button.setBackground(KBW_GUI.BUTTON_COLOR);
        edit_Button.setBackground(KBW_GUI.BUTTON_COLOR);
    }

    private static void Splashpage_loadButtons() {
        Splashpage_Panel.add(Splashpage_Buttons, BorderLayout.SOUTH);
        Splashpage_Buttons.add(add_Button);
        Splashpage_Buttons.add(edit_Button);
        Splashpage_Buttons.add(exit_Button);

    }

    private static void exitPressed() {
        exit_Button.addActionListener(e -> {
            KBW_GUI.frame.dispatchEvent(new WindowEvent(KBW_GUI.frame, WindowEvent.WINDOW_CLOSING));
        });
    }

    private static void addPressed() {
        add_Button.addActionListener(e -> {
            KBW_GUI.contentPaneLayout.show(KBW_GUI.contentPane, KBW_GUI.pageTwoName);
        });
    }

    private static void editPressed() {
        edit_Button.addActionListener(e -> {
            KBW_GUI.contentPaneLayout.show(KBW_GUI.contentPane, KBW_GUI.pageFourName);
        });
    }

}