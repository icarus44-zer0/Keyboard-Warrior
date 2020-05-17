package com.purplecobras.keyboardwarrior;

import org.apache.commons.collections.CircularFifoBuffer;

public final class Keyboard_In_Buffer extends CircularFifoBuffer {
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private static final int MAX_BUFFER_SIZE = 10;
    private static Keyboard_In_Buffer buffer;

    private Keyboard_In_Buffer() {
        super(MAX_BUFFER_SIZE);
    }

    /**
     * 
     * @return
     */
    public static Keyboard_In_Buffer getInstance() {
        if (buffer == null) {
            buffer = new Keyboard_In_Buffer();
            buffer.reset_Buffer();
        }
        return buffer;
    }

    /**
     * 
     */
    public void reset_Buffer() {
        for (int i = 0; i < MAX_BUFFER_SIZE; i++) {
            buffer.add("~");
        }
    }
}