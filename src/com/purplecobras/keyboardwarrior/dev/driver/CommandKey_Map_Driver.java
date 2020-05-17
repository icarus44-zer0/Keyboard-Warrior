package com.purplecobras.keyboardwarrior.dev.driver;

import java.util.HashMap;

import com.purplecobras.keyboardwarrior.dev.HashMap_File_Writer;
import com.purplecobras.keyboardwarrior.dev.Ser_File_Dir;


public class CommandKey_Map_Driver {
    public static void main(String[] args) {

        HashMap<String, String> map = new HashMap<String, String>();

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

        HashMap_File_Writer.hashMap_SerFileOut(map, Ser_File_Dir.SF3);

    }
}