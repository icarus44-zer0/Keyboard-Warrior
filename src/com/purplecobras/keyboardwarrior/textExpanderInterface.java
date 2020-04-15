package com.purplecobras.keyboardwarrior;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionListener;
import java.awt.Color;

public abstract class textExpanderInterface implements ActionListener{
    static CardLayout contentPaneLayout;
    static JPanel contentPane;
    static String list[] = {"Label", "Key"};

    static JButton B1 = new JButton("ADD");
    static JButton B2 = new JButton("View/EDIT");
    //static JButton B3 = new JButton("VIEW");
    static JButton B4 = new JButton("EXIT");
    static JButton B5 = new JButton("ADD");
    static JButton B6 = new JButton("EDIT");
    static JButton B7 = new JButton("CANCEL/EXIT");
    static JButton B8 = new JButton("DELETE");
    static JButton B9 = new JButton("CANCEL");
    
    public static void printFrame(){
        JFrame frame = new JFrame("Text Expander");
        contentPane = (JPanel) frame.getContentPane();
        contentPane.setLayout(contentPaneLayout = new CardLayout());

        //-----one Main ----------------------------------
        JPanel one = new JPanel(new BorderLayout());
        one.add(new JLabel("<html><font size=5>INTRO</font></html>", JLabel.CENTER),BorderLayout.NORTH);
        one.add(new JLabel("exit", JLabel.CENTER),BorderLayout.SOUTH);
        JPanel oneButtons = new JPanel(new FlowLayout());
        //buttons
        one.add(oneButtons,BorderLayout.SOUTH);
        oneButtons.add(B1); oneButtons.add(B2); 
        //oneButtons.add(B3); 
        oneButtons.add(B4);
        one.setBackground(Color.white);
        B1.addActionListener(e -> {
            //go to two
            contentPaneLayout.show(contentPane, "TWO");
        });
        B2.addActionListener(e -> {
            contentPaneLayout.show(contentPane, "THREE");

        });
        /*
        B3.addActionListener(e -> {
            //go to four
        });*/
        B4.addActionListener(e -> {
            frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING));
        });

        //-----two "ADD" --------------------------------
        JPanel two = new JPanel(new GridLayout(4,1,10,10));
        two.add(new JLabel("<html><font size=5>Enter the info below</font></html>", JLabel.CENTER),BorderLayout.NORTH);
        
        JPanel center = new JPanel(new GridLayout(3,4,2,2));
        JPanel flowLabel = new JPanel(new FlowLayout());
        flowLabel.add(new JLabel("Label:", JLabel.RIGHT));
        JTextField enterLabel = new JTextField("");
        enterLabel.setPreferredSize(new Dimension(200,20));
        flowLabel.add(enterLabel);
        JPanel flowKey = new JPanel(new FlowLayout());
        flowKey.add(new JLabel("  Key:", JLabel.RIGHT));
        JTextField enterKey = new JTextField("");
        enterKey.setPreferredSize(new Dimension(200,20));
        flowKey.add(enterKey);
        center.add(flowLabel);
        center.add(flowKey);
        two.add(center,BorderLayout.CENTER);
        
        //buttons
        JPanel twoButtons = new JPanel(new FlowLayout());
        two.add(twoButtons,BorderLayout.SOUTH);
        twoButtons.add(B5); twoButtons.add(B6); twoButtons.add(B7);
        B5.addActionListener(e -> {
            //add label & key
        });
        B6.addActionListener(e -> {
            contentPaneLayout.show(contentPane, "THREE");
        });
        B7.addActionListener(e -> {
            //go to one (Main)
            contentPaneLayout.show(contentPane, "ONE");
        });
        

        // ----- three (edit/View)--------->>>NEEDS WORK<<<---------
        //add data                      
        JPanel three = new JPanel(new BorderLayout());
        JLabel table = new JLabel("<html><font size=4>Labels + Keys List</font></html>", JLabel.CENTER);
        three.add(table, BorderLayout.NORTH);

        //data test----------------------------------
        Object [][] data = {{"java","j"},{"Pink Cobras","pc"},{"GoodMorning","gm"}};
        //------------------------------------------- 

        JTable tableList = new JTable(data, list);
        tableList.setPreferredScrollableViewportSize(new Dimension(400,70));
        tableList.setFillsViewportHeight(true);
        JScrollPane scrollPane = new JScrollPane();
        tableList.add(scrollPane);
        three.add(tableList);

        //buttons
        JPanel threeButtons = new JPanel(new FlowLayout());
        three.add(threeButtons,BorderLayout.SOUTH);
        threeButtons.add(B8);threeButtons.add(B9);
        B8.addActionListener(e -> {
            //go to the edit page
            contentPaneLayout.show(contentPane, "THREE");
            
        });
        B9.addActionListener(e -> {
            //go to one (Main)
            contentPaneLayout.show(contentPane, "ONE");
        });
        
        //to show layouts
        contentPane.add("ONE", one);
        contentPane.add("TWO", two);
        contentPane.add("THREE", three);
        
        //see a specific page (start)
        contentPaneLayout.show(contentPane, "ONE");
        
        frame.pack();  
        frame.setLocationRelativeTo(null);
        frame.setSize(600,350);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setResizable(false);

    }
}