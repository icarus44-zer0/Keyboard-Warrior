package main.java.org.purplecobras.keyboardwarrior;

import java.util.concurrent.TimeUnit;

/**
 * A Buffer Search class for searching a Circular Fifo. Singleton Class Builds
 * all possible sequentail key combinations from buffer elements Compares key
 * combinations to HashMap Stores Key & Value pairs in a custom Shortcut Object
 */

public final class BufferSearch {
    private static BufferSearch instance = null;
    private ShortcutMap shotcut_map;
    private Shortcut shortcut;
    private String element;
    private String nextChar;
    private Object[] bufferArray;

    /**
     * private contructor for Singleton class
     */
    private BufferSearch() {

    }

    /**
     * Public get instance method to access Singleton Class
     * 
     * @return Buffer_Search
     */
    public static BufferSearch get_Instance() {
        if (instance == null) {
            instance = new BufferSearch();
            instance.shortcut = new Shortcut();
            instance.shotcut_map = ShortcutMap.getInstance();
            instance.element = null;
            instance.nextChar = null;
            instance.bufferArray = null;
        }
        return instance;
    }

    /**
     * Search algorithm used to build all buffer element combinations Builds String
     * for each search element Compares search element to HashMap key set Builds new
     * Shortcu
     * 
     * @param KeyBuffer
     * @return Shortcut
     * @throws InterruptedException
     */
    public Shortcut searchKBIBuffer(KeyBuffer buffer) throws InterruptedException {
        bufferArray = buffer.toArray();
        resetKey();
        for (int i = 0; i < buffer.size(); i++) {
            nextChar = (String) bufferArray[buffer.size() - 1 - i];
            element = nextChar + element;
            if (shotcut_map.shortcut_map.containsKey(element)) {
                shortcut.set_Key(element);
                shortcut.set_value(shotcut_map.get_Shortcut_Map().get(element));
                return shortcut;
            }
        }
        TimeUnit.MILLISECONDS.sleep(10);
        return null;
    }

    /**
     * Resets Search element to be empty key for next search TODO move back into
     * search_KBI_Buffer
     */
    private void resetKey() {
        element = "";
    }
}