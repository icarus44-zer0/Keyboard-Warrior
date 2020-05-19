package com.purplecobras.keyboardwarrior.gui.v1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import com.purplecobras.keyboardwarrior.ShortcutMap;


public abstract class GUI_NewShortcut implements ActionListener {

    private static final String newShortcut_frameLabel = "<html><font size=5>Enter new key and value</font></html>";
    
    private static final String returnButtonLabel = "RETURN";
    private static final String addSCButtonLabel = "+";

    private static final String editSCButtonLabel = "EDIT SHORTCUTS";

    private static JButton addSC_Button = new JButton(addSCButtonLabel);
    private static JButton edit_SCButton = new JButton(editSCButtonLabel);
    private static JButton return_Button = new JButton(returnButtonLabel);


    private static JPanel newShortcut_Center = new JPanel(new GridLayout(3, 4));
    private static JPanel newShortcut_FlowLabel = new JPanel(new FlowLayout());
    private static JTextField newShortcut_ShortcutKeyFeild = new JTextField("");
    private static JPanel newShortcut_flowKey = new JPanel(new FlowLayout());
    private static JPanel newShortcut_Buttons = new JPanel(new FlowLayout());
    private static JTextField newShortcut_ShortcutValueFeild = new JTextField("");

    public static JPanel newShortcut_Panel = new JPanel(new GridLayout(4, 1, 10, 10));

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
        //newShortcut_Buttons.add(edit_SCButton);
        newShortcut_Buttons.add(return_Button);

    }

    private static void newShortcut_setColors() {
        newShortcut_Panel.setBackground(GUI_KBW.PANEL_COLOR);
        addSC_Button.setBackground(GUI_KBW.BUTTON_COLOR);
        edit_SCButton.setBackground(GUI_KBW.BUTTON_COLOR);
        return_Button.setBackground(GUI_KBW.BUTTON_COLOR);
        newShortcut_Center.setBackground(GUI_KBW.PANEL_COLOR);
        newShortcut_FlowLabel.setBackground(GUI_KBW.PANEL_COLOR);
        newShortcut_Buttons.setBackground(GUI_KBW.PANEL_COLOR);
        newShortcut_flowKey.setBackground(GUI_KBW.PANEL_COLOR);
    }

    private static void addSCButtonPress() {
        addSC_Button.addActionListener(e -> {
            addNewSCtoSC_MAP();
            updateShortcutSerFile();
            newShortcut_ShortcutKeyFeild.setText("");
            newShortcut_ShortcutValueFeild.setText("");
            GUI_ShortcutTable.updateJTable();
            GUI_KBW.contentPaneLayout.show(GUI_KBW.contentPane, GUI_KBW.shortcutTable_Lable);
        });
    }

    private static void updateShortcutSerFile() {
        ShortcutMap shortcut_map = ShortcutMap.getInstance();
        shortcut_map.updateShortcutSerFile();

    }

    private static void addNewSCtoSC_MAP() {
        ShortcutMap shortcut_map = ShortcutMap.getInstance();
        String add_key = newShortcut_ShortcutKeyFeild.getText();
        String add_value = newShortcut_ShortcutValueFeild.getText();
        shortcut_map.get_Shortcut_Map().put(add_key, add_value);
    }

    private static void editSCButtonPress() {
        edit_SCButton.addActionListener(e -> {
            GUI_KBW.contentPaneLayout.show(GUI_KBW.contentPane, GUI_KBW.shortcutTable_Lable);
        });
    }

    private static void returnButtonPress() {
        return_Button.addActionListener(e -> {
            GUI_KBW.contentPaneLayout.show(GUI_KBW.contentPane, GUI_KBW.shortcutTable_Lable);
        });
    }
}