package main;


public final class Shortcut_Buffer {
    private static final int MAX_BUFFER_SIZE = 10;
    private static CircularFifoBuffer _buffer;
   
    private Shortcut_Buffer() { 
    }
     
    public static CircularFifoBuffer getBuffer() {
        if(_buffer == null)
            _buffer = new CircularFifoBuffer(MAX_BUFFER_SIZE);
        return _buffer;
    }

    // @Override
    // public String toString() {
    //     String str = "";
    //     while(_buffer.iterator().hasNext())
    //         str += _buffer.iterator().next();
    //     return str;
    // }
}