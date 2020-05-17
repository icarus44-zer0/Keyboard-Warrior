package com.purplecobras.keyboardwarrior;

import java.awt.Robot;
import java.util.concurrent.TimeUnit;

import com.purplecobras.keyboardwarrior.gui.v2.ShortcutFrame;

public class Main {
	public static final int MAX_BUFFER_SIZE = 10;

	public static void main(String[] args) {

		GlobalKeyboardListener listener = new GlobalKeyboardListener();
		KeyboardInputBuffer buffer = KeyboardInputBuffer.getInstance();
		BufferSearch search = BufferSearch.get_Instance();
		ShortcutFrame scf = new ShortcutFrame();
		Shortcut shortcut = new Shortcut();
		Robot robot;

		listener.setup();
		scf.ShortcutFrame_init();

		while (true) {
			try {
				shortcut = search.searchKBIBuffer(buffer);
				if (shortcut.get_Value() != null) {
					robot = new Robot();
					ClipboardAccessor.writeClipboard(shortcut.get_Value());
					InsertionPointAccessor.deleteKey(robot, shortcut.get_Key());

					/**
					 * Comment out for mac or for windows
					 * TODO implement properties build for Mac and Windows
					 * 
					 */
					//InsertionPointAccessor.pasteWindows(robot);
					InsertionPointAccessor.pasteMacOS(robot);

				}
				TimeUnit.MILLISECONDS.sleep(100);
			} catch (Exception e) {
				// System.out.println(e + "");
			}
		}
	}
}
