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

	public void setup() {
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
		String key = KeyCode_Interpreter.getKeyCodeValue(NativeKeyEvent.getKeyText(e.getKeyCode()));
		KeyCode_Interpreter.keyPressFunc(key);
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