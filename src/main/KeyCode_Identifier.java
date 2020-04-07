package main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class KeyCode_Identifier {
    private static Map<String, String> shift_Keys = new HashMap<String, String>();
    private static Map<String, String> m = new HashMap<String, String>();
    private static ArrayList<String> mBool = new ArrayList<String>();



    public static boolean isSpecialKey(String key) {
        CircularBuffer buffer = CircularBuffer.getInstance();
        //isSpacingKeys(key);
        setUp();

        if (mBool.contains(key)) {
            if (key.equals("Space") || key.equals("Enter") || key.equals("Return") || key.equals("Tab")) {
                buffer.clear();
            }

            return false;
        } else {

            return true;
        }

    }

    public static void isSpacingKeys(String key) {

        switch (key) {
            case "Space":
                System.out.print(" ");
                break;
            case "Return":
                System.out.println();
                break;
            case "Enter":
                System.out.println();
                break;
            case "Tab":
                System.out.print("	");
                break;
            default:
                return;

        }
    }

    public static void setUp() {
        shift_Keys.put("BACK QUOTE","~");
        shift_Keys.put("1","!");
        shift_Keys.put("2","@");
        shift_Keys.put("3","#");
        shift_Keys.put("4","$");
        shift_Keys.put("5","%");
        shift_Keys.put("6","^");
        shift_Keys.put("7","&");
        shift_Keys.put("8","*");
        shift_Keys.put("9","(");
        shift_Keys.put("0",")");
        shift_Keys.put("MINUS","_");
        shift_Keys.put("EQUALS","+");
        shift_Keys.put("OPEN BRACKET","{");
        shift_Keys.put("CLOSE BRACKET","}");
        shift_Keys.put("SEMICOLON",":");
        shift_Keys.put("QUOTE","\"");
        shift_Keys.put("COMMA","<");
        shift_Keys.put("PERIOD",">");
        shift_Keys.put("SLASH","?");
        shift_Keys.put("BACK SLASH","|");
        


        mBool.add("Space");
        mBool.add("Return");
        mBool.add("Enter");
        mBool.add("Tab");
        mBool.add("Ctrl");
        mBool.add("Alt");
        mBool.add("Meta");
        mBool.add("Escape");
        mBool.add("Undefined");
        mBool.add("Left");
        mBool.add("Down");
        mBool.add("Right");
        mBool.add("Up");
        mBool.add("Unknown keyCode: 0xe36");
        mBool.add("Shift");
        mBool.add("Backspace");

        mBool.add("Back Quote");
        mBool.add("Minus");
        mBool.add("Equals");
        mBool.add("Open Bracket");
        mBool.add("Close Bracket");
        mBool.add("Semicolon");
        mBool.add("Quote");
        mBool.add("Comma");
        mBool.add("Period");
        mBool.add("Slash");
        mBool.add("Back Slash");
        mBool.add("Open Bracket");

        
        m.put("Back Quote", "`");
        m.put("Minus", "-");
        m.put("Equals", "=");
        m.put("Open Bracket", "[");
        m.put("Close Bracket", "]");
        m.put("Semicolon", ";");
        m.put("Quote", "'");
        m.put("Comma", ",");
        m.put("Period", ".");
        m.put("Slash", "/");
        m.put("Back Slash", "\\");
    }

    public static Map<String,String> getSpecialKeys() {
        return m;
    }

    public static Map<String,String> getShiftKeys(){
        return shift_Keys;
    }

}