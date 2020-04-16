package com.purplecobras.keyboardwarrior;

import java.awt.Toolkit;
import java.awt.datatransfer.*;
import java.io.IOException;

public class Clipboard_Accessor {

	Clipboard_Accessor() {
	}

    public static String readClipboard() throws IOException{
		Clipboard cb = Toolkit.getDefaultToolkit().getSystemClipboard();
		Transferable t = cb.getContents(null);
		try{
			String data = (String) t.getTransferData(DataFlavor.stringFlavor);
			return data;
		}catch(UnsupportedFlavorException e) {}
		return "";
		
	}

	public static void writeClipboard(String toClipbboard){
		StringSelection stringSelection = new StringSelection(toClipbboard);
		Clipboard cb = Toolkit.getDefaultToolkit().getSystemClipboard();
		cb.setContents(stringSelection, null);
	}
}

// try{
//     System.out.println("Clipboard: " + readClipboard());
// }catch (IOException e) {
//     //TODO: handle exception
// }


// Clipboard_Accessor.writeClipboard("String goes here");