package main;

public final class CircularBuffer extends CircularFifoBuffer {
    private static CircularBuffer INSTANCE;
    private static final int MAX_BUFFER_SIZE = 10;
    private static CircularFifoBuffer _buffer = new CircularFifoBuffer(MAX_BUFFER_SIZE);
     
    private CircularBuffer() {        
    }
     
    public static CircularBuffer getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new CircularBuffer();
        }
         
        return INSTANCE;
    }
 
    public CircularFifoBuffer getBuffer(){
        return _buffer;
    }

    public void setBuffer(CircularFifoBuffer buffer){
        _buffer.equals(buffer);
    }

    public void addToBuffer(String key){
        _buffer.add(key);
    }

    public boolean isFull(){
       return _buffer.isFull();
    }
    public String toString(){
        return _buffer.toString();
     }
}