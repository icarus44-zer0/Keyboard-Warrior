package com.purplecobras.keyboardwarrior;

/**
 *
 * @author Purple Cobras
 * @version 0.0.1
 * @since 2020-04-16
 */
public class Shortcut {
    private String _scKey;
    private String _scValue;

    /**
     * 
     */
    public Shortcut() {
        this._scKey = null;
        this._scValue = null;
    }

    /**
     * 
     */
    public Shortcut(String key, String value) {
        this._scKey = key;
        this._scValue = value;
    }

    /**
     * 
     * @return
     */
    public String get_scKey() {
        return _scKey;
    }

    /**
     * 
     * @param key
     */
    public void set_scKey(String key) {
        this._scKey = key;
    }

    /**
     * 
     * @return
     */
    public String get_scValue() {
        return _scValue;
    }

    /**
     * 
     * @param value
     */
    public void set_scValue(String value) {
        this._scValue = value;
    }

    @Override
    public String toString() {
        return "[Sc_Key: " + this._scKey + ", _scValue: " + this._scValue + "]";
    }

}