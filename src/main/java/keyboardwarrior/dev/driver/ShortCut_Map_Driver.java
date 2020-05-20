package keyboardwarrior.dev.driver;

import java.util.HashMap;

import keyboardwarrior.SerFileDir;
import keyboardwarrior.SerFileWriter;


public class ShortCut_Map_Driver {
    public static void main(String[] args) {

        HashMap<String, String> map = new HashMap<String, String>();

        map.put("/omw", "On My Way!");
        map.put("/brb", "Be Right Back");
        map.put("/ooo", "Out Of Office");
        map.put("/kw", "Keyboard Warrior");
        
        SerFileWriter.serFileOut(map, SerFileDir.SF1);
    }
}