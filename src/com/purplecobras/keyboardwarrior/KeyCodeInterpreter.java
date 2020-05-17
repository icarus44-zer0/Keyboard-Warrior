package com.purplecobras.keyboardwarrior;

import java.util.HashMap;

public class KeyCodeInterpreter {
    private static KeyCodeInterpreter instance = null;
    private boolean shiftPress;
    private DeadKeyMap dead_key;
    private CommandKeyMap command_key;
    private ShiftKeyMap shift_Key;
    private KeyboardInputBuffer buffer;

    /**
     * 
     */
    private KeyCodeInterpreter() {
        shiftPress = false;
        dead_key = DeadKeyMap.getInstance();
        command_key = CommandKeyMap.getInstance();
        shift_Key = ShiftKeyMap.getInstance();
        buffer = KeyboardInputBuffer.getInstance();
    }

    /**
     * 
     * @return
     */

    public static KeyCodeInterpreter getInstance() {
        if (instance == null) {
            instance = new KeyCodeInterpreter();
        }
        return instance;
    }

    /**
     * 
     * @param key
     * @return
     */
    public boolean isSpecialKey(String key) {
        if (instance.dead_key.get_DeadKey_Map().containsValue(key)) {
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
        return instance.command_key.get_CommandKey_Map();
    }

    /**
     * 
     * @return
     */
    public HashMap<String, String> getShiftKeys() {
        return instance.shift_Key.get_ShiftKey_Map();
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
        if (instance.command_key.get_CommandKey_Map().containsKey(key)) {
            return instance.command_key.get_CommandKey_Map().get(key);
        }

        return key;
    }

    /**
     * 
     * @param key
     * @return
     */
    public String getShiftValue(String key) {
        if (instance.shift_Key.get_ShiftKey_Map().containsKey(key)) {
            return instance.shift_Key.get_ShiftKey_Map().get(key);
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
                } else if (command_key.get_CommandKey_Map().containsKey(key)) {
                    isStandardKey(command_key.get_CommandKey_Map().get(key));
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