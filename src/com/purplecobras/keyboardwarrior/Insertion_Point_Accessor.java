package com.purplecobras.keyboardwarrior;

import java.awt.Robot;
import java.awt.event.KeyEvent;

/**
 *
 * @author Purple Cobras
 * @version 0.0.1
 * @since 2020-04-16
 */
public class Insertion_Point_Accessor {
        Robot robot;

        /**
         * 
         */
        Insertion_Point_Accessor() {

        }

        /**
         * 
         * @param robot
         * @throws InterruptedException
         */
        public static void paste_scKey(Robot robot) throws InterruptedException {

                robot.keyPress(KeyEvent.VK_CONTROL);
                robot.keyPress(KeyEvent.VK_V);

                robot.keyRelease(KeyEvent.VK_CONTROL);
                robot.keyRelease(KeyEvent.VK_CONTROL);

                robot.keyPress(KeyEvent.VK_SPACE);
                robot.keyRelease(KeyEvent.VK_SPACE);
        }

        /**
         * 
         * @param robot
         * @param key
         * @throws InterruptedException
         */
        public static void delete_sckey(Robot robot, String key) throws InterruptedException {
                for (int i = 0; i < key.length(); i++) {
                        robot.keyPress(KeyEvent.VK_BACK_SPACE);
                        robot.keyRelease(KeyEvent.VK_BACK_SPACE);
                }
        }

}

// Send paste a robot objet like below. It pastes what is in clipboard
// try{
// Robot rob = new Robot();
// Insert_At_Cursor.paste(rob);
// }catch(Exception ex){}