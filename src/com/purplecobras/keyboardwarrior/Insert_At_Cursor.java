package com.purplecobras.keyboardwarrior;

import java.awt.Robot;
import java.awt.event.KeyEvent;

public class Insert_At_Cursor{

    Insert_At_Cursor() {}

    public static void paste(Robot robot) throws InterruptedException {

            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_V);

            robot.keyRelease(KeyEvent.VK_CONTROL);
            robot.keyRelease(KeyEvent.VK_CONTROL);

            robot.keyPress(KeyEvent.VK_SPACE);
            robot.keyRelease(KeyEvent.VK_SPACE);
    }

}


// Send paste a robot objet like below. It pastes what is in clipboard
//try{ 
//  Robot rob = new Robot();
//  Insert_At_Cursor.paste(rob); 		
// }catch(Exception ex){}