package com.purplecobras.keyboardwarrior;

import java.awt.Robot;
import java.util.HashMap;

public class Main {
	public static final int MAX_BUFFER_SIZE = 10;

	public static void main(String[] args) {
		// textExpanderInterface.printFrame();
		Global_Keyboard_Listener listener = new Global_Keyboard_Listener();
		Shortcut shortcut = new Shortcut();
		Buffer_Search search = Buffer_Search.get_Instance();

		
		//will be romoved in new main class
		HashMap<String,String> short_cut = new HashMap<String,String>();
		short_cut = HashMap_File_Reader.hashMap_In(short_cut);

		listener.setup();

		//Paste_debug();

		while (true) {
			KeyBoard_In_Buffer buffer = KeyBoard_In_Buffer.getBuffer();
			try {
				Robot robot = new Robot();
				shortcut = search.bufferSearch(buffer);	
				if (shortcut.get_scValue() != null) {
					Clipboard_Accessor.writeClipboard(shortcut.get_scValue());
					Insertion_Point_Accessor.delete_sckey(robot,shortcut.get_scKey());
					Insertion_Point_Accessor.paste_scKey(robot);
				}
			} catch (Exception e) {
				// System.out.println(e + "");
			}
		}
	}
}
