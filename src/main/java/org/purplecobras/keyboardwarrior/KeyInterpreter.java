package main.java.org.purplecobras.keyboardwarrior;

import java.util.HashMap;

public class KeyInterpreter {
    private static KeyInterpreter instance = null;
    private KeyMap keyMap;
    private KeyBuffer buffer;
    private boolean shiftPress;

    /**
     * 
     */
    private KeyInterpreter() {
        keyMap = KeyMap.getInstance();
        buffer = KeyBuffer.getInstance();
        shiftPress = false;
    }

    /**
     * 
     * @return
     */

    public static KeyInterpreter getInstance() {
        if (instance == null) {
            instance = new KeyInterpreter();
        }
        return instance;
    }

    /**
     * 
     * @param key
     * @return
     */
    public boolean isSpecialKey(String key) {
        if (keyMap.getDeadKeyMap().containsValue(key)) {
            if (key.equals("Space") || key.equals("Enter") || key.equals("Return") || key.equals("Tab")) {
                instance.buffer.reset_Buffer();
            }
            return false;
        } else {
            return true;
        }
    }

    /**
     * 
     * @return
     */
    public HashMap<String, String> getSpecialKeys() {
        return keyMap.getCommandKeyMap();
    }

    /**
     * 
     * @return
     */
    public HashMap<String, String> getShiftKeys() {
        return keyMap.getShiftKeyMap();
    }

    /**
     * 
     * @param key
     */
    public void isStandardKey(String key) {
        instance.buffer.add(key);
        // Expand_Shortcut expand = Expand_Shortcut.getInstance();
        // expand.expand();
    }

    /**
     * 
     * @param key
     * @return
     */
    public String formatKeyCode(String key) {
        if (keyMap.getCommandKeyMap().containsKey(key)) {
            return keyMap.getCommandKeyMap().get(key);
        }
        return key;
    }

    /**
     * 
     * @param key
     * @return
     */
    public String getShiftValue(String key) {
        if (keyMap.getShiftKeyMap().containsKey(key)) {
            return keyMap.getShiftKeyMap().get(key);
        }

        return key;
    }

    /**
     * 
     */
    public void interpretKeyPress(String key) {
        if (shiftPress == true) {
            // while shift is press alone dont display anything
        } else {
            if (key.equals("Shift") || key.equals("Unknown keyCode: 0xe36")) {
                shiftPress = true;
            } else {
                if (!isSpecialKey(key) == false) {
                    isStandardKey(key.toLowerCase());
                } else if (keyMap.getCommandKeyMap().containsKey(key)) {
                    isStandardKey(keyMap.getCommandKeyMap().get(key));
                }
            }
        }
    }

    /**
     * Helper methods if shift key is pressed and not released then display a shift
     * key value
     * 
     * @param key
     */
    public void keyReleasedFunc(String key) {
        if (shiftPress == true && !key.equals("Shift") && !key.equals("Unknown keyCode: 0xe36")) {
            if (!isSpecialKey(key.toUpperCase()) == false) {
                isStandardKey(getShiftValue(key.toUpperCase()));
            }
        } else {
            shiftPress = false;
        }
    }

}