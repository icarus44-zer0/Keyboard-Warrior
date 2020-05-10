package com.purplecobras.keyboardwarrior;

import java.awt.Toolkit;
import java.awt.datatransfer.*;
import java.io.IOException;

/**
 * @author Josh Poe
 * @version 1.0.1
 * @since 2020-05-09
 */
public class Clipboard_Accessor {

	//TODO make into singlton 
	Clipboard_Accessor() {
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
