package main.java.org.purplecobras.keyboardwarrior.dev.driver;

import java.util.HashMap;

import main.java.org.purplecobras.keyboardwarrior.SerFileWriter;
import main.java.org.purplecobras.keyboardwarrior.SerFileDir;


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