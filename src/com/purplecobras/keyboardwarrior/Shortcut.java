package com.purplecobras.keyboardwarrior;


public class Shortcut {
    private String _scKey;
    private String _scValue;

    public Shortcut(){
        this._scKey = null;
        this._scValue = null;
    }


    public Shortcut(String key, String value) {
        this._scKey = key;
        this._scValue = value;
    }

    public String get_scKey() {
        return _scKey;
    }

    public void set_scKey(String key) {
        this._scKey = key;
    }

    public String get_scValue() {
        return _scValue;
    }

    public void set_scValue(String value) {
        this._scValue = value;
    }


}