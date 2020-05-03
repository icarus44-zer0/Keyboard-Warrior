package com.purplecobras.keyboardwarrior;

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
    private static Buffer_Search _instance = null;
    private static Shortcut_Map _shotcut_map;
    private static Shortcut _shortcut;
    private static String _element;
    private static String _nextChar;
    private static Object[] _bufferArray;

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
            _shortcut = new Shortcut();
            _shotcut_map = Shortcut_Map.getInstance();
            _element = null;
            _nextChar = null;
            _bufferArray = null;
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
        _shotcut_map = Shortcut_Map.getInstance();
        while (buffer.isFull()) {
            _bufferArray = buffer.toArray();
            resetKey();
            for (int i = 0; i < buffer.size(); i++) {
                _nextChar = (String) _bufferArray[buffer.size() - 1 - i];
                _element = _nextChar + _element;
                if (_shotcut_map.get_Shortcut_Map().containsKey(_element)) {
                    _shortcut.set_Key(_element);
                    _shortcut.set_value(_shotcut_map.get_Shortcut_Map().get(_element));
                    return _shortcut;
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