package keyboardwarrior;

import java.util.HashMap;


public final class ShortcutMap {
    private static ShortcutMap instance = null;
    public HashMap<String, String> shortcut_map;

    private ShortcutMap() {
        shortcut_map = SerFileReader.serFileIn(shortcut_map, SerFileDir.SF1);
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
    public HashMap<String, String> getShortcutMap() {
        return shortcut_map;
    }


    /**
     * 
     * @param shortcut_Key
     */
    public void setShortcutMap(HashMap<String, String> shortcut_Key) {
        shortcut_map = shortcut_Key;
    }
   
    public void printToConsole() {
        shortcut_map.entrySet().forEach(entry -> {
            System.out.println(entry.getKey() + " " + entry.getValue());
        });
    }

    public void updateShortcutSerFile() {
        ShortcutMap shortcut_map = ShortcutMap.getInstance();
        SerFileWriter.serFileOut(shortcut_map.getShortcutMap(), SerFileDir.SF1);
    }

}