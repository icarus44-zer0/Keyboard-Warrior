package com.purplecobras.keyboardwarrior.file;

import java.util.HashMap;

public class Command_Key_Driver {
    public static void main(String[] args) {

        HashMap<String,String> map = new HashMap<String,String>();

        map.put("Back Quote", "`");
        map.put("back quote", "`");
        map.put("Minus", "-");
        map.put("Equals", "=");
        map.put("Open Bracket", "[");
        map.put("Close Bracket", "]");
        map.put("Semicolon", ";");
        map.put("Quote", "'");
        map.put("Comma", ",");
        map.put("Period", ".");
        map.put("Slash", "/");
        map.put("Back Slash", "\\");

        HashMap_File_Writer.hashMap_Out(map, Ser_File_Name.SF3);

    }
}