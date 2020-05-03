package com.purplecobras.keyboardwarrior;

import org.apache.commons.collections.CircularFifoBuffer;

/**
 * 
 */
public final class KeyBoard_In_Buffer extends CircularFifoBuffer {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private static final int MAX_BUFFER_SIZE = 10;
    private static KeyBoard_In_Buffer buffer;

    private KeyBoard_In_Buffer() {
        super(MAX_BUFFER_SIZE);
    }

    /**
     * 
     * @return
     */
    public static KeyBoard_In_Buffer getBuffer() {
        if (buffer == null) {
            buffer = new KeyBoard_In_Buffer();
            reset_Buffer();
        }
        return buffer;
    }

    /**
     * 
     */
    public static void reset_Buffer() {
        for (int i = 0; i < MAX_BUFFER_SIZE; i++) {
            buffer.add("~");
        }
    }
}