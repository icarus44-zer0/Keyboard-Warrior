package com.purplecobras.keyboardwarrior;

import java.awt.Robot;
import java.util.concurrent.TimeUnit;

import com.purplecobras.keyboardwarrior.gui.v2.ShortcutFrame;

/**
 * @author Josh Poe
 * @version 1.0.1
 * @since 2020-05-09
 */

public class Main {
	public static final int MAX_BUFFER_SIZE = 10;

	public static void main(String[] args) {

		Global_Keyboard_Listener listener = new Global_Keyboard_Listener();
		Keyboard_In_Buffer buffer = Keyboard_In_Buffer.getInstance();
		Buffer_Search search = Buffer_Search.get_Instance();
		ShortcutFrame scf = new ShortcutFrame();
		Shortcut shortcut = new Shortcut();
		Robot robot;

		listener.setup();
		scf.ShortcutFrame_init();

	
		//  Shortcut_Map shortcut_Map = Shortcut_Map.getInstance();
		//  String[] keyArray = shortcut_Map.get_Shortcut_Map().keySet().toArray(new String[0]);
		//  String[] valueArray = shortcut_Map.get_Shortcut_Map().values().toArray(new String[0]);
		//  System.out.println(Arrays.toString(keyArray));
		//  System.out.println(Arrays.toString(valueArray));

		while (true) {
			try {
				shortcut = search.search_KBI_Buffer(buffer);
				if (shortcut.get_Value() != null) {
					robot = new Robot();
					Clipboard_Accessor.writeClipboard(shortcut.get_Value());
					Insertion_Point_Accessor.delete_sckey(robot, shortcut.get_Key());
					//Insertion_Point_Accessor.paste_Shortcut_Value_Windows(robot);
					Insertion_Point_Accessor.paste_Shortcut_Value_MacOS(robot);
				}
				TimeUnit.MILLISECONDS.sleep(100);
			} catch (Exception e) {
				// System.out.println(e + "");
			}
		}
	}
}
