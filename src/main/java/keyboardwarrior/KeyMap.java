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

    public void reset(){
        shiftKeyMapReset();
        deadKeyMapReset();
        commandKeyMapReset();
    }

    private void shiftKeyMapReset() {
        shiftKeyMap.clear();
        shiftKeyMap.put("BACK QUOTE", "~");
        shiftKeyMap.put("1", "!");
        shiftKeyMap.put("2", "@");
        shiftKeyMap.put("3", "#");
        shiftKeyMap.put("4", "$");
        shiftKeyMap.put("5", "%");
        shiftKeyMap.put("6", "^");
        shiftKeyMap.put("7", "&");
        shiftKeyMap.put("8", "*");
        shiftKeyMap.put("9", "(");
        shiftKeyMap.put("0", ")");
        shiftKeyMap.put("MINUS", "_");
        shiftKeyMap.put("EQUALS", "+");
        shiftKeyMap.put("OPEN BRACKET", "{");
        shiftKeyMap.put("CLOSE BRACKET", "}");
        shiftKeyMap.put("SEMICOLON", ":");
        shiftKeyMap.put("QUOTE", "\"");
        shiftKeyMap.put("COMMA", "<");
        shiftKeyMap.put("PERIOD", ">");
        shiftKeyMap.put("SLASH", "?");
        shiftKeyMap.put("BACK SLASH", "|");
        updateSerFile(shiftKeyMap, SerFileDir.SF2);
    }

    private void commandKeyMapReset(){
        commandKeyMap.clear();
        commandKeyMap.put("Back Quote", "`");
        commandKeyMap.put("back quote", "`");
        commandKeyMap.put("Minus", "-");
        commandKeyMap.put("Equals", "=");
        commandKeyMap.put("Open Bracket", "[");
        commandKeyMap.put("Close Bracket", "]");
        commandKeyMap.put("Semicolon", ";");
        commandKeyMap.put("Quote", "'");
        commandKeyMap.put("Comma", ",");
        commandKeyMap.put("Period", ".");
        commandKeyMap.put("Slash", "/");
        commandKeyMap.put("Back Slash", "\\");
        updateSerFile(commandKeyMap, SerFileDir.SF3);
    }

    private void deadKeyMapReset(){
        deadKeyMap.clear();
        deadKeyMap.put("", "SPACE");
        deadKeyMap.put("", "RETURN");
        deadKeyMap.put("", "ENTER");
        deadKeyMap.put("", "TAB");
        deadKeyMap.put("", "CTRL");
        deadKeyMap.put("", "ALT");
        deadKeyMap.put("", "META");
        deadKeyMap.put("", "ESCAPE");
        deadKeyMap.put("", "UNDEFINE");
        deadKeyMap.put("", "LEFT");
        deadKeyMap.put("", "DOWN");
        deadKeyMap.put("", "RIGHT");
        deadKeyMap.put("", "UP");
        deadKeyMap.put("", "BACKSPACE");
        deadKeyMap.put("", "CAPS LOCK");
        deadKeyMap.put("", "VOLUME DOWN");
        deadKeyMap.put("", "VOLUME UP");
        deadKeyMap.put("", "MUTE");
        deadKeyMap.put("", "NEXT");
        deadKeyMap.put("", "PLAY");
        deadKeyMap.put("", "PREVIOUS");
        deadKeyMap.put("", "UNDEFINED");

        deadKeyMap.put("1", "Space");
        deadKeyMap.put("2", "Return");
        deadKeyMap.put("3", "Enter");
        deadKeyMap.put("4", "Tab");
        deadKeyMap.put("5", "Ctrl");
        deadKeyMap.put("6", "Alt");
        deadKeyMap.put("7", "Meta");
        deadKeyMap.put("8", "Escape");
        deadKeyMap.put("9", "Undefined");
        deadKeyMap.put("10", "Left");
        deadKeyMap.put("11", "Down");
        deadKeyMap.put("12", "Right");
        deadKeyMap.put("13", "Up");
        deadKeyMap.put("14", "Unknown keyCode: 0xe36");
        deadKeyMap.put("15", "Shift");
        deadKeyMap.put("16", "Backspace");
        deadKeyMap.put("17", "Caps Lock");
        deadKeyMap.put("18", "Back Quote");
        deadKeyMap.put("19", "Minus");
        deadKeyMap.put("20", "Equals");
        deadKeyMap.put("21", "Open Bracket");
        deadKeyMap.put("22", "Close Bracket");
        deadKeyMap.put("23", "Semicolon");
        deadKeyMap.put("24", "Quote");
        deadKeyMap.put("25", "Comma");
        deadKeyMap.put("26", "Period");
        deadKeyMap.put("27", "Slash");
        deadKeyMap.put("28", "Back Slash");
        deadKeyMap.put("29", "Open Bracket");
        updateSerFile(deadKeyMap, SerFileDir.SF4);
    }


    public void standardKeyMapreset(){
        
    }
}