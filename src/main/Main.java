package main;

public class Main{
	public static final int MAX_BUFFER_SIZE = 10;

	public static void main(String[] args) {

		keyBoard_Accessor keyListner = new keyBoard_Accessor();
		CircularFifoBuffer buffer = new CircularFifoBuffer(MAX_BUFFER_SIZE);

		keyListner.setup();
		keyListner.setCircularBuffer(buffer);

		buffer = keyListner.getCircularBuffer();

		
		System.out.println(buffer.toString());
		 while(true){
			 if (buffer.isFull())
			 	System.out.print(buffer.toString());
			else 		 
				buffer = keyListner.getCircularBuffer();
		}
	}
}