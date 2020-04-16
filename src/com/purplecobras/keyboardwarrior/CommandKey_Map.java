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
public final class CommandKey_Map {
    private static CommandKey_Map _instance = null;
    private static HashMap<String, String> command_Key;

    /**
    * 
    */
    private CommandKey_Map() {
        command_Key = HashMap_File_Reader.hashMap_In(command_Key, Ser_File_Lib.SF3);
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
    public HashMap<String, String> getCommand_Key() {
        return command_Key;
    }

    /**
     * 
     * @param command_Key
     */
    public void setCommand_Key(HashMap<String, String> command_Key) {
        CommandKey_Map.command_Key = command_Key;
    }

}