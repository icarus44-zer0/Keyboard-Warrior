package main;

import java.util.Iterator;

public final class Shortcut_Buffer extends CircularFifoBuffer {
    private static final int MAX_BUFFER_SIZE = 10;
    private static Shortcut_Buffer _buffer;
   
    private Shortcut_Buffer() {
        super(MAX_BUFFER_SIZE);
    }
     
    public static Shortcut_Buffer getBuffer() {
        if(_buffer == null)
            _buffer = new Shortcut_Buffer();
        return _buffer;
    }

    // // BROKEN N SHITTY
    @Override
    public String toString() {
        Iterator<Object> it = _buffer.iterator();
        StringBuilder sb = new StringBuilder();

        if (!it.hasNext())
            return " ";
        
        for (;;) {
            Object e = it.next();
            sb.append(e);

            if (!it.hasNext())
                return " ";;
            sb.append(" ").append(" ");
        }
    }

    /*
    *   Test Mothod for toString overide 
    */
    // @Override
    // public String toString() {
    //     return super.toString();
    // }

}