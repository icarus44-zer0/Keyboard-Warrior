package com.purplecobras.keyboardwarrior.gui;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class GUI_Image {

    /*
    *
    * Background Image 
    *
    */
    public static void splashPageImage(){
        ImageIcon background=new ImageIcon("src\\com\\purplecobras\\keyboardwarrior\\images\\logo.png");
        Image img=background.getImage();
        Image temp=img.getScaledInstance(300,300,Image.SCALE_SMOOTH);
        background=new ImageIcon(temp);
        JLabel back=new JLabel(background);        
        back.setLayout(null);
        back.setBounds(0,0,400,400);
        back.setVisible(true);
        GUI_SplashPage.splashPage_Panel.add(back);
    }

    /*
    *
    *  ICON Image
    *
    */
    public static void iconImage(){
        ImageIcon image = new ImageIcon("src\\com\\purplecobras\\keyboardwarrior\\images\\logo.png");
        GUI_KBW.frame.setIconImage(image.getImage());
    }
}