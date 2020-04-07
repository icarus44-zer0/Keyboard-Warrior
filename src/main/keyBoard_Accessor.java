package main;

import org.jnativehook.GlobalScreen;
import org.jnativehook.NativeHookException;
import org.jnativehook.keyboard.NativeKeyEvent;
import org.jnativehook.keyboard.NativeKeyListener;

import java.util.Map;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class keyBoard_Accessor implements NativeKeyListener {
	boolean shiftPress = false;
	String standardKey;
	String specialKey;
	String punctKey;

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
		String key = getKeyCodeValue(NativeKeyEvent.getKeyText(e.getKeyCode()));
		keyPressFunc(key);
	}

	@Override
	public void nativeKeyReleased(NativeKeyEvent e) {
		String key = NativeKeyEvent.getKeyText(e.getKeyCode());
		keyReleasedFunc(key);
	}

	@Override
	public void nativeKeyTyped(NativeKeyEvent e) {

	}

	public void isStandardKey(String key) {
		CircularBuffer buffer = CircularBuffer.getInstance();
		buffer.addToBuffer(key);
		standardKey = key;
	}

	public String getKeyCodeValue(String key){
		Map<String, String> mapKeyCode = KeyCode_Identifier.getSpecialKeys();
		if(mapKeyCode.containsKey(key)) {
			return mapKeyCode.get(key);
		}

		return key;
	}

	public String getShiftValue(String key){
		Map<String, String> m = KeyCode_Identifier.getShiftKeys();
		if(m.containsKey(key)) {
			return m.get(key);
		}

		return key;
	}

	//Helper methods 
	public void keyPressFunc(String key){
		if(shiftPress == true){ 
			//while shift is press alone dont display anything
		}else{
			if(key.equals("Shift") || key.equals("Unknown keyCode: 0xe36")){
				shiftPress = true;
			}else{
				if(KeyCode_Identifier.isSpecialKey(key) == false){
					//specialKey = key;
				}else{
					isStandardKey(key.toLowerCase());
				}
			}
		}
	}

	//Helper methods
	public void keyReleasedFunc(String key){
		//if shift key is pressed and not released then display a shift key value
		if(shiftPress == true && !key.equals("Shift") && !key.equals("Unknown keyCode: 0xe36")){
			isStandardKey(getShiftValue(key.toUpperCase()));
		}else{
			shiftPress = false;
		}
	}

}