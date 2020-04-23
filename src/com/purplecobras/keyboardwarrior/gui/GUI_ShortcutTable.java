package com.purplecobras.keyboardwarrior.gui;

import javax.swing.*;

import com.purplecobras.keyboardwarrior.Shortcut_Map;

import java.awt.*;
import java.awt.event.*;

public abstract class GUI_ShortcutTable implements ActionListener {
    public static final String ShortcutTable_frameLabel = "<html><font size=4>Labels + Keys List</font></html>";
    public static JPanel ShortcutTable_Panel = new JPanel(new BorderLayout());
    public static JPanel ShortcutTable_Buttons = new JPanel(new FlowLayout());
    public static final String listLabel1 = "VALUE: ";
    public static final String listLabel2 = "KEY: ";
    public static final String gridDeleteButtonLabel = "DELETE";
    public static final String gridEditButtonLabel = "EDIT";

    public static String list[] = { listLabel1, listLabel2 };
    public static JButton gridDeleteButton = new JButton(gridDeleteButtonLabel);
    public static JButton gridEditButton = new JButton(gridEditButtonLabel);
    public static JTable tableList;

    public static final String deleteButtonLabel = "DELETE";
    public static JButton delete_Button = new JButton(deleteButtonLabel);

    public static JLabel table = new JLabel(ShortcutTable_frameLabel, JLabel.CENTER);

    // private static final String shortCutTableLabel = "<html><font size=4>Labels +
    // Keys List</font></html>";
    // private static JLabel shortCut_Table = new JLabel(shortCutTableLabel,
    // JLabel.CENTER);

    static Object[] shortcutMap_Values;
    static Object[] shortcutMap_Keys;
    static Object[][] shortcutGridArray;

    public static void ShortcutTable_Setup() {

        JLabel tableLabel = new JLabel("<html><font size=4>Value & Key List</font></html>", JLabel.CENTER);
        ShortcutTable_Panel.add(tableLabel, BorderLayout.NORTH);

        Shortcut_Map shortcut_map = Shortcut_Map.getInstance();
        shortcutMap_Keys = shortcut_map.get_Shortcut_Map().keySet().toArray();
        shortcutMap_Values = shortcut_map.get_Shortcut_Map().values().toArray();
        shortcutGridArray = concat(shortcutMap_Keys, shortcutMap_Values);
        tableList = new JTable(shortcutGridArray, list);
        JScrollPane tmp = new JScrollPane(tableList);
        JScrollPane tmp2 = new JScrollPane();
        tmp2.setViewport(tmp.getViewport());
        ShortcutTable_Panel.add(tmp2, BorderLayout.CENTER);

        ShortcutTable_loadButtons();
        ShortcutTable_setColors();
        gridDeleteButtonPress();
        gridEditButtonPress();
    }

    private static void ShortcutTable_setColors() {

        gridEditButton.setBackground(KBW_GUI.BUTTON_COLOR);
        gridDeleteButton.setBackground(KBW_GUI.BUTTON_COLOR);
    }

    private static void ShortcutTable_loadButtons() {
        ShortcutTable_Panel.add(ShortcutTable_Buttons, BorderLayout.SOUTH);
        ShortcutTable_Buttons.add(gridEditButton);
        ShortcutTable_Buttons.add(gridDeleteButton);
    }

    private static void gridDeleteButtonPress() {
        delete_Button.addActionListener(e -> {
            KBW_GUI.contentPaneLayout.show(KBW_GUI.contentPane, KBW_GUI.shortcutTable_Lable);

        });
    }

    private static void gridEditButtonPress() {
        gridDeleteButton.addActionListener(e -> {
            KBW_GUI.contentPaneLayout.show(KBW_GUI.contentPane, KBW_GUI.shortcutTable_Lable);
        });
    }

    private static void updateJTable() {
        table.invalidate();

        Shortcut_Map shortcut_map = Shortcut_Map.getInstance();
        shortcutMap_Keys = shortcut_map.get_Shortcut_Map().keySet().toArray();
        shortcutMap_Values = shortcut_map.get_Shortcut_Map().values().toArray();
        shortcutGridArray = concat(shortcutMap_Keys, shortcutMap_Values);
        tableList = new JTable(shortcutGridArray, list);
        JScrollPane tmp = new JScrollPane(tableList);
        JScrollPane tmp2 = new JScrollPane();
        tmp2.setViewport(tmp.getViewport());
        ShortcutTable_Panel.add(tmp2, BorderLayout.CENTER);
    }

    private static Object[][] concat(Object[] key, Object[] val) {
        Object res[][] = new Object[key.length][2];
        if (key.length != val.length) {
            throw new IllegalArgumentException("lenght are not equal, cannot perform");
        }
        for (int i = 0; i < key.length; i++) {
            res[i][0] = key[i];
            res[i][1] = val[i];
        }
        return res;
    }

}