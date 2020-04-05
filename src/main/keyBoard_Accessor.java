package main;

import org.jnativehook.GlobalScreen;
import org.jnativehook.NativeHookException;
import org.jnativehook.keyboard.NativeKeyEvent;
import org.jnativehook.keyboard.NativeKeyListener;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class keyBoard_Accessor implements NativeKeyListener {

    keyBoard_Accessor() {

    }

    public void setup(){
        try {
            GlobalScreen.registerNativeHook();
        } catch (NativeHookException e) {
            e.printStackTrace();
        }
        GlobalScreen.addNativeKeyListener(new keyBoard_Accessor());

        Logger logger = Logger.getLogger(GlobalScreen.class.getPackage().getName());
        logger.setLevel(Level.OFF);

        Handler[] handlers = Logger.getLogger("").getHandlers();
        for (int i = 0; i < handlers.length; i++) {
            handlers[i].setLevel(Level.OFF);
        }
    }

    @Override
    public void nativeKeyPressed(NativeKeyEvent e) {
        if (isSpecialKey(NativeKeyEvent.getKeyText(e.getKeyCode())) == false) {
            // does nothing, except keep useless keys from outputting
        } else {
            // save the output of the following keys here
            System.out.print(NativeKeyEvent.getKeyText(e.getKeyCode()) + "");
        }
    }

    @Override
    public void nativeKeyReleased(NativeKeyEvent e) {

    }

    @Override
    public void nativeKeyTyped(NativeKeyEvent e) {

    }

    private boolean isSpecialKey(String key) {
        switch (key) {
            case "Tab":
                return false;
            case "Space":
                return false;
            case "Shift":
                return false;
            case "Return":
                return false;
            case "Delete":
                return false;
            case "Backspace":
                return false;
            case "Enter":
                return false;
            case "Ctrl":
                return false;
            case "Alt":
                return false;
            case "Meta":
                return false;
            case "Escape":
                return false;
            case "Undefined":
                return false;
            case "Left":
                return false;
            case "Down":
                return false;
            case "Right":
                return false;
            case "Up":
                return false;
            case "Unknown keyCode: 0xe36":
                return false;
            default:
                return true;
        }
    }
}