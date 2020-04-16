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
public final class Shift_Key_Map {
    private static Shift_Key_Map _instance = null;
    private static HashMap<String, String> shift_Key;

    /**
     * 
     */
    private Shift_Key_Map() {
        shift_Key = HashMap_File_Reader.hashMap_In(shift_Key, Ser_File_Lib.SF2);
    }

    /**
     * @return Shift_Key_Map
     */
    public static Shift_Key_Map getInstance() {
        if (_instance == null) {
            _instance = new Shift_Key_Map();
        }
        return _instance;
    }

    /**
     * 
     */
    public void put(String key, String value) {
        shift_Key.put(key, value);
    }

    /**
     * 
     * @return shift_Key
     */
    public HashMap<String, String> getShift_Key() {
        return shift_Key;
    }

    /**
     * 
     * @param shift_Keys
     */
    public void setShift_Key(HashMap<String, String> shift_Keys) {
        Shift_Key_Map.shift_Key = shift_Keys;
    }

}