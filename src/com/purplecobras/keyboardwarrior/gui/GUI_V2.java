package com.purplecobras.keyboardwarrior.gui;

import javax.swing.*;

import com.purplecobras.keyboardwarrior.Shortcut_Map;
import com.purplecobras.keyboardwarrior.dev.HashMap_File_Writer;
import com.purplecobras.keyboardwarrior.dev.Ser_File_Lib;

import java.awt.*;
import java.awt.event.*;
import java.awt.Color;

public abstract class GUI_V2 implements ActionListener {

    // ---- NEEDED BY ALL ----
    public static final String p1Name = "PAGE ONE";
    public static final String p2Name = "PAGE TWO";
    //public static final String pageThreeName = "PAGE THREE";
    public static final String p4Name = "PAGE FOUR";

    public static final Color PC_PURPLE = new Color(102, 0, 200);

    static CardLayout contentPaneLayout;

    // ---- PAGE ONE : SPLASH SCREEN ----

    public static final String p1_frameLabel = "<html><font size=5>Keyboard Shortcut</font></html>";
    public static final String appNameLabel = "Keyboard Warrior";
    public static final String addButtonLabel = "ADD";
    public static final String editButtonLabel = "EDIT";
    public static final String exitButtonLabel = "EXIT";

    static JButton add_Button = new JButton(addButtonLabel);
    static JButton edit_Button = new JButton(editButtonLabel);
    static JButton exit_Button = new JButton(exitButtonLabel);

    static JPanel p1_Panel = new JPanel(new BorderLayout());
    static JPanel p1_Buttons = new JPanel(new FlowLayout());
    static JPanel contentPane;

    static JFrame frame = new JFrame(appNameLabel);

    // ---- PAGE TWO : ADD NEW SHORTCUT----

    private static final String p2_frameLabel = "<html><font size=5>Enter The Value & Key Below</font></html>";
    private static final String returnButtonLabel = "RETURN";
    private static final String addSCButtonLabel = "ADD SHORTCUT";
    private static final String editSCButtonLabel = "EDIT SHORTCUTS";
    private static final String deleteButtonLabel = "DELETE";
    //private static final String cancelButtonLabel = "CANCEL";

    private static JButton addSC_Button = new JButton(addSCButtonLabel);
    private static JButton edit_SCButton = new JButton(editSCButtonLabel);
    private static JButton return_Button = new JButton(returnButtonLabel);
    private static JButton delete_Button = new JButton(deleteButtonLabel);
    //private static JButton cancel_Button = new JButton(cancelButtonLabel);

    private static JPanel p2_Panel = new JPanel(new GridLayout(4, 1, 10, 10));
    private static JPanel p2_Center = new JPanel(new GridLayout(3, 4));
    private static JPanel p2_FlowLabel = new JPanel(new FlowLayout());
    private static JTextField p2_ShortcutKeyFeild = new JTextField("");
    private static JPanel p2_flowKey = new JPanel(new FlowLayout());

    private static JPanel p2_Buttons = new JPanel(new FlowLayout());
    private static JTextField p2_ShortcutValueFeild = new JTextField("");

    // ----- PAGE FOUR : GRID -----

    private static JPanel p4_Panel = new JPanel(new BorderLayout());
    private static JPanel p4_Buttons = new JPanel(new FlowLayout());

    private static final String listLabel2 = "Text Replacement: ";
    private static final String listLabel1 = "Shortcut Key: ";

    private static final String gridDeleteButtonLabel = "DELETE";
    private static final String gridEditButtonLabel = "EDIT";

    private static String list[] = { listLabel1, listLabel2 };

    private static JButton gridDeleteButton = new JButton(gridDeleteButtonLabel);
    private static JButton gridEditButton = new JButton(gridEditButtonLabel);
    private static JTable tableList;
    private static Shortcut_Map shortcut_map;

   // private static final String shortCutTableLabel = "<html><font size=4>Labels + Keys List</font></html>";
   // private static JLabel shortCut_Table = new JLabel(shortCutTableLabel, JLabel.CENTER);

    static Object[] shortcutMap_Values;
    static Object[] shortcutMap_Keys;
    static Object[][] shortcutGridArray;

    public static void init() {

        // page1
        p1_Setup();

        // page2
        p2_Setup();

        // page4 // grid

        p4_Setup();

        // final 
        pageConfig();
    }

    private static void p1_Setup() {
        contentPane = (JPanel) frame.getContentPane();
        contentPane.setLayout(contentPaneLayout = new CardLayout());

        p1_Panel.add(new JLabel(p1_frameLabel, JLabel.CENTER), BorderLayout.NORTH);
        p1_Panel.add(new JLabel("Exit", JLabel.CENTER), BorderLayout.SOUTH);

        p1_loadButtons();
        p1_setColors();
        exitPressed();
        editPressed();
        addPressed();
    }

    private static void p1_setColors() {
        p1_Panel.setBackground(PC_PURPLE);
        exit_Button.setBackground(Color.GRAY);
        add_Button.setBackground(Color.GRAY);
        edit_Button.setBackground(Color.GRAY);
    }

    private static void p1_loadButtons() {
        p1_Panel.add(p1_Buttons, BorderLayout.SOUTH);
        p1_Buttons.add(add_Button);
        p1_Buttons.add(edit_Button);
        p1_Buttons.add(exit_Button);

    }

    private static void exitPressed() {
        exit_Button.addActionListener(e -> {
            HashMap_File_Writer.hashMap_Out(shortcut_map.get_Shortcut_Map(), Ser_File_Lib.SF1);
            frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING));
        });
    }

    private static void addPressed() {
        add_Button.addActionListener(e -> {
            contentPaneLayout.show(contentPane, p2Name);
        });
    }

    private static void editPressed() {
        edit_Button.addActionListener(e -> {
            contentPaneLayout.show(contentPane, p4Name);
        });
    }

    /**
     * 
     * 
     * ////// PAGE TWO ////////
     * 
     * 
     */

    private static void p2_Setup() {
        p2_Panel.add(new JLabel(p2_frameLabel, JLabel.CENTER), BorderLayout.NORTH);
        p2_FlowLabel.add(new JLabel("Hot Key", JLabel.CENTER));
        p2_ShortcutValueFeild.setPreferredSize(new Dimension(250,20));
        p2_FlowLabel.add(p2_ShortcutValueFeild);
        p2_flowKey.add(new JLabel("Text ", JLabel.CENTER));
        p2_ShortcutKeyFeild.setPreferredSize(new Dimension(250,20));
        p2_flowKey.add(p2_ShortcutKeyFeild);
        p2_Center.add(p2_FlowLabel);
        p2_Center.add(p2_flowKey);
        p2_Panel.add(p2_Center, BorderLayout.CENTER);

        p2_loadButtons();
        p2_setColors();
        addSCButtonPress();
        editSCButtonPress();
        returnButtonPress();
    }

    private static void p2_loadButtons() {
        p2_Panel.add(p2_Buttons, BorderLayout.SOUTH);
        p2_Buttons.add(addSC_Button);
        p2_Buttons.add(edit_SCButton);
        p2_Buttons.add(return_Button);

    }

    private static void p2_setColors() {
        p2_Panel.setBackground(Color.GRAY);
        addSC_Button.setBackground(Color.GRAY);
        edit_SCButton.setBackground(Color.GRAY);
        return_Button.setBackground(Color.GRAY);
    }

    private static void addSCButtonPress() {
        addSC_Button.addActionListener(e -> {
            String key = p2_ShortcutKeyFeild.getText();
            String value  = p2_ShortcutValueFeild.getText();
            shortcut_map.put(key, value);
            updateJTable();
            contentPaneLayout.show(contentPane, p4Name);
        });
    }

    private static void editSCButtonPress() {
        edit_Button.addActionListener(e -> {
            contentPaneLayout.show(contentPane, p4Name);
        });
    }

    private static void returnButtonPress() {
        return_Button.addActionListener(e -> {
            contentPaneLayout.show(contentPane, p1Name);
        });
    }

    /**
     * 
     * 
     * ////// PAGE FOUR: GRID /////////
     * 
     * we dont talk about page three
     */

    private static void p4_Setup() {

        JLabel table = new JLabel("<html><font size=4>Labels + Keys List</font></html>", JLabel.CENTER);
        p4_Panel.add(table, BorderLayout.NORTH);

        shortcut_map = Shortcut_Map.getInstance();
        shortcutMap_Keys = shortcut_map.get_Shortcut_Map().keySet().toArray();
        shortcutMap_Values = shortcut_map.get_Shortcut_Map().values().toArray();
        shortcutGridArray = concat(shortcutMap_Keys, shortcutMap_Values);
        tableList = new JTable(shortcutGridArray,list);

        tableList.setBackground(Color.WHITE);
        JScrollPane tmp = new JScrollPane(tableList);
        JScrollPane tmp2 = new JScrollPane();
        tmp2.setViewport(tmp.getViewport());
        p4_Panel.add(tmp2, BorderLayout.CENTER);

        p4_loadButtons();
        p4_setColors();
        gridDeleteButtonPress();
        gridEditButtonPress();
    }

    private static void p4_setColors() {

        gridEditButton.setBackground(Color.WHITE);
        gridDeleteButton.setBackground(Color.WHITE);
    }

    private static void p4_loadButtons() {
        p4_Panel.add(p4_Buttons, BorderLayout.SOUTH);
        p4_Buttons.add(gridEditButton);
        p4_Buttons.add(gridDeleteButton);
    }

    private static void gridDeleteButtonPress() {
        delete_Button.addActionListener(e -> {
            contentPaneLayout.show(contentPane, p4Name);

        });
    }

    private static void gridEditButtonPress() {
        gridDeleteButton.addActionListener(e -> {
            contentPaneLayout.show(contentPane, p4Name);
        });
    }

    private static void updateJTable() {
        // shortcut_map = Shortcut_Map.getInstance();
        // shortcutMap_Keys = shortcut_map.get_Shortcut_Map().keySet().toArray();
        // shortcutMap_Values = shortcut_map.get_Shortcut_Map().values().toArray();
        // shortcutGridArray = concat(shortcutMap_Keys, shortcutMap_Values);
        // tableList = new JTable(shortcutGridArray,list);
        p4_Setup();
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

    private static void pageConfig() {
        contentPane.add(p1Name, p1_Panel);
        contentPane.add(p2Name, p2_Panel);
        // contentPane.add(pageThreeName, pageThree_Panel);
        contentPane.add(p4Name, p4_Panel);

        // see a specific page (start)
        contentPaneLayout.show(contentPane, p1Name);
        // contentPaneLayout.show(contentPane, p2Name);
        // contentPaneLayout.show(contentPane, p4Name);

        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setSize(600, 350);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setResizable(false);
    }
}