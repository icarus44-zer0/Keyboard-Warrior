package main.java.org.purplecobras.keyboardwarrior;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;


public class InsertionPointAccessor {
        Robot robot;

        /**
         * 
         */
        InsertionPointAccessor() {

        }

        /**
         * 
         * @param robot
         * @throws InterruptedException
         */
        public static void pasteMacOS(Robot robot) throws InterruptedException {

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
         * @throws InterruptedException
         */
        public static void pasteWindows(Robot robot) throws InterruptedException {

                robot.keyPress(KeyEvent.VK_CONTROL);
                TimeUnit.MILLISECONDS.sleep(10);

                robot.keyPress(KeyEvent.VK_V);
                robot.keyRelease(KeyEvent.VK_V);
                TimeUnit.MILLISECONDS.sleep(10);

                robot.keyRelease(KeyEvent.VK_CONTROL);
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
        public static void deleteKey(Robot robot, String key) throws InterruptedException {
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