package com.purplecobras.keyboardwarrior;

import com.purplecobras.keyboardwarrior.dev.HashMap_File_Reader;
import com.purplecobras.keyboardwarrior.dev.Ser_File_Dir;
import java.util.HashMap;


public final class CommandKey_Map {
    private static CommandKey_Map _instance = null;
    private static HashMap<String, String> command_Key;

    /**
    * 
    */
    private CommandKey_Map() {
        command_Key = HashMap_File_Reader.hashMap_SerFileIn(command_Key, Ser_File_Dir.SF3);
    }

    /**
     * 
     */
    public static CommandKey_Map getInstance() {
        if (_instance == null) {
            _instance = new CommandKey_Map();
        }
        return _instance;
    }

    /**
     * 
     * @param key
     * @param value
     */
    public void put(String key, String value) {
        command_Key.put(key, value);
    }

    /**
     * 
     * @return
     */
    public HashMap<String, String> get_CommandKey_Map() {
        return command_Key;
    }

    /**
     * 
     * @param command_Key
     */
    public void set_CommandKey_Map(HashMap<String, String> command_Key) {
        CommandKey_Map.command_Key = command_Key;
    }

}