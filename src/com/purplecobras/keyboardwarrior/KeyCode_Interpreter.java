package com.purplecobras.keyboardwarrior;

import java.util.HashMap;
import java.util.Map;

public class KeyCode_Interpreter {
    private static Map<String, String> shift_Keys = new HashMap<String, String>();
    private static Map<String, String> command_Keys = new HashMap<String, String>();
    private static Map<String,String> dead_Keys = new HashMap<String,String>();
    private static boolean shiftPress = false;

    KeyCode_Interpreter() {
        // KeyTYPE1_Collection();
        // KeyTYPE2_Collection();
        // KeyTYPE3_Collection();
        // KeyTYPE4_Collection();
    }

    public static boolean isSpecialKey(String key) {


        if (dead_Keys.containsValue(key)) {
            if (key.equals("Space") || key.equals("Enter") || key.equals("Return") || key.equals("Tab")) {
                KeyBoard_In_Buffer.reset();
            }
            return false;
        } else {
            return true;
        }
    }

    // Future Use
    public static Map<String, String> getSpecialKeys() {
        return command_Keys;
    }

    // Future Use
    public static Map<String, String> getShiftKeys() {
        return shift_Keys;
    }

    public static void isStandardKey(String key) {
        KeyBoard_In_Buffer buffer = KeyBoard_In_Buffer.getBuffer();
        buffer.add(key);
    }

    public static String formatKeyCode(String key) {
        if (command_Keys.containsKey(key)) {
            return command_Keys.get(key);
        }

        return key;
    }

    public static String getShiftValue(String key) {
        if (shift_Keys.containsKey(key)) {
            return shift_Keys.get(key);
        }

        return key;
    }

    // Helper
    public static void interpretKeyPress(String key) {
        if (shiftPress == true) {
            // while shift is press alone dont display anything
        } else {
            if (key.equals("Shift") || key.equals("Unknown keyCode: 0xe36")) {
                shiftPress = true;
            } else {
                if (!isSpecialKey(key) == false) {
                    isStandardKey(key.toLowerCase());
                } else if (command_Keys.containsKey(key)) {
                    isStandardKey(command_Keys.get(key));
                }
            }
        }
    }

    // Helper methods
    // if shift key is pressed and not released then display a shift key value
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