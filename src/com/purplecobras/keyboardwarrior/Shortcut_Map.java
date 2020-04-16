package com.purplecobras.keyboardwarrior;

import com.purplecobras.keyboardwarrior.dev.HashMap_File_Reader;
import com.purplecobras.keyboardwarrior.dev.Ser_File_Lib;

import java.util.HashMap;

public final class Shortcut_Map {
    private static Shortcut_Map _instance = null;
    public static HashMap<String, String> shortcut_Key;

    private Shortcut_Map() {

            shortcut_Key = HashMap_File_Reader.hashMap_In(shortcut_Key, Ser_File_Lib.SF1);

    }

    public static Shortcut_Map getInstance(){
        if (_instance == null) {
            _instance = new Shortcut_Map();
        }
        return _instance;
    }

    public void put(String key, String value){
        shortcut_Key.put(key, value);
    }


    public HashMap<String, String> getShortcut_Key() {
        return shortcut_Key;
    }

    public void setShortcut_Key(HashMap<String, String> shortcut_Key) {
        Shortcut_Map.shortcut_Key = shortcut_Key;
    }

}