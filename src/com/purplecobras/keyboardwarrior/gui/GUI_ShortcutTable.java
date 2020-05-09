package com.purplecobras.keyboardwarrior.gui;

import javax.swing.*;

import com.purplecobras.keyboardwarrior.Shortcut_Map;

import java.awt.*;
import java.awt.event.*;

public abstract class GUI_ShortcutTable implements ActionListener {

    private static final String listLabel1 = "Key: ";
    private static final String listLabel2 = "Value: ";
    public static String list[] = { listLabel1, listLabel2 };
    private static final String gridDeleteButtonLabel = "DELETE";
    private static final String gridEditButtonLabel = "EDIT";
    private static final String deleteButtonLabel = "DELETE";
    private static final String returnButtonLabel = "RETURN";
    public static JPanel ShortcutTable_Panel = new JPanel(new BorderLayout());
    public static JPanel ShortcutTable_Buttons = new JPanel(new FlowLayout());
    private static JButton gridDeleteButton = new JButton(gridDeleteButtonLabel);
    private static JButton gridEditButton = new JButton(gridEditButtonLabel);
    private static JButton delete_Button = new JButton(deleteButtonLabel);
    private static JButton return_button = new JButton(returnButtonLabel);
    private static JTable tableList;
    private static GUI_TableModel shortcutTableModel = new GUI_TableModel() 
        {private static final long serialVersionUID = 1L;};
    private static Object[] shortcutMap_Values;
    private static Object[] shortcutMap_Keys;
    private static Object[][] shortcutGridArray;

    /**
     * 
     */
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
        returnButtonPress();
    }

    /**
     * 
     */
    private static void ShortcutTable_setColors() {

        gridEditButton.setBackground(GUI_KBW.BUTTON_COLOR);
        gridDeleteButton.setBackground(GUI_KBW.BUTTON_COLOR);
        return_button.setBackground(GUI_KBW.BUTTON_COLOR);

    }

    /**
     * 
     */
    private static void ShortcutTable_loadButtons() {
        ShortcutTable_Panel.add(ShortcutTable_Buttons, BorderLayout.SOUTH);
        ShortcutTable_Buttons.add(gridEditButton);
        ShortcutTable_Buttons.add(gridDeleteButton);
        ShortcutTable_Buttons.add(return_button);

    }

    /**
     * 
     */
    private static void gridDeleteButtonPress() {
        delete_Button.addActionListener(e -> {
            GUI_KBW.contentPaneLayout.show(GUI_KBW.contentPane, GUI_KBW.shortcutTable_Lable);

        });
    }

    /**
     * 
     */
    private static void gridEditButtonPress() {
        gridDeleteButton.addActionListener(e -> {
            GUI_KBW.contentPaneLayout.show(GUI_KBW.contentPane, GUI_KBW.shortcutTable_Lable);
        });
    }

    /**
     * 
     */
    private static void returnButtonPress() {
        return_button.addActionListener(e -> {
            GUI_KBW.contentPaneLayout.show(GUI_KBW.contentPane, GUI_KBW.newShortcutPage_Label);
        });
    }

    /**
     * 
     */
    public static void updateJTable() {
        Shortcut_Map shortcut_map = Shortcut_Map.getInstance();
        shortcutMap_Keys = shortcut_map.get_Shortcut_Map().keySet().toArray();
        shortcutMap_Values = shortcut_map.get_Shortcut_Map().values().toArray();
        shortcutGridArray = concat(shortcutMap_Keys, shortcutMap_Values);
        shortcutTableModel.setData(shortcutGridArray);
        tableList.setModel(shortcutTableModel);
    }

    /**
     * 
     * @param key
     * @param val
     * @return
     */
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