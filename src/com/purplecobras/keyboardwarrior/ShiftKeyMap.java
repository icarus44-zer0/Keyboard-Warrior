package com.purplecobras.keyboardwarrior;

import com.purplecobras.keyboardwarrior.dev.HashMap_File_Reader;
import com.purplecobras.keyboardwarrior.dev.Ser_File_Dir;

import java.util.HashMap;

/**
 * @author Josh Poe
 * @version 1.0.1
 * @since 2020-05-09
 */
public final class ShiftKeyMap {
    private static ShiftKeyMap _instance = null;
    private static HashMap<String, String> shift_Key;

    /**
     * 
     */
    private ShiftKeyMap() {
        shift_Key = HashMap_File_Reader.hashMap_SerFileIn(shift_Key, Ser_File_Dir.SF2);
    }

    /**
     * @return Shift_Key_Map
     */
    public static ShiftKeyMap getInstance() {
        if (_instance == null) {
            _instance = new ShiftKeyMap();
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
        ShiftKeyMap.shift_Key = shift_Keys;
    }

}