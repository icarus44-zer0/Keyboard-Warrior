package com.purplecobras.keyboardwarrior.gui;

import javax.swing.*;

import com.purplecobras.keyboardwarrior.Shortcut_Map;

import java.awt.*;
import java.awt.event.*;
import java.awt.Color;

public abstract class GUI implements ActionListener {
    static JFrame frame;
    static CardLayout contentPaneLayout;
    static JPanel contentPane;
    static JPanel one;
    static JPanel two;
    static JPanel three;
    static String list[] = { "Label", "Key" };
    static Color white;
    static Color gray;
    static Color purple;
    static JButton goTo_Page2_Button;
    static JButton view_List_Button;
    static JButton view_Button;
    static JButton exit_Button;
    static JButton add_Button;
    static JButton edit_Button;
    static  JButton cancel_Button;
    static JButton delete_Button;
    static JButton return_Button;
    static JTable tableList;
    static Shortcut_Map shortcut_map;

    public static void setup() {
        one = new JPanel(new BorderLayout());
        two =  new JPanel(new GridLayout(4, 1, 10, 10));     
        three = new JPanel(new BorderLayout());
        white = new Color(255, 255, 255);
        gray = new Color(187, 189, 180);
        purple = new Color(102, 0, 200);
        goTo_Page2_Button = new JButton(" ADD ");
        view_List_Button = new JButton("View/EDIT");
        view_Button = new JButton("VIEW");
        exit_Button = new JButton("EXIT");
        add_Button = new JButton("ADD");
        edit_Button = new JButton("EDIT");
        cancel_Button = new JButton("CANCEL/EXIT");
        delete_Button = new JButton("DELETE");
        return_Button = new JButton("RETURN");
        shortcut_map = Shortcut_Map.getInstance();
        page1();
        page2();
        page3();
        
        contentPane.add("ONE", one);
        contentPane.add("TWO", two);
        contentPane.add("THREE", three);
        contentPaneLayout.show(contentPane, "ONE");
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setSize(600, 350);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setResizable(false);
    }

    private static void page1() {

        // one = new JPanel(new BorderLayout());
        one.add(new JLabel("<html><font size=5>INTRO</font></html>", JLabel.CENTER), BorderLayout.NORTH);
        one.add(new JLabel("exit", JLabel.CENTER), BorderLayout.SOUTH);
        JPanel page_one_Buttons = new JPanel(new FlowLayout());

        // buttons
        one.add(page_one_Buttons, BorderLayout.SOUTH);
        page_one_Buttons.add(goTo_Page2_Button);
        page_one_Buttons.add(view_List_Button);
        // oneButtons.add(B3);
        page_one_Buttons.add(exit_Button);

        // play with colors ---------------------
        one.setBackground(purple);
        exit_Button.setBackground(gray);
        goTo_Page2_Button.setBackground(white);
        view_List_Button.setBackground(white);
        // -------------------------------------

        goTo_Page2_Button.addActionListener(e -> {
            // go to two
            contentPaneLayout.show(contentPane, "TWO");
        });
        view_List_Button.addActionListener(e -> {
            contentPaneLayout.show(contentPane, "THREE");

        });
        /*
         * B3.addActionListener(e -> { //go to four });
         */
        exit_Button.addActionListener(e -> {
            frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING));
        });

    }

    private static void page2() {
        // two = new JPanel(new GridLayout(4, 1, 10, 10));
        two.add(new JLabel("<html><font size=5>Enter The Label & Key Below</font></html>", JLabel.CENTER),
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
        two.add(twoButtons, BorderLayout.SOUTH);
        twoButtons.add(add_Button);
        twoButtons.add(edit_Button);
        twoButtons.add(cancel_Button);
        add_Button.setBackground(white);
        edit_Button.setBackground(white);
        cancel_Button.setBackground(gray);

        add_Button.addActionListener(e -> {
            shortcut_map = Shortcut_Map.getInstance();
            shortcut_map.put(enterKey.toString(), enterLabel.toString());

            contentPaneLayout.show(contentPane, "TWO");
        });
        edit_Button.addActionListener(e -> {
            // go to view/edit page
            contentPaneLayout.show(contentPane, "THREE");
        });
        cancel_Button.addActionListener(e -> {
            // go to one (Main)
            contentPaneLayout.show(contentPane, "ONE");
        });

    }

    private static void page3() {
        JLabel table = new JLabel("<html><font size=4>Labels + Keys List</font></html>", JLabel.CENTER);
        three.add(table, BorderLayout.NORTH);

        // get the saved data to displaly <<<<
        // data test----------------------------------
        Object[][] data = { { "java", "j" }, { "Pink Cobras", "pc" }, { "GoodMorning", "gm" }, { "january", "jan" },
                { "you", "u" }, { "to be", "2b" }, { "at the moment", "atm" } };
        // -------------------------------------------

        JTable Shortcut_tableList = new JTable(data, list);
        Shortcut_tableList.setBackground(white);
        JScrollPane tmp = new JScrollPane(Shortcut_tableList);
        JScrollPane tmp2 = new JScrollPane();
        tmp2.setViewport(tmp.getViewport());
        three.add(tmp2, BorderLayout.CENTER);

        // buttons
        JPanel page_threeButtons = new JPanel(new FlowLayout());
        three.add(page_threeButtons, BorderLayout.SOUTH);
        page_threeButtons.add(delete_Button);
        page_threeButtons.add(return_Button);
        delete_Button.setBackground(white);
        return_Button.setBackground(gray);

        delete_Button.addActionListener(e -> {
            // go to the edit page
            contentPaneLayout.show(contentPane, "THREE");

        });
        return_Button.addActionListener(e -> {
            // go to one (Main)
            contentPaneLayout.show(contentPane, "ONE");
        });

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub

    }

    // private static Object[][] concat(Object[] key, Object[] val) {
    //     Object res[][] = new Object[key.length][2];
    //     if (key.length != val.length) {
    //         throw new IllegalArgumentException("lenght are not equal, cannot perform");
    //     }
    //     for (int i = 0; i < key.length; i++) {
    //         res[i][0] = key[i];
    //         res[i][1] = val[i];
    //     }
    //     return res;
    // }

    // public static void updateJTable() {
    //     shortcut_map = Shortcut_Map.getInstance();
    //     Object[] key = shortcut_map.get_Shortcut_Map().keySet().toArray();
    //     Object[] val = shortcut_map.get_Shortcut_Map().values().toArray();
    //     Object[][] data = concat(key, val);
    //     tableList = new JTable(data, list);
    //     tableList.setBackground(white);
    // }

    // @Override
    // public void actionPerformed(ActionEvent e) {
    //     // TODO Auto-generated method stub

    // }
}