package com.purplecobras.keyboardwarrior.gui;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import com.purplecobras.keyboardwarrior.Shortcut_Map;


public abstract class GUI_ShortcutTable implements ActionListener {

    private static final String listLabel1 = "Key: ";
    private static final String listLabel2 = "Value: ";
    public static String list[] = { listLabel1, listLabel2 };

    private static final String deleteButton_Label = "-";
    private static final String addButton_Label = "+";
    private static final String editButton_Label = "EDIT";

    private static JButton deleteButton = new JButton(deleteButton_Label);
    private static JButton addButton = new JButton(addButton_Label);
    private static JButton editButton = new JButton(editButton_Label);

    public static JPanel ShortcutTable_Panel = new JPanel(new BorderLayout());
    public static JPanel ShortcutTable_Buttons = new JPanel(new FlowLayout());

  

    private static JTable tableList;
    private static GUI_TableModel shortcutTableModel = new GUI_TableModel() {
        private static final long serialVersionUID = 1L;
    };
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
        deleteButton_Press();
        editButton_Press();
        addButton_Press();
    }

    /**
     * 
     */
    private static void ShortcutTable_setColors() {
        editButton.setBackground(GUI_KBW.BUTTON_COLOR);
        deleteButton.setBackground(GUI_KBW.BUTTON_COLOR);
        addButton.setBackground(GUI_KBW.BUTTON_COLOR);

    }

    /**
     * 
     */
    private static void ShortcutTable_loadButtons() {
        ShortcutTable_Panel.add(ShortcutTable_Buttons, BorderLayout.SOUTH);
        ShortcutTable_Buttons.add(addButton);
        ShortcutTable_Buttons.add(deleteButton);
        ShortcutTable_Buttons.add(editButton);
    }

    /**
     * 
     */
    private static void deleteButton_Press() {
        deleteButton.addActionListener(e -> {
            deleteFromSCMAP();
            GUI_KBW.contentPaneLayout.show(GUI_KBW.contentPane, GUI_KBW.shortcutTable_Lable);

        });
    }

    /**
     * 
     */
    private static void deleteFromSCMAP() {
           int row = tableList.getSelectedRow();
           Object keyRemove = tableList.getValueAt(row, 0);
           Object valueRemove = tableList.getValueAt(row, 1);
           Shortcut_Map scm = Shortcut_Map.getInstance();
           if (displayDeleteMessage(valueRemove)==0){
            scm.get_Shortcut_Map().remove(keyRemove);
            scm.updateShortcutSerFile();
            updateJTable();
           }

           //displayDeleteMessage(valueRemove);
    }

    private static int displayDeleteMessage(Object valueRemove) {
        JFrame scDeletedPopUpFrame = new JFrame();
        int value = JOptionPane.showConfirmDialog(scDeletedPopUpFrame, valueRemove , "Remove", JOptionPane.YES_NO_OPTION);
        //JOptionPane.showMessageDialog(scRemovedPopUp, valueRemove.toString() + "\nShortcut Removed");
        return value;
    }

    /**
     * 
     */
    private static void editButton_Press() {
        deleteButton.addActionListener(e -> {
            GUI_KBW.contentPaneLayout.show(GUI_KBW.contentPane, GUI_KBW.shortcutTable_Lable);
        });
    }

    /**
     * 
     */
    private static void addButton_Press() {
        addButton.addActionListener(e -> {
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