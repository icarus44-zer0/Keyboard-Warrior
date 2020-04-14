package com.purplecobras.keyboardwarrior;

public class Main {
	public static final int MAX_BUFFER_SIZE = 10;

	public static void main(String[] args) {
		Global_Keyboard_Listener listener = new Global_Keyboard_Listener();
		Buffer_Search search = Buffer_Search.get_Instance();
		
		listener.setup();

		String shortcut = "";

		while (true) {
			KeyBoard_In_Buffer buffer = KeyBoard_In_Buffer.getBuffer();
			try {
				shortcut = search.search_BufferforKeys(buffer);
				System.out.println(shortcut);
			} catch (Exception e) {
				//System.out.println(e + "");
			}
		}
	}
}

