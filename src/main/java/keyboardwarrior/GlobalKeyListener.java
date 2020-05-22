package keyboardwarrior;

import org.jnativehook.GlobalScreen;
import org.jnativehook.NativeHookException;
import org.jnativehook.keyboard.NativeKeyEvent;
import org.jnativehook.keyboard.NativeKeyListener;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;


public class GlobalKeyListener implements NativeKeyListener {

	private static KeyInterpreter interpreter;
	private String key;
	private String key_Raw;

	private keyInterpreterV2 interpreter2;
	/**
	 * 
	 */
	GlobalKeyListener() {
		//interpreter = KeyInterpreter.getInstance();
		interpreter2 = new keyInterpreterV2();
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
		GlobalScreen.addNativeKeyListener(new GlobalKeyListener());

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
		interpreter2.interpret(e.getKeyCode());

		/**
		 * Version 1
		 */
			// key_Raw = NativeKeyEvent.getKeyText(e.getKeyCode());
			// key_Raw = interpreter.formatKeyCode(key_Raw);
			// interpreter.interpretKeyPress(key_Raw);
	}

	/**
	 * @param NativeKeyEvent
	 * 
	 */
	@Override
	public void nativeKeyReleased(NativeKeyEvent e) {
		interpreter2.keyRelesed(e.getKeyCode());
		/**
		 * Version 1
		 */
			// key = NativeKeyEvent.getKeyText(e.getKeyCode());
			// interpreter.keyReleasedFunc(key);
	}

	/**
	 * @param NativeKeyEvent
	 * 
	 */
	@Override
	public void nativeKeyTyped(NativeKeyEvent e) {

	}
}