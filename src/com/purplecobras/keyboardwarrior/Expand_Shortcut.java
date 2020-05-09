package com.purplecobras.keyboardwarrior;

import java.awt.Robot;
import java.util.concurrent.TimeUnit;

public class Expand_Shortcut {
    private static Expand_Shortcut instance = null;
    private Buffer_Search search = Buffer_Search.get_Instance();
    private Keyboard_In_Buffer buffer = Keyboard_In_Buffer.getInstance();
    private Shortcut shortcut = new Shortcut();
    private Robot robot;

    private Expand_Shortcut() {

    }

    public static Expand_Shortcut getInstance() {
        if (instance == null) {
            instance = new Expand_Shortcut();
        }
        return instance;
    }

    public void expand() {
        try {
            shortcut = search.search_KBI_Buffer(buffer);
            if (shortcut.get_Value() != null) {
                robot = new Robot();
                Clipboard_Accessor.writeClipboard(shortcut.get_Value());
                Insertion_Point_Accessor.delete_sckey(robot, shortcut.get_Key());
                Insertion_Point_Accessor.paste_Shortcut_Value(robot);
            }
            TimeUnit.MILLISECONDS.sleep(100);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
