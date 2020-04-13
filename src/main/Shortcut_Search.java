package main;

import java.util.HashMap;

public final class Shortcut_Search{
    private static Shortcut_Search _instance = null; 
    private HashMap<String, String> _shortcut_Map;
    private String _key;
    private String _nextChar;
    private Object[] _buffer_array;

    private Shortcut_Search(){
        _shortcut_Map = new HashMap<String, String>();          // move to seperate class sington 
        _shortcut_Map = hashMap_IO.hashMap_In(_shortcut_Map);   // move to seperate class sington
    }

    public static Shortcut_Search get_Instance(){
        if (_instance == null){
            _instance = new Shortcut_Search();
        }
        return _instance;
    }

    public String search_BufferforKeys(Shortcut_Buffer buffer){ 
        while(buffer.isFull()){
            _buffer_array = buffer.toArray();
            resetKey();
            for(int i = 0 ; i < buffer.size(); i++){
                _nextChar = (String) _buffer_array[buffer.size() - 1 - i];
                _key = _nextChar + _key;
                if (_shortcut_Map.containsKey(_key)){
                    return _shortcut_Map.get(_key);
                }
            }
        }
        return null;
    }

    private void printAllKeys(String _key,int i) {
        System.out.println("KEY_INDEX: " + i + " "+ "KEY: " + _key);
    }

    private void resetKey() {
        _key = "";
    }
}