package keyboardwarrior;

import java.awt.Toolkit;
import java.awt.datatransfer.*;
import java.io.IOException;


public class ClipboardAccessor {

	ClipboardAccessor() {
	}

	/**
	 * 
	 * @return
	 * @throws IOException
	 */
	public static String readClipboard() throws IOException {
		Clipboard cb = Toolkit.getDefaultToolkit().getSystemClipboard();
		Transferable t = cb.getContents(null);
		try {
			String data = (String) t.getTransferData(DataFlavor.stringFlavor);
			return data;
		} catch (UnsupportedFlavorException e) {
		}
		return "";

	}

	/**
	 * 
	 * @param toClipbboard
	 */
	public static void writeClipboard(String toClipbboard) {
		StringSelection stringSelection = new StringSelection(toClipbboard);
		Clipboard cb = Toolkit.getDefaultToolkit().getSystemClipboard();
		cb.setContents(stringSelection, null);
	}
}
