package main;

import java.util.HashMap;

public class Shortcut_Search{
    CircularFifoBuffer _buffer;
    HashMap<String, String> _shortcut_Map;
    String _key;
    String _buffer_array[];

    Shortcut_Search(){
        _buffer = Shortcut_Buffer.getBuffer();
        _shortcut_Map = new HashMap<String, String>();          // move to seperate class sington 
        _shortcut_Map = hashMap_IO.hashMap_In(_shortcut_Map);   // move to seperate class sington
    }

    // public String search_BufferforKeys(){
    //     _buffer_array = (String[]) _buffer.toArray();
    //     _buffer_Str = _buffer_Str.replace(",", "");
    //     _buffer_Str = _buffer_Str.replace("[", "");
    //     _buffer_Str = _buffer_Str.replace("]", "");

    //     for(int i = 0 ; i < 10; i++){
    //         _key += _buffer_Str.charAt(9 - i);
    //         if (_shortcut_Map.containsKey(_key)){
    //             return _shortcut_Map.get(_key);
    //         }
    //     }
    //     return null;
    // }
}