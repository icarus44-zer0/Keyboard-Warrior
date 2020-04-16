package com.purplecobras.keyboardwarrior;

import com.purplecobras.keyboardwarrior.file.Shortcut_Map;

public final class Buffer_Search{
    private static Buffer_Search _instance = null; 
    private Shortcut_Map shotcut_key = Shortcut_Map.getInstance();
    private String _key;
    private String _nextChar;
    private Object[] _buffer_array;

    private Buffer_Search(){

    }

    public static Buffer_Search get_Instance(){
        if (_instance == null){
            _instance = new Buffer_Search();
        }
        return _instance;
    }

    public Shortcut bufferSearch(KeyBoard_In_Buffer buffer){ 
        while(buffer.isFull()){
            _buffer_array = buffer.toArray();
            resetKey();
            for(int i = 0 ; i < buffer.size(); i++){
                _nextChar = (String) _buffer_array[buffer.size() - 1 - i];
                _key = _nextChar + _key;
                if (shotcut_key.getShortcut_Key().containsKey(_key)){
                    Shortcut shortcut = new Shortcut();
                    shortcut.set_scKey(_key);
                    shortcut.set_scValue(shotcut_key.getShortcut_Key().get(_key));
                    return shortcut;
                }
            }
        }
        return null;
    }

    private void resetKey() {
        _key = "";
    }
}