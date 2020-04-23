package com.purplecobras.keyboardwarrior.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Color;

public abstract class GUI_KBW implements ActionListener {
    public static final String splashPage_Label = "SPLASHPAGE";
    public static final String newShortcutPage_Label = "NEW_SHORTCUT";
    public static final String shortcutTable_Lable = "SHORTCUT_TABLE";
    public static final String appNameLabel = "Keyboard Warrior";

    public static final Color BACKGROUND_COLOR = new Color(102, 0, 200);
    public static final Color BUTTON_COLOR = Color.GRAY;
    public static final Color LABEL_COLOR = Color.GRAY;
    public static final Color TABLE_COLOR = Color.GRAY;
    public static final Color PANEL_COLOR = Color.GRAY;

    public static CardLayout contentPaneLayout;

    public static JPanel contentPane;
    public static JFrame frame = new JFrame(appNameLabel);

    public static void GUI_Init() {
        GUI_SplashPage.splashPage_Setup();
        GUI_NewShotcut.newShortcut_Setup();
        GUI_ShortcutTable.ShortcutTable_Setup();
        GUI_Config();
    }

    private static void GUI_Config() {
        contentPane.add(splashPage_Label, GUI_SplashPage.splashPage_Panel);
        contentPane.add(newShortcutPage_Label, GUI_NewShotcut.newShortcut_Panel);
        contentPane.add(shortcutTable_Lable, GUI_ShortcutTable.ShortcutTable_Panel);

        // see a specific page (start)
        contentPaneLayout.show(contentPane, splashPage_Label);
        // contentPaneLayout.show(contentPane, pageTwoName);
        // contentPaneLayout.show(contentPane, pageFourName);

        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setSize(600, 350);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setResizable(false);
    }
}