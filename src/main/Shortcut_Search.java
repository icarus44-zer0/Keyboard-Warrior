package main;

import java.util.HashMap;

public class Shortcut_Search{
    HashMap<String, String> _shortcut_Map;
    String _key;
    String _nextChar;
    Object[] _buffer_array;

    Shortcut_Search(){
        _shortcut_Map = new HashMap<String, String>();          // move to seperate class sington 
        _shortcut_Map = hashMap_IO.hashMap_In(_shortcut_Map);   // move to seperate class sington
    }

    public String search_BufferforKeys(Shortcut_Buffer buffer){ 
        //StringBuilder sb = new StringBuilder(); 
        while(buffer.isFull()){
            _buffer_array = buffer.toArray();
            resetKey();
            for(int i = 0 ; i < buffer.size(); i++){
                _nextChar = (String) _buffer_array[buffer.size() - 1 - i];
                _key = _nextChar + _key;
               // printAllKeys(_key,i); //used for debugging
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