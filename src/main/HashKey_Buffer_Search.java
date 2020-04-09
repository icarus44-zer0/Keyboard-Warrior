package main;

import java.util.HashMap;

public class HashKey_Buffer_Search{
    CircularFifoBuffer _buffer;
    HashMap<String, String> _shortcut_Map;

    HashKey_Buffer_Search(){
        _buffer = TextExpander_Buffer.getBuffer();
        _shortcut_Map = new HashMap<String, String>();
        _shortcut_Map = hashMap_IO.hashMap_In(_shortcut_Map);
    }

    public void search(){
        //_buffer.
    }
    


}