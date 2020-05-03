package com.purplecobras.keyboardwarrior;

/**
 *
 * @author Purple Cobras
 * @version 0.0.1
 * @since 2020-04-16
 */
public class Shortcut {
    private String _key;
    private String _value;

    /**
     * 
     */
    public Shortcut() {
        this._key = null;
        this._value = null;
    }

    /**
     * 
     */
    public Shortcut(String key, String value) {
        this._key = key;
        this._value = value;
    }

    /**
     * 
     * @return
     */
    public String get_Key() {
        return _key;
    }

    /**
     * 
     * @param key
     */
    public void set_Key(String key) {
        this._key = key;
    }

    /**
     * 
     * @return
     */
    public String get_Value() {
        return _value;
    }

    /**
     * 
     * @param value
     */
    public void set_value(String value) {
        this._value = value;
    }

    @Override
    public String toString() {
        return "Key: " + this._key + ", Value: " + this._value + "]";
    }

}