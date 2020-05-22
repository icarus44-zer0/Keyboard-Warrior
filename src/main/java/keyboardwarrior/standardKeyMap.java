package keyboardwarrior;

import java.util.HashMap;

import org.jnativehook.keyboard.NativeKeyEvent;

public class standardKeyMap {

    private HashMap<Integer, String> alpha = new HashMap<Integer, String>();
    private HashMap<Integer, String> numeric = new HashMap<Integer, String>();
    private HashMap<Integer, String> special = new HashMap<Integer, String>();
    private HashMap<Integer, String> alphaMOD = new HashMap<Integer, String>();
    private HashMap<Integer, String> numericMOD = new HashMap<Integer, String>();
    private HashMap<Integer, String> specialMOD = new HashMap<Integer, String>();
    private HashMap<Integer, String> unused = new HashMap<Integer, String>();

    private Boolean isShift = false;
    private Boolean isCaps = false;
    private Boolean isWhiteSpace = false;
    private Boolean isRemove = false;
    private Boolean isNumeric = false;
    private Boolean isSpecial = false;
    private Boolean isAlpha = false;

    public String interpret(int keyCode) {
        isShift = shiftPress(keyCode);
        isCaps = capsPress(keyCode);
        isWhiteSpace = whiteSpacePress(keyCode);
        isRemove = removePress(keyCode);
        isNumeric = numPress(keyCode);
        isSpecial = specialPress(keyCode);
        isAlpha = alphaPress(keyCode);

        if (isAlpha) {
            return alpha(keyCode);
        } else if (isNumeric) {
            return numeric(keyCode);
        } else if (isSpecial) {
            return special(keyCode);
        } else if (isShift && isAlpha && !isCaps) {
            return alphaModified(keyCode);
        } else if (isShift && isNumeric) {
            return numericModified(keyCode);
        } else if (isShift && isSpecial) {
            return specialModified(keyCode);
        } else if (isShift && isCaps && isAlpha) {
            return alpha(keyCode);
        } else {
            return "Unknown keyCode: 0xe36";
        }

    }


    private String alpha(int keyCode) {
        return null;
    }

    private String numeric(int keyCode) {
        return null;
    }

    private String special(int keyCode) {
        return null;
    }

    private String alphaModified(int keyCode) {
        return null;
    }

    private String numericModified(int keyCode) {
        return null;
    }

    private String specialModified(int keyCode) {
        return null;
    }

    private Boolean alphaPress(int key) {
        if (alpha.containsKey(key)) {
            return true;
        }
        return false;
    }

    private Boolean numPress(int key) {
        if (numeric.containsKey(key)) {
            return true;
        }
        return false;
    }

    private Boolean specialPress(int key) {
        if (special.containsKey(key)) {
            return true;
        }
        return false;
    }

    private Boolean shiftPress(int key) {
        if (key == NativeKeyEvent.VC_SHIFT) {
            return true;
        }
        return false;
    }

    private Boolean capsPress(int key) {
        if (key == NativeKeyEvent.VC_CAPS_LOCK) {
            return true;
        }
        return false;
    }

    private Boolean whiteSpacePress(int key) {
        if (key == NativeKeyEvent.VC_ENTER || key == NativeKeyEvent.VC_TAB || key == NativeKeyEvent.VC_SPACE) {
            KeyBuffer.getInstance().clear();
        }
        return false;
    }

    private Boolean removePress(int key) {
        if (key == NativeKeyEvent.VC_BACKSPACE || key == NativeKeyEvent.VC_BACKSPACE) {
            KeyBuffer.getInstance().clear();
        }
        return false;
    }


    public void whiteSpace(int keyCode) {
        switch (keyCode) {
            case NativeKeyEvent.VC_SPACE:
                KeyBuffer.getInstance().clear();
            case NativeKeyEvent.VC_ENTER:
                KeyBuffer.getInstance().clear();
            case NativeKeyEvent.VC_TAB:
                KeyBuffer.getInstance().clear();
            default:
                return;
        }
    }

    public void remove(int keyCode) {
        switch (keyCode) {
            case NativeKeyEvent.VC_BACKSPACE:
                KeyBuffer.getInstance().clear();
            case NativeKeyEvent.VC_DELETE:
                return;
            default:
                return;
        }
    }

    public void map() {
        /** VC_0 thru VC_9 */
        numeric.put(NativeKeyEvent.VC_0, "0");
        numeric.put(NativeKeyEvent.VC_1, "1");
        numeric.put(NativeKeyEvent.VC_2, "2");
        numeric.put(NativeKeyEvent.VC_3, "3");
        numeric.put(NativeKeyEvent.VC_4, "4");
        numeric.put(NativeKeyEvent.VC_5, "5");
        numeric.put(NativeKeyEvent.VC_6, "6");
        numeric.put(NativeKeyEvent.VC_7, "7");
        numeric.put(NativeKeyEvent.VC_8, "8");
        numeric.put(NativeKeyEvent.VC_9, "9");

        /** VC_A thru VC_Z */
        alpha.put(NativeKeyEvent.VC_A, "A");
        alpha.put(NativeKeyEvent.VC_B, "B");
        alpha.put(NativeKeyEvent.VC_C, "C");
        alpha.put(NativeKeyEvent.VC_D, "D");
        alpha.put(NativeKeyEvent.VC_E, "E");
        alpha.put(NativeKeyEvent.VC_F, "F");
        alpha.put(NativeKeyEvent.VC_G, "G");
        alpha.put(NativeKeyEvent.VC_H, "H");
        alpha.put(NativeKeyEvent.VC_I, "I");
        alpha.put(NativeKeyEvent.VC_J, "J");
        alpha.put(NativeKeyEvent.VC_K, "K");
        alpha.put(NativeKeyEvent.VC_L, "L");
        alpha.put(NativeKeyEvent.VC_M, "M");
        alpha.put(NativeKeyEvent.VC_N, "N");
        alpha.put(NativeKeyEvent.VC_O, "O");
        alpha.put(NativeKeyEvent.VC_P, "P");
        alpha.put(NativeKeyEvent.VC_Q, "Q");
        alpha.put(NativeKeyEvent.VC_R, "R");
        alpha.put(NativeKeyEvent.VC_S, "S");
        alpha.put(NativeKeyEvent.VC_T, "T");
        alpha.put(NativeKeyEvent.VC_U, "U");
        alpha.put(NativeKeyEvent.VC_V, "V");
        alpha.put(NativeKeyEvent.VC_W, "W");
        alpha.put(NativeKeyEvent.VC_X, "X");
        alpha.put(NativeKeyEvent.VC_Y, "Y");
        alpha.put(NativeKeyEvent.VC_Z, "Z");

        /** Start Special Keys */
        special.put(NativeKeyEvent.VC_MINUS, "-");
        special.put(NativeKeyEvent.VC_EQUALS, "=");
        special.put(NativeKeyEvent.VC_OPEN_BRACKET, "[");
        special.put(NativeKeyEvent.VC_CLOSE_BRACKET, "]");
        special.put(NativeKeyEvent.VC_BACK_SLASH, "\\\\");
        special.put(NativeKeyEvent.VC_SEMICOLON, ";");
        special.put(NativeKeyEvent.VC_QUOTE, "\"\"");
        special.put(NativeKeyEvent.VC_COMMA, ",");
        special.put(NativeKeyEvent.VC_PERIOD, ".");
        special.put(NativeKeyEvent.VC_SLASH, "/");

        /** Whitespace Keys */
        unused.put(NativeKeyEvent.VC_SPACE, " ");
        unused.put(NativeKeyEvent.VC_ENTER, "\r");
        unused.put(NativeKeyEvent.VC_TAB, "\t");

        /** Modifier and Control Keys */
        unused.put(NativeKeyEvent.VC_SHIFT, "Shift");
        unused.put(NativeKeyEvent.VC_CAPS_LOCK, "CapsLock");
        unused.put(NativeKeyEvent.VC_NUM_LOCK, "Num Lock");
        unused.put(NativeKeyEvent.VC_CONTROL, "Control");
        unused.put(NativeKeyEvent.VC_META, "Meta");
        unused.put(NativeKeyEvent.VC_ALT, "Alt");

        /** Removal and Delete Keys */
        unused.put(NativeKeyEvent.VC_BACKSPACE, "Backspace");
        unused.put(NativeKeyEvent.VC_DELETE, "Delete");
    }
}