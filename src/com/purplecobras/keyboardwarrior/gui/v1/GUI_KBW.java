package com.purplecobras.keyboardwarrior.gui.v1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Color;

public abstract class GUI_KBW implements ActionListener {
    public static final String splashPage_Label = "SPLASHPAGE";
    public static final String newShortcutPage_Label = "NEW_SHORTCUT";
    public static final String shortcutTable_Lable = "SHORTCUT_TABLE";
    public static final String appNameLabel = "KEYBOARD WARRIOR";

    public static final Color BACKGROUND_COLOR = new Color(102, 0, 200);
    public static final Color BUTTON_COLOR = Color.WHITE;
    public static final Color LABEL_COLOR = Color.WHITE;
    public static final Color TABLE_COLOR = Color.WHITE;
    public static final Color PANEL_COLOR = Color.WHITE;
    public static final Color PANE_COLOR = Color.WHITE;

    public static CardLayout contentPaneLayout;

    public static JPanel contentPane;
    public static JFrame frame = new JFrame(appNameLabel);

    public static void GUI_Init() {
        GUI_Image.iconImage();
        GUI_SplashPage.splashPage_Setup();
        GUI_NewShortcut.newShortcut_Setup();
        GUI_ShortcutTable.ShortcutTable_Setup();
        GUI_Config();
    }

    private static void GUI_Config() {
        contentPane.add(splashPage_Label, GUI_SplashPage.splashPage_Panel);
        contentPane.add(newShortcutPage_Label, GUI_NewShortcut.newShortcut_Panel);
        contentPane.add(shortcutTable_Lable, GUI_ShortcutTable.ShortcutTable_Panel);

        setStartPage();

        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setSize(600, 350);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setResizable(false);
    }

    private static void setStartPage() {
        /**
         * Splash page
         * page 1
         */
        //contentPaneLayout.show(contentPane, splashPage_Label);

        /**
         * Add New Shortcut Page
         * page 2
         */
        // contentPaneLayout.show(contentPane, newShortcutPage_Label);

        /**
         * Short Cut Tabel Page
         * page 3
         */
        contentPaneLayout.show(contentPane, shortcutTable_Lable);
    }
}