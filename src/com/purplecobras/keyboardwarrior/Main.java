package com.purplecobras.keyboardwarrior;

import java.awt.Robot;
import java.util.concurrent.TimeUnit;

import com.purplecobras.keyboardwarrior.gui.v1.GUI_KBW;

/**
 * @author Josh Poe
 * @version 1.0.1
 * @since 2020-05-09
 */

public class Main {
	public static final int MAX_BUFFER_SIZE = 10;

	public static void main(String[] args) {

		GlobalKeyboardListener listener = new GlobalKeyboardListener();
		KeyboardInputBuffer buffer = KeyboardInputBuffer.getInstance();
		BufferSearch search = BufferSearch.get_Instance();
		Shortcut shortcut = new Shortcut();
		Robot robot;

		GUI_KBW.GUI_Init();
		listener.setup();

		while (true) {
			try {
				shortcut = search.search_KBI_Buffer(buffer);
				if (shortcut.get_Value() != null) {
					robot = new Robot();
					ClipboardAccessor.writeClipboard(shortcut.get_Value());
					InsertionPointAccessor.delete_sckey(robot, shortcut.get_Key());
					InsertionPointAccessor.paste_Shortcut_Value_Windows(robot);
					//Insertion_Point_Accessor.paste_Shortcut_Value_MacOS(robot);
				}
				TimeUnit.MILLISECONDS.sleep(100);
			} catch (Exception e) {
				// System.out.println(e + "");
			}
		}
	}
}
