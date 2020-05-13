package com.purplecobras.keyboardwarrior.dev.driver;

import java.util.HashMap;

import com.purplecobras.keyboardwarrior.dev.HashMap_File_Writer;
import com.purplecobras.keyboardwarrior.dev.Ser_File_Dir;

/**
 * @author Josh Poe
 * @version 1.0.1
 * @since 2020-05-09
 */
public class ShiftKey_Map_Driver {

    public static void main(String[] args) {

        HashMap<String, String> map = new HashMap<String, String>();

        map.put("BACK QUOTE", "~");
        map.put("1", "!");
        map.put("2", "@");
        map.put("3", "#");
        map.put("4", "$");
        map.put("5", "%");
        map.put("6", "^");
        map.put("7", "&");
        map.put("8", "*");
        map.put("9", "(");
        map.put("0", ")");
        map.put("MINUS", "_");
        map.put("EQUALS", "+");
        map.put("OPEN BRACKET", "{");
        map.put("CLOSE BRACKET", "}");
        map.put("SEMICOLON", ":");
        map.put("QUOTE", "\"");
        map.put("COMMA", "<");
        map.put("PERIOD", ">");
        map.put("SLASH", "?");
        map.put("BACK SLASH", "|");

        HashMap_File_Writer.hashMap_SerFileOut(map, Ser_File_Dir.SF2);

    }

}