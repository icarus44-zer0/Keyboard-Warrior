package main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class KeyCode_Identifier {

    public static Map<String, String> m = new HashMap<String, String>();
    public static ArrayList<String> mBool = new ArrayList<String>();

    public static boolean isSpecialKey(String key, Buffer buf) {
        setUp();
        isSpacingKeys(key);

        if (mBool.contains(key)) {
            if (key.equals("Space") || key.equals("Enter") || key.equals("Return") || key.equals("Tap")) {
                buf.clear();
            }

            return false;
        } else {

            return true;
        }

    }

    public static void isSpacingKeys(String key) {
        if (m.containsKey(key)) {
            System.out.print(m.get(key));
        }

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

    public static Map setUpSpecialKeys() {
        return m;
    }

    public static void setUp() {
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

        // m.put("Space", " ");
        // m.put("Return", "\n");
        // m.put("Enter", "\n ");
        // m.put("Tab", " ");
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
        // m.put("Open Bracket", "[");
    }

}