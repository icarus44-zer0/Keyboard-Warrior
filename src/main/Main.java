package main;

public class Main {
	public static final int MAX_BUFFER_SIZE = 10;

	public static void main(String[] args) {
		keyBoard_Accessor keyListner = new keyBoard_Accessor();
		Shortcut_Search search = Shortcut_Search.get_Instance();
		String shortcut = "";
		keyListner.setup();

		while (true) {
			Shortcut_Buffer buffer = Shortcut_Buffer.getBuffer();
			try {
				shortcut = search.search_BufferforKeys(buffer);
			} catch (Exception e) {
				//System.out.println("UNKNOWN ERROR");
			}
			System.out.println(shortcut);
		}
	}
}