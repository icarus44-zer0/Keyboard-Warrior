package keyboardwarrior;

import java.awt.Robot;
import java.util.concurrent.TimeUnit;

import org.jnativehook.example.NativeHookDemo;
import keyboardwarrior.gui.ShortcutFrame;


public class KeyboardWarrior {

	public static void main(String[] args) {

		GlobalKeyListener listener = new GlobalKeyListener();
		KeyBuffer buffer = KeyBuffer.getInstance();
		BufferSearch search = BufferSearch.getInstance();
		ShortcutFrame scf = new ShortcutFrame();
		Shortcut shortcut = new Shortcut();
		Robot robot;
		
		//NativeHookDemo.main(args);

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
