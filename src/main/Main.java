package main;

public class Main {
	public static final int MAX_BUFFER_SIZE = 10;

	public static void main(String[] args) {
		keyBoard_Accessor keyListner = new keyBoard_Accessor();
		keyListner.setup();
		Shortcut_Search search = new Shortcut_Search();
		String shortcut_str = "";
		String array[] = new;
		// while (true) {
		// 	CircularFifoBuffer buffer = Shortcut_Buffer.getBuffer();
		// 	System.out.println(buffer.toString());
		// 	shortcut_str = search.search_BufferforKeys();
		// 	if (shortcut_str != null)
		// 		System.out.println(shortcut_str);
		// }

		while (true) {
			CircularFifoBuffer buffer = Shortcut_Buffer.getBuffer();
			char_array.
			// shortcut_str = buffer.toString();
			// shortcut_str = shortcut_str.replace(",", "");
			// shortcut_str = shortcut_str.replace("[", "");
			// shortcut_str = shortcut_str.replace("]", "");
			System.out.println(buffer.toString());
		}
	}
}