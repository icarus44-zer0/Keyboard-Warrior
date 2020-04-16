package com.purplecobras.keyboardwarrior;

import com.purplecobras.keyboardwarrior.dev.HashMap_File_Reader;
import com.purplecobras.keyboardwarrior.dev.Ser_File_Lib;

import java.util.HashMap;



public final class DeadKey_Map {
    private static DeadKey_Map _instance = null;
    public static HashMap<String, String> dead_Key;

    private DeadKey_Map() {
        dead_Key = HashMap_File_Reader.hashMap_In(dead_Key, Ser_File_Lib.SF4);
    }

    public static DeadKey_Map getInstance(){
        if (_instance == null) {
            _instance = new DeadKey_Map();
        }
        return _instance;
    }

    public void put(String key, String value){
        dead_Key.put(key, value);
    }

    public HashMap<String, String> getDead_Key() {
        return dead_Key;
    }

    public void setDead_Key(HashMap<String, String> dead_Keys) {
        DeadKey_Map.dead_Key = dead_Keys;
    }



}