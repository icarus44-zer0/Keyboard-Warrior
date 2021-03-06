package keyboardwarrior;

import org.apache.commons.collections4.queue.CircularFifoQueue;

public final class KeyBuffer extends CircularFifoQueue<String> {
    private static final long serialVersionUID = 1L;
    private static final int MAX_BUFFER_SIZE = 10;
    private static KeyBuffer instance;

    private KeyBuffer() {
        super(MAX_BUFFER_SIZE);
    }

    /**
     * 
     * @return
     */
    public static KeyBuffer getInstance() {
        if (instance == null) {
            instance = new KeyBuffer();
            instance.resetBuffer();
        }
        return instance;
    }

    /**
     * 
     */
    public void resetBuffer() {
        for (int i = 0; i < MAX_BUFFER_SIZE; i++) {
            instance.add("~");
        }
    }
}