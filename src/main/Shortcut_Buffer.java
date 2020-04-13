package main;

import java.util.Iterator;

public final class Shortcut_Buffer extends CircularFifoBuffer {
    private static final int MAX_BUFFER_SIZE = 10;
    private static Shortcut_Buffer _buffer;

    private Shortcut_Buffer() {
        super(MAX_BUFFER_SIZE);
    }

    public static Shortcut_Buffer getBuffer() {
        if (_buffer == null){
            _buffer = new Shortcut_Buffer();
            fillEmptyBuffer_debug();
        }
        return _buffer;
    }

    private static void fillEmptyBuffer_debug() {
        _buffer.add("0");
        _buffer.add("1");
        _buffer.add("2");
        _buffer.add("3");
        _buffer.add("4");
        _buffer.add("5");
        _buffer.add("6");
        _buffer.add("7");
        _buffer.add("8");
        _buffer.add("9");
    }

    private static void fillEmptyBuffer() {
        for(int i = 0; i < MAX_BUFFER_SIZE ;i++){
            _buffer.add(i);
        }
    }
}