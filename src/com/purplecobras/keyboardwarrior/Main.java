package com.purplecobras.keyboardwarrior;

import java.awt.Robot;

/**
 *
 * @author Purple Cobras
 * @version 0.0.1
 * @since 2020-04-16
 */

public class Main {
	public static final int MAX_BUFFER_SIZE = 10;

	public static void main(String[] args) {
		//textExpanderInterface.printFrame();

		Global_Keyboard_Listener listener = new Global_Keyboard_Listener();
		listener.setup();
	
		mac();
		//windows();
	}

	private static void mac() {
		Shortcut shortcut = new Shortcut();
		Buffer_Search search = Buffer_Search.get_Instance();
		while (true) {
			KeyBoard_In_Buffer buffer = KeyBoard_In_Buffer.getBuffer();
			try {
				shortcut = search.bufferSearch(buffer);	
				if (shortcut.get_scValue() != null) {
					System.out.println(shortcut.toString());
				}
			} catch (Exception e) {
				// System.out.println(e + "");
			}
		}
	}

	private static void windows() {
		Shortcut shortcut = new Shortcut();
		Buffer_Search search = Buffer_Search.get_Instance();
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
