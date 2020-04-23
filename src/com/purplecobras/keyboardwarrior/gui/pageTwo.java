package com.purplecobras.keyboardwarrior.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Color;
import com.purplecobras.keyboardwarrior.Shortcut_Map;

public abstract class pageTwo implements ActionListener {

    public static final String listLabel1 = "VALUE";
    public static final String listLabel2 = "KEY";
    public static final String returnButtonLabel = "RETURN";
    public static final String newButtonLabel = "ADD NEW";
    public static final String editButtonLabel = "EDIT SHORTCUTS";
    public static final String deleteButtonLabel = "DELETE";
    public static final String cancelButtonLabel = "CANCEL";


    static JButton new_Button = new JButton(newButtonLabel);
    static JButton edit_Button = new JButton(editButtonLabel);
    static JButton return_Button = new JButton(returnButtonLabel);
    static JButton delete_Button = new JButton(deleteButtonLabel);
    static JButton cancel_Button = new JButton(cancelButtonLabel);

    static CardLayout contentPaneLayout;
    static JPanel contentPane;


    static String list[] = { listLabel1, listLabel2 };
    static Object[][] data;
    static Shortcut_Map shortcut_map = Shortcut_Map.getInstance();
    static JTable tableList;

    public static void loadPage2(JFrame frame) {
        JPanel two = new JPanel(new GridLayout(4, 1, 10, 10));

        two.add(new JLabel("<html><font size=5>Enter The Value & Key Below</font></html>", JLabel.CENTER),
                BorderLayout.NORTH);

        JPanel center = new JPanel(new GridLayout(3, 4));
        JPanel flowLabel = new JPanel(new FlowLayout());
        flowLabel.add(new JLabel("Label:", JLabel.RIGHT));
        JTextField enterLabel = new JTextField("");
        enterLabel.setPreferredSize(new Dimension(250, 20));
        flowLabel.add(enterLabel);
        JPanel flowKey = new JPanel(new FlowLayout());
        flowKey.add(new JLabel("  Key:", JLabel.RIGHT));
        JTextField enterKey = new JTextField("");
        enterKey.setPreferredSize(new Dimension(250, 20));
        flowKey.add(enterKey);
        center.add(flowLabel);
        center.add(flowKey);
        two.add(center, BorderLayout.CENTER);
         // buttons
         JPanel twoButtons = new JPanel(new FlowLayout());
         two.add(twoButtons,BorderLayout.SOUTH);
         twoButtons.add(new_Button); twoButtons.add(edit_Button); twoButtons.add(return_Button);
         new_Button.setBackground(Color.WHITE);
         edit_Button.setBackground(Color.WHITE);
         return_Button.setBackground(Color.GRAY);
 
         new_Button.addActionListener(e -> {
             //save the data that was entered label & key <<<<<
             //display same page
             contentPaneLayout.show(contentPane, "TWO");
         });
         edit_Button.addActionListener(e -> {
             //go to view/edit page
             contentPaneLayout.show(contentPane, "THREE");
         });
         return_Button.addActionListener(e -> {
             // go to one (Main)
             contentPaneLayout.show(contentPane, "ONE");
         });

         frame.pack();
         frame.setLocationRelativeTo(null);
         frame.setSize(600, 350);
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setVisible(true);
         frame.setResizable(false);
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

    public static void updateJTable() {
        shortcut_map = Shortcut_Map.getInstance();
        Object[] key = shortcut_map.get_Shortcut_Map().keySet().toArray();
        Object[] val = shortcut_map.get_Shortcut_Map().values().toArray();
        Object[][] data = concat(key, val);
        tableList = new JTable(data, list);
        tableList.setBackground(Color.WHITE);
    }

    // public static void loadPage1() {
    // pageSetup();
    // loadButtons();
    // setColors();
    // exitPressed();
    // editPressed();
    // addPressed();
    // pageOreintation();
    // }

    // public static void pageSetup() {
    // contentPane = (JPanel) frame.getContentPane();
    // contentPane.setLayout(contentPaneLayout = new CardLayout());

    // pageOne_Panel.add(new JLabel(frameLabel, JLabel.CENTER), BorderLayout.NORTH);
    // pageOne_Panel.add(new JLabel("Exit", JLabel.CENTER), BorderLayout.SOUTH);
    // }

    // public static void setColors() {
    // pageOne_Panel.setBackground(PC_PURPLE);
    // exit_Button.setBackground(Color.GRAY);
    // add_Button.setBackground(Color.WHITE);
    // edit_Button.setBackground(Color.WHITE);
    // }

    // public static void loadButtons() {
    // JPanel pageOne_Buttons = new JPanel(new FlowLayout());

    // // buttons
    // pageOne_Panel.add(pageOne_Buttons, BorderLayout.SOUTH);
    // pageOne_Buttons.add(add_Button);
    // pageOne_Buttons.add(edit_Button);
    // // oneButtons.add(B3);
    // pageOne_Buttons.add(exit_Button);
    // }

    // public static void exitPressed() {

    // }

    // public static void addPressed() {

    // }

    // public static void editPressed() {

    // }

    // public static void pageOreintation() {
    // contentPane.add("ONE", pageOne_Panel);
    // // contentPane.add("TWO", two);
    // // contentPane.add("THREE", three);

    // // see a specific page (start)
    // contentPaneLayout.show(contentPane, "ONE");

    // frame.pack();
    // frame.setLocationRelativeTo(null);
    // frame.setSize(600, 350);
    // frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    // frame.setVisible(true);
    // frame.setResizable(false);
    // }

    // private static Object[][] concat(Object[] key, Object[] val) {
    // Object res[][] = new Object[key.length][2];
    // if (key.length != val.length) {
    // throw new IllegalArgumentException("lenght are not equal, cannot perform");
    // }
    // for (int i = 0; i < key.length; i++) {
    // res[i][0] = key[i];
    // res[i][1] = val[i];
    // }
    // return res;
    // }

    // public static void updateJTable() {
    // shortcut_map = Shortcut_Map.getInstance();
    // Object[] key = shortcut_map.get_Shortcut_Map().keySet().toArray();
    // Object[] val = shortcut_map.get_Shortcut_Map().values().toArray();
    // Object[][] data = concat(key, val);
    // tableList = new JTable(data, list);
    // tableList.setBackground(Color.WHITE);
    // }
}