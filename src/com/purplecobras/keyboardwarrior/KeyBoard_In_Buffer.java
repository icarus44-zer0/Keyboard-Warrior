package com.purplecobras.keyboardwarrior;

import org.apache.commons.collections.CircularFifoBuffer;

public final class KeyBoard_In_Buffer extends CircularFifoBuffer {
    /**
     *
     */
    private static final long serialVersionUID = 7408228806455495890L;
    
    private static final int MAX_BUFFER_SIZE = 10;
    private static KeyBoard_In_Buffer _buffer;

    private KeyBoard_In_Buffer() {
        super(MAX_BUFFER_SIZE);
    }

    public static KeyBoard_In_Buffer getBuffer() {
        if (_buffer == null){
            _buffer = new KeyBoard_In_Buffer();
            reset_Buffer();
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

    public static void reset_Buffer() {
        for(int i = 0; i < MAX_BUFFER_SIZE ;i++){
            _buffer.add("~");
        }
    }
}