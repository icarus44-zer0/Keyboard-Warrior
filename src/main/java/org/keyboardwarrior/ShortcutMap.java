package main.java.org.keyboardwarrior;

import com.purplecobras.keyboardwarrior.dev.HashMap_File_Reader;
import com.purplecobras.keyboardwarrior.dev.HashMap_File_Writer;
import com.purplecobras.keyboardwarrior.dev.Ser_File_Dir;

import java.util.HashMap;


public final class ShortcutMap {
    private static ShortcutMap instance = null;
    public HashMap<String, String> shortcut_map;

    private ShortcutMap() {
        shortcut_map = HashMap_File_Reader.hashMap_SerFileIn(shortcut_map, Ser_File_Dir.SF1);
    }

    /**
     * 
     * @return
     */
    public static ShortcutMap getInstance() {
        if (instance == null) {
            instance = new ShortcutMap();
        }
        return instance;
    }

    /**
     * 
     * @param key
     * @param value
     */
    public void put(String key, String value) {
        shortcut_map.put(key, value);
    }

    /**
     * 
     * @return
     */
    public HashMap<String, String> get_Shortcut_Map() {
        return shortcut_map;
    }


    /**
     * 
     * @param shortcut_Key
     */
    public void set_Shortcut_Map(HashMap<String, String> shortcut_Key) {
        shortcut_map = shortcut_Key;
    }
   
    public void printToConsole() {
        shortcut_map.entrySet().forEach(entry -> {
            System.out.println(entry.getKey() + " " + entry.getValue());
        });
    }

    public void updateShortcutSerFile() {
        ShortcutMap shortcut_map = ShortcutMap.getInstance();
        HashMap_File_Writer.hashMap_SerFileOut(shortcut_map.get_Shortcut_Map(), Ser_File_Dir.SF1);
    }

}