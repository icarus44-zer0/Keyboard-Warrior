package com.purplecobras.keyboardwarrior;

import com.purplecobras.keyboardwarrior.dev.HashMap_File_Reader;
import com.purplecobras.keyboardwarrior.dev.Ser_File_Lib;

import java.util.HashMap;

/**
 *
 * @author Purple Cobras
 * @version 0.0.1
 * @since 2020-04-16
 */
public final class Shortcut_Map {
    private static Shortcut_Map _instance = null;
    public static HashMap<String, String> shortcut_map;

    private Shortcut_Map() {

        shortcut_map = HashMap_File_Reader.hashMap_In(shortcut_map, Ser_File_Lib.SF1);

    }

    /**
     * 
     * @return
     */
    public static Shortcut_Map getInstance() {
        if (_instance == null) {
            _instance = new Shortcut_Map();
        }
        return _instance;
    }

    /**
     * 
     * @param key
     * @param value
     */
    public void put(String key, String value) {
        shortcut_map.put(key, value);
    }

    /**
     * 
     * @return
     */
    public HashMap<String, String> get_Shortcut_Map() {
        return shortcut_map;
    }

    /**
     * 
     * @param shortcut_Key
     */
    public void set_Shortcut_Map(HashMap<String, String> shortcut_Key) {
        Shortcut_Map.shortcut_map = shortcut_Key;
    }
   
    public void printToConsole() {
        shortcut_map.entrySet().forEach(entry -> {
            System.out.println(entry.getKey() + " " + entry.getValue());
        });
    }
}