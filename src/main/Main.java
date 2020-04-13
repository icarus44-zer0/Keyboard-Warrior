package main;


public class Main {
	public static final int MAX_BUFFER_SIZE = 10;

	public static void main(String[] args) {
		keyBoard_Accessor keyListner = new keyBoard_Accessor();
		keyListner.setup();

		while (true) {
			Shortcut_Buffer buffer = Shortcut_Buffer.getBuffer();
			System.out.println(buffer.toString());
			
		}
	}
}