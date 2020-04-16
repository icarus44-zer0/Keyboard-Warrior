package com.purplecobras.keyboardwarrior;

import org.jnativehook.GlobalScreen;
import org.jnativehook.NativeHookException;
import org.jnativehook.keyboard.NativeKeyEvent;
import org.jnativehook.keyboard.NativeKeyListener;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Purple Cobras
 * @version 0.0.1
 * @since 2020-04-16
 */
public class Global_Keyboard_Listener implements NativeKeyListener {

	/**
	 * 
	 */
	Global_Keyboard_Listener() {

	}

	/**
	 * 
	 */
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

	/**
	 * @param NativeKeyEvent
	 * 
	 */
	@Override
	public void nativeKeyPressed(NativeKeyEvent e) {
		String key_Raw = NativeKeyEvent.getKeyText(e.getKeyCode());
		key_Raw = KeyCode_Interpreter.formatKeyCode(key_Raw);
		KeyCode_Interpreter.interpretKeyPress(key_Raw);
	}

	/**
	 * @param NativeKeyEvent
	 * 
	 */
	@Override
	public void nativeKeyReleased(NativeKeyEvent e) {
		String key = NativeKeyEvent.getKeyText(e.getKeyCode());
		KeyCode_Interpreter.keyReleasedFunc(key);
	}

	/**
	 * @param NativeKeyEvent
	 * 
	 */
	@Override
	public void nativeKeyTyped(NativeKeyEvent e) {

	}
}