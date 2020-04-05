package main;
import jflac.util;

public class Main {

	public static void main(String[] args) {
		keyBoard_Accessor keyListner = new keyBoard_Accessor();
		RingBuffer buffer = new RingBuffer();


		keyListner.setup();
		String key = keyListner.get_currentKey();

		 while(true){
			 if (keyListner.get_currentKey() == null)
			 	key = keyListner.get_currentKey();
			else 		 
		 		System.out.println(key);
		}
	}
}