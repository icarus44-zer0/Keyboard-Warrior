package com.purplecobras.keyboardwarrior;

import java.util.HashMap;

/**
 *
 * @author Oscar Vaquera
 * @version 0.0.1
 * @since 2020-04-16
 */
public class KeyCode_Interpreter {
    private static boolean shiftPress;
    private static DeadKey_Map dead_key = DeadKey_Map.getInstance();
    private static CommandKey_Map command_key = CommandKey_Map.getInstance();
    private static Shift_Key_Map shift_Key = Shift_Key_Map.getInstance();

    /**
     * 
     */
    KeyCode_Interpreter() {
        shiftPress = false;
    }

    /**
     * 
     * @param key
     * @return
     */
    public static boolean isSpecialKey(String key) {
        if (dead_key.getDead_Key().containsValue(key)) {
            if (key.equals("Space") || key.equals("Enter") || key.equals("Return") || key.equals("Tab")) {
                KeyBoard_In_Buffer.reset_Buffer();
            }
            return false;
        } else {
            return true;
        }
    }

    /**
     * 
     * @return
     */
    public static HashMap<String, String> getSpecialKeys() {
        return command_key.getCommand_Key();
    }

    /**
     * 
     * @return
     */
    public static HashMap<String, String> getShiftKeys() {
        return shift_Key.getShift_Key();
    }

    /**
     * 
     * @param key
     */
    public static void isStandardKey(String key) {
        KeyBoard_In_Buffer buffer = KeyBoard_In_Buffer.getBuffer();
        buffer.add(key);
    }

    /**
     * 
     * @param key
     * @return
     */
    public static String formatKeyCode(String key) {
        if (command_key.getCommand_Key().containsKey(key)) {
            return command_key.getCommand_Key().get(key);
        }

        return key;
    }

    /**
     * 
     * @param key
     * @return
     */
    public static String getShiftValue(String key) {
        if (shift_Key.getShift_Key().containsKey(key)) {
            return shift_Key.getShift_Key().get(key);
        }

        return key;
    }

    /**
     * 
     */
    public static void interpretKeyPress(String key) {
        if (shiftPress == true) {
            // while shift is press alone dont display anything
        } else {
            if (key.equals("Shift") || key.equals("Unknown keyCode: 0xe36")) {
                shiftPress = true;
            } else {
                if (!isSpecialKey(key) == false) {
                    isStandardKey(key.toLowerCase());
                } else if (command_key.getCommand_Key().containsKey(key)) {
                    isStandardKey(command_key.getCommand_Key().get(key));
                }
            }
        }
    }

    /**
     * Helper methods if shift key is pressed and not released then display a shift
     * key value
     * 
     * @param key
     */
    public static void keyReleasedFunc(String key) {
        if (shiftPress == true && !key.equals("Shift") && !key.equals("Unknown keyCode: 0xe36")) {
            if (!isSpecialKey(key.toUpperCase()) == false) {
                isStandardKey(getShiftValue(key.toUpperCase()));
            }
        } else {
            shiftPress = false;
        }
    }

}