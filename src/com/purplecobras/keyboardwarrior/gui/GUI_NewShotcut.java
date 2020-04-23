package com.purplecobras.keyboardwarrior.gui;

import javax.swing.*;

import com.purplecobras.keyboardwarrior.Shortcut_Map;

import java.awt.*;
import java.awt.event.*;

public abstract class GUI_NewShotcut implements ActionListener {
    // ---- PAGE TWO ----

    public static final String newShortcut_frameLabel = "<html><font size=5>Enter The Value & Key Below</font></html>";
    public static final String returnButtonLabel = "RETURN";
    public static final String addSCButtonLabel = "ADD SHORTCUT";
    public static final String editSCButtonLabel = "EDIT SHORTCUTS";

    // private static JButton cancel_Button = new JButton(cancelButtonLabel);
    // private static final String cancelButtonLabel = "CANCEL";

    public static JButton addSC_Button = new JButton(addSCButtonLabel);
    public static JButton edit_SCButton = new JButton(editSCButtonLabel);
    public static JButton return_Button = new JButton(returnButtonLabel);

    public static JPanel newShortcut_Panel = new JPanel(new GridLayout(4, 1, 10, 10));
    public static JPanel newShortcut_Center = new JPanel(new GridLayout(3, 4));
    public static JPanel newShortcut_FlowLabel = new JPanel(new FlowLayout());
    public static JTextField newShortcut_ShortcutKeyFeild = new JTextField("");
    public static JPanel newShortcut_flowKey = new JPanel(new FlowLayout());
    public static JPanel newShortcut_Buttons = new JPanel(new FlowLayout());
    public static JTextField newShortcut_ShortcutValueFeild = new JTextField("");

    public static void newShortcut_Setup() {
        newShortcut_Panel.add(new JLabel(newShortcut_frameLabel, JLabel.CENTER), BorderLayout.NORTH);

        newShortcut_flowKey.add(new JLabel("  Key:", JLabel.RIGHT));
        newShortcut_ShortcutKeyFeild.setPreferredSize(new Dimension(250, 20));

        newShortcut_flowKey.add(newShortcut_ShortcutKeyFeild);

        newShortcut_FlowLabel.add(new JLabel("Value:", JLabel.RIGHT));
        newShortcut_ShortcutValueFeild.setPreferredSize(new Dimension(250, 20));

        newShortcut_FlowLabel.add(newShortcut_ShortcutValueFeild);

        newShortcut_Center.add(newShortcut_flowKey);
        newShortcut_Center.add(newShortcut_FlowLabel);

        newShortcut_Panel.add(newShortcut_Center, BorderLayout.CENTER);

        newShortcut_loadButtons();
        newShortcut_setColors();
        addSCButtonPress();
        editSCButtonPress();
        returnButtonPress();
    }

    private static void newShortcut_loadButtons() {
        newShortcut_Panel.add(newShortcut_Buttons, BorderLayout.SOUTH);
        newShortcut_Buttons.add(addSC_Button);
        newShortcut_Buttons.add(edit_SCButton);
        newShortcut_Buttons.add(return_Button);

    }

    private static void newShortcut_setColors() {
        newShortcut_Panel.setBackground(KBW_GUI.PANEL_COLOR);
        addSC_Button.setBackground(KBW_GUI.BUTTON_COLOR);
        edit_SCButton.setBackground(KBW_GUI.BUTTON_COLOR);
        return_Button.setBackground(KBW_GUI.BUTTON_COLOR);
    }

    private static void addSCButtonPress() {
        addSC_Button.addActionListener(e -> {
            addJTEXTtoSCmap();
            KBW_GUI.contentPaneLayout.show(KBW_GUI.contentPane, KBW_GUI.shortcutTable_Lable);
        });
    }

    private static void addJTEXTtoSCmap() {
        Shortcut_Map shortcut_map = Shortcut_Map.getInstance();
        String add_key = newShortcut_ShortcutKeyFeild.getText();
        String add_value = newShortcut_ShortcutValueFeild.getText();
        shortcut_map.get_Shortcut_Map().put(add_key, add_value);
        shortcut_map = Shortcut_Map.getInstance();
        // updateJTable();
    }

    private static void editSCButtonPress() {
        edit_SCButton.addActionListener(e -> {
            KBW_GUI.contentPaneLayout.show(KBW_GUI.contentPane, KBW_GUI.shortcutTable_Lable);
        });
    }

    private static void returnButtonPress() {
        return_Button.addActionListener(e -> {
            KBW_GUI.contentPaneLayout.show(KBW_GUI.contentPane, KBW_GUI.splashPage_Label);
        });
    }
}