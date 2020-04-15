package com.purplecobras.keyboardwarrior;

import java.util.HashMap;

public class KeyCode_Interpreter_Driver {
    public static void main(String[] args) {

        HashMap<String, String> shift_Keys = new HashMap<String, String>();
        HashMap<String, String> command_Keys = new HashMap<String, String>();
        HashMap<String, String> dead_Keys = new HashMap<String, String>();

        KeyTYPE1_Collection(shift_Keys);
        KeyTYPE2_Collection(command_Keys);
        KeyTYPE3_Collection(dead_Keys);

        HashMap_File_Writer.hashMap_Out(shift_Keys, Ser_File_Name.SF2);
        HashMap_File_Writer.hashMap_Out(command_Keys, Ser_File_Name.SF3);
        HashMap_File_Writer.hashMap_Out(dead_Keys, Ser_File_Name.SF4);
    }

    // Shift keys
    static void KeyTYPE1_Collection(HashMap<String, String> shift_Keys) {
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

    // Standard key usage lowercase letters
    static void KeyTYPE2_Collection(HashMap<String, String> command_Keys) {
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

    // For keys that use shift
    static void KeyTYPE3_Collection(HashMap<String, String> dead_Keys) {
        dead_Keys.put("", "SPACE");
        dead_Keys.put("", "RETURN");
        dead_Keys.put("", "ENTER");
        dead_Keys.put("", "TAB");
        dead_Keys.put("", "CTRL");
        dead_Keys.put("", "ALT");
        dead_Keys.put("", "META");
        dead_Keys.put("", "ESCAPE");
        dead_Keys.put("", "UNDEFINE");
        dead_Keys.put("", "LEFT");
        dead_Keys.put("", "DOWN");
        dead_Keys.put("", "RIGHT");
        dead_Keys.put("", "UP");
        dead_Keys.put("", "BACKSPACE");
        dead_Keys.put("", "CAPS LOCK");
        dead_Keys.put("", "VOLUME DOWN");
        dead_Keys.put("", "VOLUME UP");
        dead_Keys.put("", "MUTE");
        dead_Keys.put("", "NEXT");
        dead_Keys.put("", "PLAY");
        dead_Keys.put("", "PREVIOUS");
        dead_Keys.put("", "UNDEFINED");

        dead_Keys.put("1", "Space");
        dead_Keys.put("2", "Return");
        dead_Keys.put("3", "Enter");
        dead_Keys.put("4", "Tab");
        dead_Keys.put("5", "Ctrl");
        dead_Keys.put("6", "Alt");
        dead_Keys.put("7", "Meta");
        dead_Keys.put("8", "Escape");
        dead_Keys.put("9", "Undefined");
        dead_Keys.put("10", "Left");
        dead_Keys.put("11", "Down");
        dead_Keys.put("12", "Right");
        dead_Keys.put("13", "Up");
        dead_Keys.put("14", "Unknown keyCode: 0xe36");
        dead_Keys.put("15", "Shift");
        dead_Keys.put("16", "Backspace");
        dead_Keys.put("17", "Caps Lock");
        dead_Keys.put("18", "Back Quote");
        dead_Keys.put("19", "Minus");
        dead_Keys.put("20", "Equals");
        dead_Keys.put("21", "Open Bracket");
        dead_Keys.put("22", "Close Bracket");
        dead_Keys.put("23", "Semicolon");
        dead_Keys.put("24", "Quote");
        dead_Keys.put("25", "Comma");
        dead_Keys.put("26", "Period");
        dead_Keys.put("27", "Slash");
        dead_Keys.put("28", "Back Slash");
        dead_Keys.put("29", "Open Bracket");
    }
}