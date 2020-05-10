package com.purplecobras.keyboardwarrior;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;


/**
 * @author Josh Poe
 * @version 1.0.1
 * @since 2020-05-09
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
        public static void paste_Shortcut_Value(Robot robot) throws InterruptedException {

                robot.keyPress(KeyEvent.VK_META);
                TimeUnit.MILLISECONDS.sleep(10);

                robot.keyPress(KeyEvent.VK_V);
                robot.keyRelease(KeyEvent.VK_V);
                TimeUnit.MILLISECONDS.sleep(10);

                robot.keyRelease(KeyEvent.VK_META);
                TimeUnit.MILLISECONDS.sleep(10);

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