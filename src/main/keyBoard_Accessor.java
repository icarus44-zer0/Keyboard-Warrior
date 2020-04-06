package main;

import org.jnativehook.GlobalScreen;
import org.jnativehook.NativeHookException;
import org.jnativehook.keyboard.NativeKeyEvent;
import org.jnativehook.keyboard.NativeKeyListener;

import java.io.FileNotFoundException;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;



public class keyBoard_Accessor implements NativeKeyListener {
	String standardKey;
	String specialKey;
	String punctKey;
	CircularFifoBuffer buffer;
	Boolean keyFlag;
	public static final int MAX_BUFFER_SIZE = 10;

	keyBoard_Accessor() {
		buffer = new CircularFifoBuffer(MAX_BUFFER_SIZE);
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
		String key = NativeKeyEvent.getKeyText(e.getKeyCode());

		if (isSpecialKey(key) == true) {
			specialKey = key;
		} else if (isPunctKey(key) == true) {
			punctKey = key;
		} else {
			isStandardKey(key);
		}
	}

	@Override
	public void nativeKeyReleased(NativeKeyEvent e) {

	}

	@Override
	public void nativeKeyTyped(NativeKeyEvent e) {

	}

	public Boolean getKeyFlag() {
		return keyFlag;
	}

	public void setKeyFlag(){
		keyFlag = false;
	}

	public void setCircularBuffer(CircularFifoBuffer buffer){
		this.buffer = buffer;
	}

	public CircularFifoBuffer getCircularBuffer(){
		return buffer.to;
	}

	public void isStandardKey(String key){
		buffer.add(key);
		//System.out.println(key);
	}

	public void display(){
		System.out.println(buffer.toString());
	}

	private boolean isSpecialKey(String key) {
		switch (key) {
			case "Tab":
				return true;
			case "Space":
				// buf.clear();
				return true;
			case "Shift":
				return true;
			case "Return":
				return true;
			case "Delete":
				return true;
			case "Backspace":
				return true;
			case "Enter":
				// buf.clear();
				return true;
			case "Ctrl":
				return true;
			case "Alt":
				return true;
			case "Meta":
				return true;
			case "Escape":
				return true;
			case "Undefined":
				return true;
			case "Left":
				return true;
			case "Down":
				return true;
			case "Right":
				return true;
			case "Up":
				return true;
			case "Unknown keyCode: 0xe36":
				return true;
			case "Back Quote":
				return true;
			case "Minus":
				return true;
			case "Equals":
				return true;
			case "Open Bracket":
				return true;
			case "Close Bracket":
				return true;
			case "Semicolon":
				return true;
			case "Quote":
				return true;
			case "Comma":
				return true;
			case "Period":
				return true;
			case "Slash":
				return true;
			case "Back Slash":
				return true;
			default:
				return false;
		}
	}

	private boolean isPunctKey(String key) {
		switch (key) {
			case "Space":
				return true;
			case "Return":
				return true;
			case "Enter":
				return true;
			case "Tab":
				return true;
			case "Back Quote":
				return true;
			case "Minus":
				return true;
			case "Equals":
				return true;
			case "Open Bracket":
				return true;
			case "Close Bracket":
				return true;
			case "Semicolon":
				return true;
			case "Quote":
				return true;
			case "Comma":
				return true;
			case "Period":
				return true;
			case "Slash":
				return true;
			case "Back Slash":
				return true;
			default:
				return false;
		}
	}
}

// private boolean isPunctKey(String key) {
// switch(key) {
// case "Space":
//
// return true;
// case "Return":
// // return true;
// case "Enter":
// // return true;
// case "Tab":
// ;
// return true;
// case "Back Quote":
//
// return true;
// case "Minus":
//
// return true;
// case "Equals":
//
// return true;
// case "Open Bracket":
//
// return true;
// case "Close Bracket":
//
// return true;
// case "Semicolon":
//
// return true;
// case "Quote":
//
// return true;
// case "Comma":
//
// return true;
// case "Period":
//
// return true;
// case "Slash":
//
// return true;
// case "Back Slash":
// Sy/ return true;
// default:
// return;
// }
// }
// public static void textExpander(Buffer buf){
// String ret = "";

// try {
// textExpanderData();
// } catch (FileNotFoundException e) {
// e.printStackTrace();
// }

// Object[] arr = buf.toArray();
// for(int i = 0; i < arr.length; i++) {
// ret += arr[i];
// }

// ret = ret.toLowerCase();

// if(m.containsKey(ret)) {
// System.out.println(m.get(ret));
// }
// }
// private static void textExpanderData() {
// }