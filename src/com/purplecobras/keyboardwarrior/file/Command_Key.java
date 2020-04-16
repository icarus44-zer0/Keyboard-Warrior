package com.purplecobras.keyboardwarrior.file;

import java.util.HashMap;

public final class Command_Key {
    private static Command_Key _instance = null;
    private static HashMap<String, String> command_Key;

    private Command_Key() {
        command_Key = HashMap_File_Reader.hashMap_In(command_Key, Ser_File_Name.SF3);
    }

    public static Command_Key getInstance() {
        if (_instance == null) {
            _instance = new Command_Key();
        }
        return _instance;
    }

    public void put(String key, String value){
        command_Key.put(key, value);
    }

    public HashMap<String, String> getCommand_Key() {
        return command_Key;
    }

    public void setCommand_Key(HashMap<String, String> command_Key) {
        Command_Key.command_Key = command_Key;
    }
    

}