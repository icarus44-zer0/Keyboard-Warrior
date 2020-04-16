package com.purplecobras.keyboardwarrior;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class KeyCode_Interpreter {
    private static Map<String, String> shift_Keys = new HashMap<String, String>();
    private static Map<String, String> command_Keys = new HashMap<String, String>();
    private static ArrayList<String> dead_Keys = new ArrayList<String>();
    private static boolean shiftPress = false;

    public static void addKeyCollection() {
        //Shift keys 
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

        //Standard NO SHIFT PRESS
        dead_Keys.add("Space");
        dead_Keys.add("Return");
        dead_Keys.add("Enter");
        dead_Keys.add("Tab");
        dead_Keys.add("Ctrl");
        dead_Keys.add("Alt");
        dead_Keys.add("Meta");
        dead_Keys.add("Escape");
        dead_Keys.add("Undefined");
        dead_Keys.add("Left");
        dead_Keys.add("Down");
        dead_Keys.add("Right");
        dead_Keys.add("Up");
        dead_Keys.add("Unknown keyCode: 0xe36");
        dead_Keys.add("Shift");
        dead_Keys.add("Backspace");
        dead_Keys.add("Caps Lock");

        dead_Keys.add("Back Quote");
        dead_Keys.add("Minus");
        dead_Keys.add("Equals");
        dead_Keys.add("Open Bracket");
        dead_Keys.add("Close Bracket");
        dead_Keys.add("Semicolon");
        dead_Keys.add("Quote");
        dead_Keys.add("Comma");
        dead_Keys.add("Period");
        dead_Keys.add("Slash");
        dead_Keys.add("Back Slash");
        dead_Keys.add("Open Bracket");
       
        //For keys that use shift
        dead_Keys.add("SPACE");
        dead_Keys.add("RETURN");
        dead_Keys.add("ENTER");
        dead_Keys.add("TAB");
        dead_Keys.add("CTRL");
        dead_Keys.add("ALT");
        dead_Keys.add("META");
        dead_Keys.add("ESCAPE");
        dead_Keys.add("UNDEFINE");
        dead_Keys.add("LEFT");
        dead_Keys.add("DOWN");
        dead_Keys.add("RIGHT");
        dead_Keys.add("UP");
        dead_Keys.add("BACKSPACE");
        dead_Keys.add("CAPS LOCK");
        dead_Keys.add("VOLUME DOWN");
        dead_Keys.add("VOLUME UP");
        dead_Keys.add("MUTE");
        dead_Keys.add("NEXT");
        dead_Keys.add("PLAY");
        dead_Keys.add("PREVIOUS");
        dead_Keys.add("UNDEFINED");
            
        //Standard key usage lowercase letters
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
        addKeyCollection();

        if (dead_Keys.contains(key)){
            if (key.equals("Space") || key.equals("Enter") || key.equals("Return") || key.equals("Tab")) {
                KeyBoard_In_Buffer.reset_Buffer();
            }
            return false;
        }else{
            return true;
        }
    }

    //This method will be used after clipboard class is created
    public static void isSpacingKeys(String key) {

        switch (key) {
            case "Space":
                System.out.print(" ");
                break;
            case "Return":
                System.out.println();
                break;
            case "Enter":
                System.out.println();
                break;
            case "Tab":
                System.out.print("	");
                break;
            default:
                return;

        }
    }

    //Future Use
    // public static Map<String,String> getSpecialKeys() {
    //     return comman_Keys;
    // }

    // public static Map<String, String> getShiftKeys() {
    //     return shift_Keys;
    // }

    public static void isStandardKey(String key) {
        KeyBoard_In_Buffer buffer = KeyBoard_In_Buffer.getBuffer();
        buffer.add(key);
    }

    public static String getKeyCodeValue(String key) {
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
    public static void keyReleasedFunc(String key) {
        // if shift key is pressed and not released then display a shift key value
        if (shiftPress == true && !key.equals("Shift") && !key.equals("Unknown keyCode: 0xe36")) {
            if(!isSpecialKey(key.toUpperCase()) == false){
                isStandardKey(getShiftValue(key.toUpperCase())); 
            }         
        } else {
            shiftPress = false;
        }
    }

}