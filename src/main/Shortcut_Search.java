package main;

import java.util.HashMap;

public class Shortcut_Search{
    HashMap<String, String> _shortcut_Map;
    String _key;
    Object[] _buffer_array;

    Shortcut_Search(){
        _shortcut_Map = new HashMap<String, String>();          // move to seperate class sington 
        _shortcut_Map = hashMap_IO.hashMap_In(_shortcut_Map);   // move to seperate class sington
    }

    public String search_BufferforKeys(Shortcut_Buffer buffer){  
        while(buffer.isFull()){
            _buffer_array = buffer.toArray();
            resetKey();
            for(int i = 0 ; i < buffer.size()-1; i++){
                _key += _buffer_array[buffer.size()-1-i];
                //printAllKeys(_key,i); //used for debugging
                if (_shortcut_Map.containsKey(_key)){
                    return _shortcut_Map.get(_key);
                }
            }
        }
        return null;
    }

    //used for debugging
    private void printAllKeys(String _key,int i) {
        System.out.println("KEY_INDEX: " + i + " "+ "KEY: " + _key);
    }

    private void resetKey() {
        _key = "";
    }
}