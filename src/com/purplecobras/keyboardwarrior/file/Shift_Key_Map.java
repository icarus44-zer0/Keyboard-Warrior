package com.purplecobras.keyboardwarrior.file;

import java.util.HashMap;

public final class Shift_Key_Map {
    private static Shift_Key_Map _instance = null;
    private static HashMap<String, String> shift_Key;

    private Shift_Key_Map() {
        shift_Key = HashMap_File_Reader.hashMap_In(shift_Key, Ser_File_Name.SF2);
    }

    public static Shift_Key_Map getInstance(){
        if (_instance == null) {
            _instance = new Shift_Key_Map();
        }
        return _instance;
    }

    public void put(String key, String value){
        shift_Key.put(key, value);
    }

    public HashMap<String, String> getShift_Key() {
        return shift_Key;
    }

    public void setShift_Key(HashMap<String, String> shift_Keys) {
        Shift_Key_Map.shift_Key = shift_Keys;
    }

}