package com.purplecobras.keyboardwarrior.dev;

import java.util.HashMap;

/**
 * @author Josh Poe
 * @version 1.0.1
 * @since 2020-05-09
 */
public class ShortCut_Map_Driver {
    public static void main(String[] args) {

        HashMap<String, String> map = new HashMap<String, String>();

        map.put("/jp", "Josh Poe");
        map.put("/pc", "Purple Cobras");
        map.put("/omw", "On My Way!");
        map.put("/brb", "Be Right Back");
        map.put("/ooo", "Out Of Office");
        map.put("/kw", "Keyboard Warrior");
        
        HashMap_File_Writer.hashMap_SerFileOut(map, Ser_File_Dir.SF1);
    }
}