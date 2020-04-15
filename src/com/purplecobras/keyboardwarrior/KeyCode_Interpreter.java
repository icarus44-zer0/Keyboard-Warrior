package com.purplecobras.keyboardwarrior;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class KeyCode_Interpreter {
    private static Map<String, String> shift_Keys = new HashMap<String, String>();
    private static Map<String, String> command_Keys = new HashMap<String, String>();
    private static Map<String,String> dead_Keys = new HashMap<String,String>();
    private static boolean shiftPress = false;

    KeyCode_Interpreter() {
        KeyTYPE1_Collection();
        KeyTYPE2_Collection();
        KeyTYPE3_Collection();
        KeyTYPE4_Collection();
    }

    // Shift keys
    public static void KeyTYPE1_Collection() {
        shift_Keys.put("BACK QUOTE", "~");
        shift_Keys.put("1", "!");
        shift_Keys.put("2", "@");
        shift_Keys.put("3", "#");
        shift_Keys.put("4", "$");
        shift_Keys.put("5", "%");
        shift_Keys.put("6", "^");
        shift_Keys.put("7", "&");
        shift_Keys.put("8", "*");
        shift_Keys.put("9", "(");
        shift_Keys.put("0", ")");
        shift_Keys.put("MINUS", "_");
        shift_Keys.put("EQUALS", "+");
        shift_Keys.put("OPEN BRACKET", "{");
        shift_Keys.put("CLOSE BRACKET", "}");
        shift_Keys.put("SEMICOLON", ":");
        shift_Keys.put("QUOTE", "\"");
        shift_Keys.put("COMMA", "<");
        shift_Keys.put("PERIOD", ">");
        shift_Keys.put("SLASH", "?");
        shift_Keys.put("BACK SLASH", "|");
    }

    // Standard NO SHIFT PRESS
    public static void KeyTYPE2_Collection() {
        dead_Keys.put("1","Space");
        dead_Keys.put("2","Return");
        dead_Keys.put("3","Enter");
        dead_Keys.put("4","Tab");
        dead_Keys.put("5","Ctrl");
        dead_Keys.put("6","Alt");
        dead_Keys.put("7","Meta");
        dead_Keys.put("8","Escape");
        dead_Keys.put("9","Undefined");
        dead_Keys.put("10","Left");
        dead_Keys.put("11","Down");
        dead_Keys.put("12","Right");
        dead_Keys.put("13","Up");
        dead_Keys.put("14","Unknown keyCode: 0xe36");
        dead_Keys.put("15","Shift");
        dead_Keys.put("16","Backspace");
        dead_Keys.put("17","Caps Lock");
        dead_Keys.put("18","Back Quote");
        dead_Keys.put("19","Minus");
        dead_Keys.put("20","Equals");
        dead_Keys.put("21","Open Bracket");
        dead_Keys.put("22","Close Bracket");
        dead_Keys.put("23","Semicolon");
        dead_Keys.put("24","Quote");
        dead_Keys.put("25","Comma");
        dead_Keys.put("26","Period");
        dead_Keys.put("27","Slash");
        dead_Keys.put("28","Back Slash");
        dead_Keys.put("29","Open Bracket");
    }

    // For keys that use shift 
    public static void KeyTYPE3_Collection() {
        dead_Keys.put("","SPACE");
        dead_Keys.put("","RETURN");
        dead_Keys.put("","ENTER");
        dead_Keys.put("","TAB");
        dead_Keys.put("","CTRL");
        dead_Keys.put("","ALT");
        dead_Keys.put("","META");
        dead_Keys.put("","ESCAPE");
        dead_Keys.put("","UNDEFINE");
        dead_Keys.put("","LEFT");
        dead_Keys.put("","DOWN");
        dead_Keys.put("","RIGHT");
        dead_Keys.put("","UP");
        dead_Keys.put("","BACKSPACE");
        dead_Keys.put("","CAPS LOCK");
        dead_Keys.put("","VOLUME DOWN");
        dead_Keys.put("","VOLUME UP");
        dead_Keys.put("","MUTE");
        dead_Keys.put("","NEXT");
        dead_Keys.put("","PLAY");
        dead_Keys.put("","PREVIOUS");
        dead_Keys.put("","UNDEFINED");
    }

    // Standard key usage lowercase letters
    public static void KeyTYPE4_Collection() {
        command_Keys.put("Back Quote", "`");
        command_Keys.put("back quote", "`");
        command_Keys.put("Minus", "-");
        command_Keys.put("Equals", "=");
        command_Keys.put("Open Bracket", "[");
        command_Keys.put("Close Bracket", "]");
        command_Keys.put("Semicolon", ";");
        command_Keys.put("Quote", "'");
        command_Keys.put("Comma", ",");
        command_Keys.put("Period", ".");
        command_Keys.put("Slash", "/");
        command_Keys.put("Back Slash", "\\");
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
    public static void keyPressFunc(String key) {
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