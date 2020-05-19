package main.java.org.keyboardwarrior;

import java.util.HashMap;

import com.purplecobras.keyboardwarrior.dev.HashMap_File_Reader;
import com.purplecobras.keyboardwarrior.dev.HashMap_File_Writer;
import com.purplecobras.keyboardwarrior.dev.Ser_File_Dir;

public class KeyMap {
    private static KeyMap instance = null; 
    private HashMap<String, String> commandKeyMap;
    private HashMap<String, String> shiftKeyMap;
    private HashMap<String, String> deadKeyMap;



    private KeyMap() {
        shiftKeyMap = HashMap_File_Reader.hashMap_SerFileIn(shiftKeyMap, Ser_File_Dir.SF2);
        commandKeyMap = HashMap_File_Reader.hashMap_SerFileIn(commandKeyMap, Ser_File_Dir.SF3);
        deadKeyMap = HashMap_File_Reader.hashMap_SerFileIn(deadKeyMap, Ser_File_Dir.SF4);
    }

    /**
     * 
     * @return
     */
    public static KeyMap getInstance() {
        if (instance == null) {
            instance = new KeyMap();
        }
        return instance;
    }


    public HashMap<String, String> getCommandKeyMap() {
        return commandKeyMap;
    }

    private void setCommandKeyMap(HashMap<String, String> commandKeyMap) {
        this.commandKeyMap = commandKeyMap;
    }

    public HashMap<String, String> getShiftKeyMap() {
        return shiftKeyMap;
    }

    private void setShiftKeyMap(HashMap<String, String> shiftKeyMap) {
        this.shiftKeyMap = shiftKeyMap;
    }

    public HashMap<String, String> getDeadKeyMap() {
        return deadKeyMap;
    }

    private void setDeadKeyMap(HashMap<String, String> deadKeyMap) {
        this.deadKeyMap = deadKeyMap;
    }

    public void updateSerFile(HashMap<String, String> map, String fileName) {
        HashMap_File_Writer.hashMap_SerFileOut(map, fileName);
    }

}