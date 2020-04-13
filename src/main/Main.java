package main;

public class Main {
	public static final int MAX_BUFFER_SIZE = 10;

	public static void main(String[] args) {
		keyBoard_Accessor keyListner = new keyBoard_Accessor();
		Shortcut_Search search = new Shortcut_Search();
		String shortcut = "";
		keyListner.setup();

		while (true) {
			Shortcut_Buffer buffer = Shortcut_Buffer.getBuffer();
			shortcut = search.search_BufferforKeys(buffer);
			//if(!shortcut.equals(""))
				System.out.println(shortcut);
		}
	}
}