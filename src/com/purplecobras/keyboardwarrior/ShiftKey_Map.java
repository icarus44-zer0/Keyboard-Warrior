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
public final class ShiftKey_Map {
    private static ShiftKey_Map _instance = null;
    private static HashMap<String, String> shift_Key;

    /**
     * 
     */
    private ShiftKey_Map() {
        shift_Key = HashMap_File_Reader.hashMap_In(shift_Key, Ser_File_Lib.SF2);
    }

    /**
     * @return Shift_Key_Map
     */
    public static ShiftKey_Map getInstance() {
        if (_instance == null) {
            _instance = new ShiftKey_Map();
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
    public HashMap<String, String> get_ShiftKey_Map() {
        return shift_Key;
    }

    /**
     * 
     * @param shift_Keys
     */
    public void set_ShiftKey_Map(HashMap<String, String> shift_Keys) {
        ShiftKey_Map.shift_Key = shift_Keys;
    }

}