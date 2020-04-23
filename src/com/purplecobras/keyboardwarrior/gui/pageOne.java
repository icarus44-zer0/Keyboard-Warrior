package com.purplecobras.keyboardwarrior.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Color;

public abstract class pageOne implements ActionListener {
    public static final String frameLabel = "<html><font size=5>Keyboard Shortcut</font></html>";
    public static final String appNameLabel = "Keyboard Warrior";
    public static final String addButtonLabel = "ADD";
    public static final String editButtonLabel = "EDIT";
    public static final String exitButtonLabel = "EXIT";

    static final Color PC_PURPLE = new Color(102, 0, 200);
   

    static JFrame frame = new JFrame(appNameLabel);
    static JPanel pageOne_Panel = new JPanel(new BorderLayout());
    static JPanel contentPane;
    static CardLayout contentPaneLayout;
 
    static JButton add_Button = new JButton(addButtonLabel);
    static JButton edit_Button = new JButton(editButtonLabel);
    static JButton exit_Button = new JButton(exitButtonLabel);

    static JButton add_Button2 = new JButton("ADD");
    static JButton cancelExit_Button = new JButton("CANCEL/EXIT");
    static JButton delete_Button = new JButton("DELETE");
    static JButton cancel_Button = new JButton("CANCEL");

    public static void loadPage1() {
        pageSetup();
        loadButtons();
        setColors();
        exitPressed();
        editPressed();
        addPressed();
        pageOreintation();
    }

    public static void pageSetup() {
        contentPane = (JPanel) frame.getContentPane();
        contentPane.setLayout(contentPaneLayout = new CardLayout());

        pageOne_Panel.add(new JLabel(frameLabel, JLabel.CENTER), BorderLayout.NORTH);
        pageOne_Panel.add(new JLabel("Exit", JLabel.CENTER), BorderLayout.SOUTH);
    }

    public static void setColors() {
        pageOne_Panel.setBackground(PC_PURPLE);
        exit_Button.setBackground(Color.GRAY);
        add_Button.setBackground(Color.WHITE);
        edit_Button.setBackground(Color.WHITE);
    }

    public static void loadButtons() {
        JPanel pageOne_Buttons = new JPanel(new FlowLayout());

        // buttons
        pageOne_Panel.add(pageOne_Buttons, BorderLayout.SOUTH);
        pageOne_Buttons.add(add_Button);
        pageOne_Buttons.add(edit_Button);
        // oneButtons.add(B3);
        pageOne_Buttons.add(exit_Button);

    }

    public static void exitPressed() {
        exit_Button.addActionListener(e -> {
            frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING));
        });
    }

    public static void editPressed() {
        edit_Button.addActionListener(e -> {
            // go to three
            contentPaneLayout.show(contentPane, "THREE");
        });
    }

    public static void addPressed() {
        add_Button.addActionListener(e -> {
            // go to two
            contentPaneLayout.show(contentPane, "TWO");
        });
    }

    public static void pageOreintation() {
        contentPane.add("ONE", pageOne_Panel);
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