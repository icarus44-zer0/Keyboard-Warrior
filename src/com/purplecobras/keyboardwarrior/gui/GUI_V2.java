package com.purplecobras.keyboardwarrior.gui;

import javax.swing.*;

import com.purplecobras.keyboardwarrior.Shortcut_Map;

import java.awt.*;
import java.awt.event.*;
import java.awt.Color;

public abstract class GUI_V2 implements ActionListener {

    // ---- NEEDED BY ALL ----
    public static final String pageOneName = "PAGE ONE";
    public static final String pageTwoName = "PAGE TWO";
    //public static final String pageThreeName = "PAGE THREE";
    public static final String pageFourName = "PAGE FOUR";

    public static final Color PC_PURPLE = new Color(102, 0, 200);

    static CardLayout contentPaneLayout;

    // ---- PAGE ONE ----

    public static final String p1_frameLabel = "<html><font size=5>Keyboard Shortcut</font></html>";
    public static final String appNameLabel = "Keyboard Warrior";
    public static final String addButtonLabel = "ADD";
    public static final String editButtonLabel = "EDIT";
    public static final String exitButtonLabel = "EXIT";

    static JButton add_Button = new JButton(addButtonLabel);
    static JButton edit_Button = new JButton(editButtonLabel);
    static JButton exit_Button = new JButton(exitButtonLabel);

    static JPanel pageOne_Panel = new JPanel(new BorderLayout());
    static JPanel pageOne_Buttons = new JPanel(new FlowLayout());
    static JPanel contentPane;

    static JFrame frame = new JFrame(appNameLabel);

    // ---- PAGE TWO ----

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

    private static JPanel pageTwo_Panel = new JPanel(new GridLayout(4, 1, 10, 10));
    private static JPanel pageTwo_Center = new JPanel(new GridLayout(3, 4));
    private static JPanel pageTwo_FlowLabel = new JPanel(new FlowLayout());
    private static JTextField pageTwo_enterKey = new JTextField("");
    private static JPanel pageTWO_flowKey = new JPanel(new FlowLayout());

    private static JPanel pageTwo_Buttons = new JPanel(new FlowLayout());
    private static JTextField pageTwo_enterLabel = new JTextField("");

    // ----- PAGE FOUR : GRID -----

    private static JPanel pageFour_Panel = new JPanel(new BorderLayout());
    private static JPanel pageFour_Buttons = new JPanel(new FlowLayout());

    private static final String listLabel1 = "VALUE: ";
    private static final String listLabel2 = "KEY: ";

    private static final String gridDeleteButtonLabel = "DELETE";
    private static final String gridEditButtonLabel = "EDIT";

    private static String list[] = { listLabel1, listLabel2 };

    private static JButton gridDeleteButton = new JButton(gridDeleteButtonLabel);
    private static JButton gridEditButton = new JButton(gridEditButtonLabel);

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

        pageOne_Panel.add(new JLabel(p1_frameLabel, JLabel.CENTER), BorderLayout.NORTH);
        pageOne_Panel.add(new JLabel("Exit", JLabel.CENTER), BorderLayout.SOUTH);

        p1_loadButtons();
        p1_setColors();
        exitPressed();
        editPressed();
        addPressed();
    }

    private static void p1_setColors() {
        pageOne_Panel.setBackground(PC_PURPLE);
        exit_Button.setBackground(Color.GRAY);
        add_Button.setBackground(Color.GRAY);
        edit_Button.setBackground(Color.GRAY);
    }

    private static void p1_loadButtons() {
        pageOne_Panel.add(pageOne_Buttons, BorderLayout.SOUTH);
        pageOne_Buttons.add(add_Button);
        pageOne_Buttons.add(edit_Button);
        pageOne_Buttons.add(exit_Button);

    }

    private static void exitPressed() {
        exit_Button.addActionListener(e -> {
            frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING));
        });
    }

    private static void addPressed() {
        add_Button.addActionListener(e -> {
            contentPaneLayout.show(contentPane, pageTwoName);
        });
    }

    private static void editPressed() {
        edit_Button.addActionListener(e -> {
            contentPaneLayout.show(contentPane, pageFourName);
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
        pageTwo_Panel.add(new JLabel(p2_frameLabel, JLabel.CENTER), BorderLayout.NORTH);
        pageTwo_FlowLabel.add(new JLabel("Value:", JLabel.RIGHT));
        pageTwo_enterLabel.setPreferredSize(new Dimension(250,20));
        pageTwo_FlowLabel.add(pageTwo_enterLabel);
        pageTWO_flowKey.add(new JLabel("  Key:", JLabel.RIGHT));
        pageTwo_enterKey.setPreferredSize(new Dimension(250,20));
        pageTWO_flowKey.add(pageTwo_enterKey);
        pageTwo_Center.add(pageTwo_FlowLabel);
        pageTwo_Center.add(pageTWO_flowKey);
        pageTwo_Panel.add(pageTwo_Center, BorderLayout.CENTER);

        p2_loadButtons();
        p2_setColors();
        addSCButtonPress();
        editSCButtonPress();
        returnButtonPress();
    }

    private static void p2_loadButtons() {
        pageTwo_Panel.add(pageTwo_Buttons, BorderLayout.SOUTH);
        pageTwo_Buttons.add(addSC_Button);
        pageTwo_Buttons.add(edit_SCButton);
        pageTwo_Buttons.add(return_Button);

    }

    private static void p2_setColors() {
        pageTwo_Panel.setBackground(Color.GRAY);
        addSC_Button.setBackground(Color.GRAY);
        edit_SCButton.setBackground(Color.GRAY);
        return_Button.setBackground(Color.GRAY);
    }

    private static void addSCButtonPress() {
        addSC_Button.addActionListener(e -> {
            contentPaneLayout.show(contentPane, pageFourName);
        });
    }

    private static void editSCButtonPress() {
        edit_Button.addActionListener(e -> {
            contentPaneLayout.show(contentPane, pageFourName);
        });
    }

    private static void returnButtonPress() {
        return_Button.addActionListener(e -> {
            contentPaneLayout.show(contentPane, pageOneName);
        });
    }

    /**
     * 
     * 
     * ////// PAGE FOUR: GRID /////////
     * 
     * 
     */

    private static void p4_Setup() {

        JLabel table = new JLabel("<html><font size=4>Labels + Keys List</font></html>", JLabel.CENTER);
        pageFour_Panel.add(table, BorderLayout.NORTH);
        updateJTable();

        JTable tableList = new JTable(shortcutGridArray, list);
        tableList.setBackground(Color.WHITE);
        JScrollPane tmp = new JScrollPane(tableList);
        JScrollPane tmp2 = new JScrollPane();
        tmp2.setViewport(tmp.getViewport());
        pageFour_Panel.add(tmp2, BorderLayout.CENTER);

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
        pageFour_Panel.add(pageFour_Buttons, BorderLayout.SOUTH);
        pageFour_Buttons.add(gridEditButton);
        pageFour_Buttons.add(gridDeleteButton);
    }

    private static void gridDeleteButtonPress() {
        delete_Button.addActionListener(e -> {
            contentPaneLayout.show(contentPane, pageFourName);

        });
    }

    private static void gridEditButtonPress() {
        gridDeleteButton.addActionListener(e -> {
            contentPaneLayout.show(contentPane, pageFourName);
        });
    }

    private static void updateJTable() {
        Shortcut_Map shortcut_map = Shortcut_Map.getInstance();
        shortcutMap_Keys = shortcut_map.get_Shortcut_Map().keySet().toArray();
        shortcutMap_Values = shortcut_map.get_Shortcut_Map().values().toArray();
        shortcutGridArray = concat(shortcutMap_Keys, shortcutMap_Values);
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
        contentPane.add(pageOneName, pageOne_Panel);
        contentPane.add(pageTwoName, pageTwo_Panel);
        // contentPane.add(pageThreeName, pageThree_Panel);
        contentPane.add(pageFourName, pageFour_Panel);

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