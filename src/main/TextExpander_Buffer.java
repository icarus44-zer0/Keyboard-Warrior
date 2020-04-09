package main;


public final class TextExpander_Buffer{
    private static final int MAX_BUFFER_SIZE = 10;
    private static CircularFifoBuffer _buffer;
   
    private TextExpander_Buffer() { 
    }
     
    public static CircularFifoBuffer getBuffer() {
        if(_buffer == null)
            _buffer = new CircularFifoBuffer(MAX_BUFFER_SIZE);
        return _buffer;
    }
}