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

    public static void reset_Buffer() {
        for(int i = 0; i < MAX_BUFFER_SIZE ;i++){
            _buffer.add("~");
        }
    }
}