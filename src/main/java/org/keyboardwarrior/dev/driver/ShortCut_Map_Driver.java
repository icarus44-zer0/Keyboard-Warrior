package com.purplecobras.keyboardwarrior.dev.driver;

import java.util.HashMap;
import com.purplecobras.keyboardwarrior.dev.HashMap_File_Writer;
import com.purplecobras.keyboardwarrior.dev.Ser_File_Dir;


public class ShortCut_Map_Driver {
    public static void main(String[] args) {

        HashMap<String, String> map = new HashMap<String, String>();

        map.put("/omw", "On My Way!");
        map.put("/brb", "Be Right Back");
        map.put("/ooo", "Out Of Office");
        map.put("/kw", "Keyboard Warrior");
        
        HashMap_File_Writer.hashMap_SerFileOut(map, Ser_File_Dir.SF1);
    }
}