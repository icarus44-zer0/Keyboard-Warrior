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
    public static Buffer buf = new CircularFifoBuffer(10);
    String currentKey;
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
        if (isSpecialKey(NativeKeyEvent.getKeyText(e.getKeyCode())) == false) {
			this.specialKey = NativeKeyEvent.getKeyText(e.getKeyCode());
		else if (isPunctKey(NativeKeyEvent.getKeyText(e.getKeyCode())) == false) {
            this.punctKey = NativeKeyEvent.getKeyText(e.getKeyCode());
        } else {
            currentKey = NativeKeyEvent.getKeyText(e.getKeyCode());
            System.out.print(currentKey);
        }
    }

    @Override
    public void nativeKeyReleased(NativeKeyEvent e) {

    }

    @Override
    public void nativeKeyTyped(NativeKeyEvent e) {

    }

    public String get_currentKey(){
        String ret = this.currentKey;
        return ret;
    }

    public String get_specialKey(){
        String ret = specialKey;
        return ret;
    }

    private boolean isSpecialKey(String key) {
		switch(key) {
		  case "Tab":
				  return false;
		  case "Space":
			  	//buf.clear();
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
			  	//buf.clear();
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
		  case "Back Quote":
			  	return false;
		  case "Minus":
			  	return false;
		  case "Equals":
			  	return false;
		  case "Open Bracket":
			  	return false;
		  case "Close Bracket":
			  	return false;
		  case "Semicolon":
			  	return false;
		  case "Quote":
			  	return false;
		  case "Comma":
			  	return false;
		  case "Period":
			  	return false;
		  case "Slash":
			  	return false;
		  case "Back Slash":
			  	return false;
		  default:
			  	return true;
		}
	}
	private boolean isPunctKey(String key) {
		switch(key) {
		  case "Space":
				System.out.print(" ");
				break;
		  case "Return":
			  	System.out.println();
				break;
		  case "Enter":
			  	System.out.println();
			  	break;
		  case "Tab":
			  	System.out.print("\t");
			  	break;
		  case "Back Quote":
				System.out.print("`");
				break;
		  case "Minus":
			  	System.out.print("-");
				break;
		  case "Equals":
			  	System.out.print("=");
			  	break;
		  case "Open Bracket":
			  	System.out.print("[");
			  	break;
		  case "Close Bracket":
			  	System.out.print("]");
				break;
		  case "Semicolon":
			  	System.out.print(";");
			  	break;
		  case "Quote":
			  	System.out.print("'");
			  	break;
		  case "Comma":
				System.out.print(",");
				break;
		  case "Period":
			  	System.out.print(".");
				break;
		  case "Slash":
			  	System.out.print("/");
			  	break;
		  case "Back Slash":
			  	System.out.print("\\");
			  		break;
		  default:
			  	return;
		}
    }
    public static void textExpander(Buffer buf){
		String temp = "";
		
		try {
			textExpanderData();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		Object[] arr = buf.toArray();
		for(int i = 0; i < arr.length; i++) {
			temp += arr[i];
		}
		
		temp = temp.toLowerCase();
		
		if(m.containsKey(temp)) {
			System.out.println(m.get(temp));
		}
	}
	private static void textExpanderData() {
	}
}