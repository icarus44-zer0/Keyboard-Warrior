package com.purplecobras.keyboardwarrior;

import org.jnativehook.GlobalScreen;
import org.jnativehook.NativeHookException;
import org.jnativehook.keyboard.NativeKeyEvent;
import org.jnativehook.keyboard.NativeKeyListener;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Global_Keyboard_Listener implements NativeKeyListener {
	private static KeyCode_Interpreter interpreter;
	private String key;
	private String key_Raw;

	/**
	 * 
	 */
	Global_Keyboard_Listener() {
		interpreter = KeyCode_Interpreter.getInstance();
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

		//TODO remove mouse events 
		// GlobalScreen.removeNativeMouseWheelListener(arg0);
		// GlobalScreen.removeNativeMouseListener(arg0);
		// GlobalScreen.removeNativeMouseMotionListener(arg0);
		

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
		key_Raw = NativeKeyEvent.getKeyText(e.getKeyCode());
		key_Raw = interpreter.formatKeyCode(key_Raw);
		interpreter.interpretKeyPress(key_Raw);
	}

	/**
	 * @param NativeKeyEvent
	 * 
	 */
	@Override
	public void nativeKeyReleased(NativeKeyEvent e) {
		key = NativeKeyEvent.getKeyText(e.getKeyCode());
		interpreter.keyReleasedFunc(key);
	}

	/**
	 * @param NativeKeyEvent
	 * 
	 */
	@Override
	public void nativeKeyTyped(NativeKeyEvent e) {

	}
}