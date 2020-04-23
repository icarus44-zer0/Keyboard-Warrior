package com.purplecobras.keyboardwarrior.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Color;

public abstract class KBW_GUI implements ActionListener {
    public static final String pageOneName = "PAGE ONE";
    public static final String pageTwoName = "PAGE TWO";
    public static final String pageFourName = "PAGE FOUR";

    public static final String appNameLabel = "Keyboard Warrior";

    public static final Color BACKGROUND_COLOR = new Color(102, 0, 200);
    public static final Color BUTTON_COLOR = Color.GRAY;
    public static final Color LABEL_COLOR = Color.GRAY;
    public static final Color TABLE_COLOR = Color.GRAY;
    public static final Color PANEL_COLOR = Color.GRAY;

    public static CardLayout contentPaneLayout;

    public static JPanel pageOne_Panel = new JPanel(new BorderLayout());
    public static JPanel pageTwo_Panel = new JPanel(new GridLayout(4, 1, 10, 10));
    public static JPanel pageFour_Panel = new JPanel(new BorderLayout());

    public static JPanel contentPane;
    public static JFrame frame = new JFrame(appNameLabel);

    public static void GUI_Init() {
        GUI_Splashpage.Splashpage_Setup();
        GUI_AddNewShotcut.newShortcut_Setup();
        GUI_ShortcutTable.ShortcutTable_Setup();
        pageConfig();
    }

    private static void pageConfig() {
        contentPane.add(pageOneName, GUI_Splashpage.Splashpage_Panel);
        contentPane.add(pageTwoName, GUI_AddNewShotcut.newShortcut_Panel);
        contentPane.add(pageFourName, GUI_ShortcutTable.ShortcutTable_Panel);

        // see a specific page (start)
        contentPaneLayout.show(contentPane, pageOneName);
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