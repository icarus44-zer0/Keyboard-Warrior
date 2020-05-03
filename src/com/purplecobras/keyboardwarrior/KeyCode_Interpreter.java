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
    private static ShiftKey_Map shift_Key = ShiftKey_Map.getInstance();

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
        if (dead_key.get_DeadKey_Map().containsValue(key)) {
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
        return command_key.get_CommandKey_Map();
    }

    /**
     * 
     * @return
     */
    public static HashMap<String, String> getShiftKeys() {
        return shift_Key.get_ShiftKey_Map();
    }

    /**
     * 
     * @param key
     */
    public static void isStandardKey(String key) {
        KeyBoard_In_Buffer buffer = KeyBoard_In_Buffer.getInstance();
        buffer.add(key);
    }

    /**
     * 
     * @param key
     * @return
     */
    public static String formatKeyCode(String key) {
        if (command_key.get_CommandKey_Map().containsKey(key)) {
            return command_key.get_CommandKey_Map().get(key);
        }

        return key;
    }

    /**
     * 
     * @param key
     * @return
     */
    public static String getShiftValue(String key) {
        if (shift_Key.get_ShiftKey_Map().containsKey(key)) {
            return shift_Key.get_ShiftKey_Map().get(key);
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
                } else if (command_key.get_CommandKey_Map().containsKey(key)) {
                    isStandardKey(command_key.get_CommandKey_Map().get(key));
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