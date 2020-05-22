package keyboardwarrior;

import java.util.HashMap;

import org.jnativehook.keyboard.NativeKeyEvent;

public class KeyInterpreter {

    private HashMap<Integer, String> alpha;
    private HashMap<Integer, String> numeric;
    private HashMap<Integer, String> special;
    private HashMap<Integer, String> numericMOD;
    private HashMap<Integer, String> specialMOD;
    private HashMap<Integer, String> notInUse;

    private KeyBuffer buffer;

    private Boolean isShift;
    private Boolean isCaps;
    private Boolean isWhiteSpace;
    private Boolean isRemove;
    private Boolean isNumeric;
    private Boolean isSpecial;
    private Boolean isAlpha;

    public KeyInterpreter() {
        isShift = false;
        isCaps = false;
        isWhiteSpace = false;
        isRemove = false;
        isNumeric = false;
        isSpecial = false;
        isAlpha = false;

        buffer = KeyBuffer.getInstance();

        alpha = new HashMap<Integer, String>();
        numeric = new HashMap<Integer, String>();
        special = new HashMap<Integer, String>();
        numericMOD = new HashMap<Integer, String>();
        specialMOD = new HashMap<Integer, String>();
        notInUse = new HashMap<Integer, String>();
        mapLoader();
    }

    /**
     * Key Check Order
     * (1) Delete, Backspace (2) Space, Tab, Return (3) A-Z w/ Shift Modifier (4) A-Z w/ Caps
     * Modifier (5) A-Z w/ Caps Modifier && Shift Modifier (6) 0-9 w/ Shift Modifier (7) Special
     * Keys w/ Shift Modifier (8) A-Z (9) 0-9 (10) Special Keys
     */
    public void interpret(int keyCode) {
        isWhiteSpacePress(keyCode);
        isRemovePress(keyCode);
        isNumPress(keyCode);
        isSpecialPress(keyCode);
        isAlphaPress(keyCode);

        if (isRemove) {
            remove();
        } else if (isWhiteSpace) {
            whiteSpace();
        } else if (isShift && isAlpha && !isCaps) {
            alphaModified(keyCode);
        } else if (isCaps && isAlpha && !isShift) {
            alphaModified(keyCode);
        } else if (isShift && isCaps && isAlpha) {
            alpha(keyCode);
        } else if (isShift && isNumeric) {
            numericModified(keyCode);
        } else if (isShift && isSpecial) {
            specialModified(keyCode);
        } else if (isAlpha) {
            alpha(keyCode);
        } else if (isNumeric) {
            numeric(keyCode);
        } else if (isSpecial) {
            special(keyCode);
        } else {
            return;
        }
    }

    private void isAlphaPress(int keyCode) {
        if (alpha.containsKey(keyCode)) {
            isAlpha = true;
        }
    }

    private void isNumPress(int keyCode) {
        if (numeric.containsKey(keyCode)) {
            isNumeric = true;
        }
    }

    private void isSpecialPress(int keyCode) {
        if (special.containsKey(keyCode)) {
            isSpecial = true;
        }
    }

    private void isWhiteSpacePress(int keyCode) {
        if (keyCode == NativeKeyEvent.VC_ENTER || keyCode == NativeKeyEvent.VC_TAB
                || keyCode == NativeKeyEvent.VC_SPACE) {
            isWhiteSpace = true;
        }
    }

    private void isRemovePress(int keyCode) {
        if (keyCode == NativeKeyEvent.VC_BACKSPACE || keyCode == NativeKeyEvent.VC_BACKSPACE) {
            isRemove = true;
        }
    }

    private void alpha(int keyCode) {
        buffer.add(alpha.get(keyCode));
        resetFlags();
    }

    private void numeric(int keyCode) {
        buffer.add(numeric.get(keyCode));
        resetFlags();
    }

    private void special(int keyCode) {
        buffer.add(special.get(keyCode));
        resetFlags();
    }

    private void alphaModified(int keyCode) {
        buffer.add(alpha.get(keyCode).toUpperCase());
        resetFlags();
    }

    private void numericModified(int keyCode) {
        buffer.add(numericMOD.get(keyCode));
        resetFlags();
    }

    private void specialModified(int keyCode) {
        buffer.add(specialMOD.get(keyCode));
        resetFlags();
    }

    private void whiteSpace() {
        buffer.clear();
        resetFlags();
    }

    private void remove() {
        buffer.clear();
        resetFlags();
    }

    public void modifierRelesed(int keyCode) {
        if (keyCode == NativeKeyEvent.VC_SHIFT) {
            isShift = false;
        }
    }

    public void modifierPressed(int keyCode) {
        if (keyCode == NativeKeyEvent.VC_CAPS_LOCK) {
            if (isCaps) {
                isCaps = false;
            } else if (!isCaps) {
                isCaps = true;
            }
        }
        if (keyCode == NativeKeyEvent.VC_SHIFT) {
            isShift = true;
        }
    }

    private void resetFlags() {
        isWhiteSpace = false;
        isRemove = false;
        isNumeric = false;
        isSpecial = false;
        isAlpha = false;
    }

    private void mapLoader() {
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
        alpha.put(NativeKeyEvent.VC_A, "a");
        alpha.put(NativeKeyEvent.VC_B, "b");
        alpha.put(NativeKeyEvent.VC_C, "c");
        alpha.put(NativeKeyEvent.VC_D, "d");
        alpha.put(NativeKeyEvent.VC_E, "e");
        alpha.put(NativeKeyEvent.VC_F, "f");
        alpha.put(NativeKeyEvent.VC_G, "g");
        alpha.put(NativeKeyEvent.VC_H, "h");
        alpha.put(NativeKeyEvent.VC_I, "i");
        alpha.put(NativeKeyEvent.VC_J, "j");
        alpha.put(NativeKeyEvent.VC_K, "k");
        alpha.put(NativeKeyEvent.VC_L, "l");
        alpha.put(NativeKeyEvent.VC_M, "m");
        alpha.put(NativeKeyEvent.VC_N, "n");
        alpha.put(NativeKeyEvent.VC_O, "o");
        alpha.put(NativeKeyEvent.VC_P, "p");
        alpha.put(NativeKeyEvent.VC_Q, "q");
        alpha.put(NativeKeyEvent.VC_R, "r");
        alpha.put(NativeKeyEvent.VC_S, "s");
        alpha.put(NativeKeyEvent.VC_T, "t");
        alpha.put(NativeKeyEvent.VC_U, "u");
        alpha.put(NativeKeyEvent.VC_V, "v");
        alpha.put(NativeKeyEvent.VC_W, "w");
        alpha.put(NativeKeyEvent.VC_X, "x");
        alpha.put(NativeKeyEvent.VC_Y, "y");
        alpha.put(NativeKeyEvent.VC_Z, "z");

        /** Start Special Keys */
        special.put(NativeKeyEvent.VC_BACKQUOTE, "`");
        special.put(NativeKeyEvent.VC_MINUS, "-");
        special.put(NativeKeyEvent.VC_EQUALS, "=");
        special.put(NativeKeyEvent.VC_OPEN_BRACKET, "[");
        special.put(NativeKeyEvent.VC_CLOSE_BRACKET, "]");
        special.put(NativeKeyEvent.VC_BACK_SLASH, "\\\\");
        special.put(NativeKeyEvent.VC_SEMICOLON, ";");
        special.put(NativeKeyEvent.VC_QUOTE, "'");
        special.put(NativeKeyEvent.VC_COMMA, ",");
        special.put(NativeKeyEvent.VC_PERIOD, ".");
        special.put(NativeKeyEvent.VC_SLASH, "/");

        numericMOD.put(NativeKeyEvent.VC_0, ")");
        numericMOD.put(NativeKeyEvent.VC_1, "!");
        numericMOD.put(NativeKeyEvent.VC_2, "@");
        numericMOD.put(NativeKeyEvent.VC_3, "#");
        numericMOD.put(NativeKeyEvent.VC_4, "$");
        numericMOD.put(NativeKeyEvent.VC_5, "%");
        numericMOD.put(NativeKeyEvent.VC_6, "^");
        numericMOD.put(NativeKeyEvent.VC_7, "&");
        numericMOD.put(NativeKeyEvent.VC_8, "*");
        numericMOD.put(NativeKeyEvent.VC_9, "(");

        specialMOD.put(NativeKeyEvent.VC_BACKQUOTE, "~");
        specialMOD.put(NativeKeyEvent.VC_MINUS, "_");
        specialMOD.put(NativeKeyEvent.VC_EQUALS, "+");
        specialMOD.put(NativeKeyEvent.VC_OPEN_BRACKET, "{");
        specialMOD.put(NativeKeyEvent.VC_CLOSE_BRACKET, "}");
        specialMOD.put(NativeKeyEvent.VC_BACK_SLASH, "|");
        specialMOD.put(NativeKeyEvent.VC_SEMICOLON, ":");
        specialMOD.put(NativeKeyEvent.VC_QUOTE, "\"");
        specialMOD.put(NativeKeyEvent.VC_COMMA, "<");
        specialMOD.put(NativeKeyEvent.VC_PERIOD, ">");
        specialMOD.put(NativeKeyEvent.VC_SLASH, "?");

        /** Whitespace Keys */
        notInUse.put(NativeKeyEvent.VC_SPACE, " ");
        notInUse.put(NativeKeyEvent.VC_ENTER, "\r");
        notInUse.put(NativeKeyEvent.VC_TAB, "\t");

        /** Modifier and Control Keys */
        notInUse.put(NativeKeyEvent.VC_SHIFT, "Shift");
        notInUse.put(NativeKeyEvent.VC_CAPS_LOCK, "CapsLock");
        notInUse.put(NativeKeyEvent.VC_NUM_LOCK, "Num Lock");
        notInUse.put(NativeKeyEvent.VC_CONTROL, "Control");
        notInUse.put(NativeKeyEvent.VC_META, "Meta");
        notInUse.put(NativeKeyEvent.VC_ALT, "Alt");

        /** Removal and Delete Keys */
        notInUse.put(NativeKeyEvent.VC_BACKSPACE, "Backspace");
        notInUse.put(NativeKeyEvent.VC_DELETE, "Delete");
    }
}
