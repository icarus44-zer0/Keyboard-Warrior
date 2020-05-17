package com.purplecobras.keyboardwarrior;

import org.apache.commons.collections.CircularFifoBuffer;

public final class KeyboardInputBuffer extends CircularFifoBuffer {
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private static final int MAX_BUFFER_SIZE = 10;
    private static KeyboardInputBuffer buffer;

    private KeyboardInputBuffer() {
        super(MAX_BUFFER_SIZE);
    }

    /**
     * 
     * @return
     */
    public static KeyboardInputBuffer getInstance() {
        if (buffer == null) {
            buffer = new KeyboardInputBuffer();
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