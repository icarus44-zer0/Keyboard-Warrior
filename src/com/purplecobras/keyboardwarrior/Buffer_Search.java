package com.purplecobras.keyboardwarrior;

import java.util.concurrent.TimeUnit;

/**
 * A Buffer Search class for searching a Circular Fifo. 
 * Singleton Class 
 * Builds all possible sequentail key combinations from buffer elements 
 * Compares key combinations to HashMap
 * Stores Key & Value pairs in a custom Shortcut Object
 *
 * @author Purple Cobras
 * @version 0.0.1
 * @since 2020-04-16
 */
public final class Buffer_Search {
    private static Buffer_Search instance = null;
    private Shortcut_Map shotcut_map;
    private Shortcut shortcut;
    private String element;
    private String nextChar;
    private Object[] bufferArray;

    /**
     * private contructor for Singleton class
     */
    private Buffer_Search() {

    }

    /**
     * Public get instance method to access Singleton Class
     * 
     * @return Buffer_Search
     */
    public static Buffer_Search get_Instance() {
        if (instance == null) {
            instance = new Buffer_Search();
            instance.shortcut = new Shortcut();
            instance.shotcut_map = Shortcut_Map.getInstance();
            instance.element = null;
            instance.nextChar = null;
            instance.bufferArray = null;
        }
        return instance;
    }

    /**
     * Search algorithm used to build all buffer element combinations Builds String
     * for each search element Compares search element to HashMap key set Builds new
     * Shortcu
     * 
     * @param Keyboard_In_Buffer
     * @return Shortcut
     * @throws InterruptedException
     */
    public Shortcut search_KBI_Buffer(Keyboard_In_Buffer buffer) throws InterruptedException {
            bufferArray = buffer.toArray();
            resetKey();
            for (int i = 0; i < buffer.size(); i++) {
                nextChar = (String) bufferArray[buffer.size() - 1 - i];
                element = nextChar + element;
                if (shotcut_map.shortcut_map.containsKey(element)) {
                    shortcut.set_Key(element);
                    shortcut.set_value(shotcut_map.get_Shortcut_Map().get(element));
                    return shortcut;
                }
            }
        TimeUnit.MILLISECONDS.sleep(10);
        return null;
    }


    /**
     * Resets Search element to be empty key for next search
     * TODO move back into search_KBI_Buffer
     */
    private void resetKey() {
        element = "";
    }
}