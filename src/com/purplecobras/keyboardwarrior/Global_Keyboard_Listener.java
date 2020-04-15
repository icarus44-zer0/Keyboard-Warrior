package com.purplecobras.keyboardwarrior;

import org.jnativehook.GlobalScreen;
import org.jnativehook.NativeHookException;
import org.jnativehook.keyboard.NativeKeyEvent;
import org.jnativehook.keyboard.NativeKeyListener;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Global_Keyboard_Listener implements NativeKeyListener {

	Global_Keyboard_Listener() {

	}

	public void setup() {
		try {
			GlobalScreen.registerNativeHook();
		} catch (NativeHookException e) {
			e.printStackTrace();
		}
		GlobalScreen.addNativeKeyListener(new Global_Keyboard_Listener());

		Logger logger = Logger.getLogger(GlobalScreen.class.getPackage().getName());
		logger.setLevel(Level.OFF);

		Handler[] handlers = Logger.getLogger("").getHandlers();
		for (int i = 0; i < handlers.length; i++) {
			handlers[i].setLevel(Level.OFF);
		}
	}

	@Override
    public void nativeKeyPressed(NativeKeyEvent e) {
        String key_Raw = NativeKeyEvent.getKeyText(e.getKeyCode());
        key_Raw = KeyCode_Interpreter.formatKeyCode(key_Raw);
        KeyCode_Interpreter.interpretKeyPress(key_Raw);
    }

	@Override
	public void nativeKeyReleased(NativeKeyEvent e) {
		String key = NativeKeyEvent.getKeyText(e.getKeyCode());
		KeyCode_Interpreter.keyReleasedFunc(key);
	}

	@Override
	public void nativeKeyTyped(NativeKeyEvent e) {

	}
}