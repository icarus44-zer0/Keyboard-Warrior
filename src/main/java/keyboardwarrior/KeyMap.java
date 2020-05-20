package keyboardwarrior;

import java.util.HashMap;

public class KeyMap {
    private static KeyMap instance = null;
    private HashMap<String, String> commandKeyMap;
    private HashMap<String, String> shiftKeyMap;
    private HashMap<String, String> deadKeyMap;

    private KeyMap() {
        shiftKeyMap = SerFileReader.serFileIn(shiftKeyMap, SerFileDir.SF2);
        commandKeyMap = SerFileReader.serFileIn(commandKeyMap, SerFileDir.SF3);
        deadKeyMap = SerFileReader.serFileIn(deadKeyMap, SerFileDir.SF4);
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

    public HashMap<String, String> getShiftKeyMap() {
        return shiftKeyMap;
    }

    public HashMap<String, String> getDeadKeyMap() {
        return deadKeyMap;
    }

    public void updateSerFile(HashMap<String, String> map, String fileName) {
        SerFileWriter.serFileOut(map, fileName);
    }

    // private void setShiftKeyMap(HashMap<String, String> shiftKeyMap) {
    //     this.shiftKeyMap = shiftKeyMap;
    // }

    // private void setDeadKeyMap(HashMap<String, String> deadKeyMap) {
    //     this.deadKeyMap = deadKeyMap;
    // }

    // private void setCommandKeyMap(HashMap<String, String> commandKeyMap) {
    //     this.commandKeyMap = commandKeyMap;
    // }

}