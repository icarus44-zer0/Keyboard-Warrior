package main.java.org.purplecobras.keyboardwarrior;


public class Shortcut {
    private String key;
    private String value;
    private String description;

    /**
     * 
     */
    public Shortcut() {
        this.key = null;
        this.value = null;
    }

    /**
     * 
     */
    public Shortcut(String key, String value) {
        this.key = key;
        this.value = value;
    }

    /**
     * 
     * @return
     */
    public String get_Key() {
        return key;
    }

    /**
     * 
     * @param key
     */
    public void set_Key(String key) {
        this.key = key;
    }

    /**
     * 
     * @return
     */
    public String get_Value() {
        return value;
    }

    /**
     * 
     * @param value
     */
    public void set_value(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Key: " + this.key + ", Value: " + this.value + "]";
    }

}