package keyboardwarrior;

import java.util.HashMap;


public final class ShortcutMap {
    private static ShortcutMap instance = null;
    public HashMap<String, String> shortcut_map;
    public static final String FILE_NAME = "shortCut.ser";
    public static final String FILE_PATH = "src/main/java/keyboardwarrior/ser/";

    /**
     * 
     */
    private ShortcutMap() {
        shortcut_map = SerFileReader.serFileIn(shortcut_map, FILE_NAME , FILE_PATH);
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
   
    /**
     * 
     */
    public void printToConsole() {
        shortcut_map.entrySet().forEach(entry -> {
            System.out.println(entry.getKey() + " " + entry.getValue());
        });
    }

    /**
     * 
     */
    public void updateShortcutSerFile() {
        ShortcutMap shortcut_map = ShortcutMap.getInstance();
        SerFileWriter.serFileOut(shortcut_map.getShortcutMap(), FILE_NAME, FILE_PATH);
    }

    /**
     * 
     */
    public void resetToDefault() {
        shortcut_map.clear();
        shortcut_map.put("/omw", "On My Way!");
        shortcut_map.put("/brb", "Be Right Back");
        shortcut_map.put("/ooo", "Out Of Office");
        shortcut_map.put("/kw", "Keyboard Warrior");
        shortcut_map.put("/pc", "PurpleCobrasIO"); 
        updateShortcutSerFile();
    }

    /**
     * 
     */
    public void reset() {
        shortcut_map.clear();
        updateShortcutSerFile();
    }
}