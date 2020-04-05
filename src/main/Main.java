package main;
import java.nio.Buffer;

public class Main{
	public static final int MAX_BUFFER_SIZE = 10;

	public static void main(String[] args) {
		keyBoard_Accessor keyListner = new keyBoard_Accessor();
		CircularFifoBuffer buffer = new CircularFifoBuffer(MAX_BUFFER_SIZE);

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