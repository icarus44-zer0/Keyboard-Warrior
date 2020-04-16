package com.purplecobras.keyboardwarrior.file;

import java.util.HashMap;

public final class Dead_Key {
    private static Dead_Key _instance = null;
    public static HashMap<String, String> dead_Key;

    private Dead_Key() {
        dead_Key = HashMap_File_Reader.hashMap_In(dead_Key, Ser_File_Name.SF4);
    }

    public static Dead_Key getInstance(){
        if (_instance == null) {
            _instance = new Dead_Key();
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
        Dead_Key.dead_Key = dead_Keys;
    }



}