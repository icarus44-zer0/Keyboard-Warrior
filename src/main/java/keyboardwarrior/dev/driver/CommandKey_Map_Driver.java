package keyboardwarrior.dev.driver;

import java.util.HashMap;

import keyboardwarrior.SerFileDir;
import keyboardwarrior.SerFileWriter;

public class CommandKey_Map_Driver {
    public static void main(String[] args) {

        HashMap<String, String> map = new HashMap<String, String>();

        map.put("Back Quote", "`");
        map.put("back quote", "`");
        map.put("Minus", "-");
        map.put("Equals", "=");
        map.put("Open Bracket", "[");
        map.put("Close Bracket", "]");
        map.put("Semicolon", ";");
        map.put("Quote", "'");
        map.put("Comma", ",");
        map.put("Period", ".");
        map.put("Slash", "/");
        map.put("Back Slash", "\\");

        SerFileWriter.serFileOut(map, SerFileDir.SF3);

    }
}