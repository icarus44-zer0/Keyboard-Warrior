package com.purplecobras.keyboardwarrior;

//mport com.purplecobras.keyboardwarrior.gui.GUI_V2;
import com.purplecobras.keyboardwarrior.gui.GUI_KBW;

import java.awt.Robot;

/**
 *
 * @author Purple Cobras
 * @version 0.0.1
 * @since 2020-04-16
 */

public class KeyBoardWarrior {
	public static final int MAX_BUFFER_SIZE = 10;

	public static void main(String[] args) {

		Global_Keyboard_Listener listener = new Global_Keyboard_Listener();
		Buffer_Search search = Buffer_Search.get_Instance();
		Shortcut shortcut = new Shortcut();

		GUI_KBW.GUI_Init();

		listener.setup();

		while (true) {
			KeyBoard_In_Buffer buffer = KeyBoard_In_Buffer.getBuffer();
			try {
				Robot robot = new Robot();
				shortcut = search.bufferSearch(buffer);
				if (shortcut.get_Value() != null) {
					Clipboard_Accessor.writeClipboard(shortcut.get_Value());
					Insertion_Point_Accessor.delete_sckey(robot, shortcut.get_Key());
					Insertion_Point_Accessor.paste_Shortcut_Value(robot);
				}
			} catch (Exception e) {
				// System.out.println(e + "");
			}
		}
	}
}
