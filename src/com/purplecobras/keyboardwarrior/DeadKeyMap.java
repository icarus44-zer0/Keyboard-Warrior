package com.purplecobras.keyboardwarrior;

import com.purplecobras.keyboardwarrior.dev.HashMap_File_Reader;
import com.purplecobras.keyboardwarrior.dev.Ser_File_Dir;

import java.util.HashMap;

/**
 * @author Josh Poe
 * @version 1.0.1
 * @since 2020-05-09
 */
public final class DeadKeyMap {
    private static DeadKeyMap _instance = null;
    public static HashMap<String, String> dead_Key;

    /**
     * 
     */
    private DeadKeyMap() {
        dead_Key = HashMap_File_Reader.hashMap_SerFileIn(dead_Key, Ser_File_Dir.SF4);
    }

    /**
     * 
     */
    public static DeadKeyMap getInstance() {
        if (_instance == null) {
            _instance = new DeadKeyMap();
        }
        return _instance;
    }

    /**
     * 
     */
    public void put(String key, String value) {
        dead_Key.put(key, value);
    }

    /**
     * 
     * @return
     */
    public HashMap<String, String> get_DeadKey_Map() {
        return dead_Key;
    }

    /**
     * 
     * @param dead_Keys
     */
    public void set_DeadKey_Map(HashMap<String, String> dead_Keys) {
        DeadKeyMap.dead_Key = dead_Keys;
    }

}