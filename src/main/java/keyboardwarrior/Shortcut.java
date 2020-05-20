package keyboardwarrior;


public class Shortcut {
    private String key;
    private String value;
    //private String description;

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
    public String getKey() {
        return key;
    }

    /**
     * 
     * @param key
     */
    public void setKey(String key) {
        this.key = key;
    }

    /**
     * 
     * @return
     */
    public String getValue() {
        return value;
    }

    /**
     * 
     * @param value
     */
    public void setvalue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Key: " + this.key + ", Value: " + this.value + "]";
    }

}