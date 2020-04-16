package com.purplecobras.keyboardwarrior;

/**
 * Buffer Search class for searching a Circular Fifo. Singleton Class Builds key
 * combinations from all buffer elements Compares key combinations to HashMap
 * Stores Key & Value pairs in a custom Shortcut Object
 *
 * @author Purple Cobras
 * @version 0.0.1
 * @since 2020-04-16
 */
public final class Buffer_Search {
    private static Buffer_Search _instance = null;
    private Shortcut_Map _shotcut_key = Shortcut_Map.getInstance();
    private String _element;
    private String _nextChar;
    private Object[] _buffer_array;

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
        if (_instance == null) {
            _instance = new Buffer_Search();
        }
        return _instance;
    }

    /**
     * Search algorithm used to build all buffer element combinations Builds String
     * for each search element Compares search element to HashMap key set Builds new
     * Shortcu
     * 
     * @param KeyBoard_In_Buffer
     * @return Shortcut
     */
    public Shortcut bufferSearch(KeyBoard_In_Buffer buffer) {
        while (buffer.isFull()) {
            _buffer_array = buffer.toArray();
            resetKey();
            for (int i = 0; i < buffer.size(); i++) {
                _nextChar = (String) _buffer_array[buffer.size() - 1 - i];
                _element = _nextChar + _element;
                if (_shotcut_key.getShortcut_Key().containsKey(_element)) {
                    Shortcut shortcut = new Shortcut();
                    shortcut.set_scKey(_element);
                    shortcut.set_scValue(_shotcut_key.getShortcut_Key().get(_element));
                    return shortcut;
                }
            }
        }
        return null;
    }

    /**
     * Resets Search element to be empty key for next search
     */
    private void resetKey() {
        _element = "";
    }
}