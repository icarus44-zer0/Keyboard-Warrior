package com.purplecobras.keyboardwarrior.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Color;

public abstract class pageOne implements ActionListener{
    static JFrame frame = new JFrame("Text Expander");
    static CardLayout contentPaneLayout;
    static JPanel contentPane;
    static String list[] = { "Label", "Key" };
    static Color white = new Color(255, 255, 255);
    static Color gray = new Color(187, 189, 180);
    static Color purple = new Color(102, 0, 200);

    public static void show(){
        
        contentPane = (JPanel) frame.getContentPane();
        contentPane.setLayout(contentPaneLayout = new CardLayout());

        // -----ONE > Main Page
        // -------------------------------------------------------------------
        JPanel one = new JPanel(new BorderLayout());
        one.add(new JLabel("<html><font size=5>INTRO</font></html>", JLabel.CENTER), BorderLayout.NORTH);
        one.add(new JLabel("exit", JLabel.CENTER), BorderLayout.SOUTH);
        JPanel oneButtons = new JPanel(new FlowLayout());

        // buttons
        one.add(oneButtons, BorderLayout.SOUTH);
        oneButtons.add(pageOne_Button.add_Button);
        oneButtons.add(pageOne_Button.viewEdit_Button);
        // oneButtons.add(B3);
        oneButtons.add(pageOne_Button.exit_Button);

        // play with colors ---------------------
        one.setBackground(purple);
        B4.setBackground(gray);
        B1.setBackground(white);
        B2.setBackground(white);
        // -------------------------------------

        B1.addActionListener(e -> {
            // go to two
            contentPaneLayout.show(contentPane, "TWO");
        });
        B2.addActionListener(e -> {
            contentPaneLayout.show(contentPane, "THREE");

        });
        /*
         * B3.addActionListener(e -> { //go to four });
         */
        B4.addActionListener(e -> {
            frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING));
        });

        contentPane.add("ONE", one);
        // contentPane.add("TWO", two);
        // contentPane.add("THREE", three);

        // see a specific page (start)
        contentPaneLayout.show(contentPane, "ONE");

        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setSize(600, 350);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setResizable(false);
    }
}