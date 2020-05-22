package keyboardwarrior;

import org.jnativehook.GlobalScreen;
import org.jnativehook.NativeHookException;
import org.jnativehook.keyboard.NativeKeyEvent;
import org.jnativehook.keyboard.NativeKeyListener;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;


public class GlobalKeyListener implements NativeKeyListener {

	private KeyInterpreter interpret;
	/**
	 * 
	 */
	GlobalKeyListener() {
		//interpreter = KeyInterpreter.getInstance();
		interpret = new KeyInterpreter();
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
		interpret.modifierPressed(e.getKeyCode());
		interpret.interpret(e.getKeyCode());
	}

	/**
	 * @param NativeKeyEvent
	 * 
	 */
	@Override
	public void nativeKeyReleased(NativeKeyEvent e) {
		interpret.modifierRelesed(e.getKeyCode());
	}

	/**
	 * @param NativeKeyEvent
	 * 
	 */
	@Override
	public void nativeKeyTyped(NativeKeyEvent e) {

	}
}