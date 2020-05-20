package main.java.org.purplecobras.keyboardwarrior;

import java.awt.Robot;
import java.util.concurrent.TimeUnit;

import main.java.org.purplecobras.keyboardwarrior.gui.ShortcutFrame;


public class Main {
	public static final int MAX_BUFFER_SIZE = 10;

	public static void main(String[] args) {

		GlobalKeyListener listener = new GlobalKeyListener();
		KeyBuffer buffer = KeyBuffer.getInstance();
		BufferSearch search = BufferSearch.getInstance();
		ShortcutFrame scf = new ShortcutFrame();
		Shortcut shortcut = new Shortcut();
		Robot robot;

		listener.setup();
		scf.ShortcutFrame_init();

		while (true) {
			try {
				shortcut = search.searchKBIBuffer(buffer);
				if (shortcut.getValue() != null) {
					robot = new Robot();
					ClipboardAccessor.writeClipboard(shortcut.getValue());
					InsertionPointAccessor.deleteKey(robot, shortcut.getKey());

					/**
					 * Comment out for mac or for windows
					 * TODO implement properties build for Mac and Windows
					 * 
					 */
					InsertionPointAccessor.pasteWindows(robot);
					//InsertionPointAccessor.pasteMacOS(robot);

				}
				TimeUnit.MILLISECONDS.sleep(100);
			} catch (Exception e) {
				// System.out.println(e + "");
			}
		}
	}
}
