package keyboardwarrior;

import java.util.HashMap;

import org.jnativehook.keyboard.NativeKeyEvent;

public class keyInterpreterV2 {

    private HashMap<Integer, String> alpha;
    private HashMap<Integer, String> numeric;
    private HashMap<Integer, String> special;
    private HashMap<Integer, String> numericMOD;
    private HashMap<Integer, String> specialMOD;
    private HashMap<Integer, String> unused;

    private Boolean isShift;
    private Boolean isCaps;
    private Boolean isWhiteSpace;
    private Boolean isRemove;
    private Boolean isNumeric;
    private Boolean isSpecial;
    private Boolean isAlpha;

    public keyInterpreterV2(){
        isShift = false;
        isCaps = false;
        isWhiteSpace = false;
        isRemove = false;
        isNumeric = false;
        isSpecial = false;
        isAlpha = false;

        alpha = new HashMap<Integer, String>();
        numeric = new HashMap<Integer, String>();
        special = new HashMap<Integer, String>();
        numericMOD = new HashMap<Integer, String>();
        specialMOD = new HashMap<Integer, String>();
        unused = new HashMap<Integer, String>();
        map();
    }

    public void interpret(int keyCode) {
        shiftPress(keyCode);
        capsPress(keyCode);
        whiteSpacePress(keyCode);
        removePress(keyCode);
        numPress(keyCode);
        specialPress(keyCode);
        alphaPress(keyCode);

        if (isRemove) {
            remove();
        } else if (isWhiteSpace) {
            whiteSpace();
        } else if (isAlpha) {
            alpha(keyCode);
        } else if (isNumeric) {
            numeric(keyCode);
        } else if (isSpecial) {
            special(keyCode);
        } else if (isShift && isAlpha && !isCaps) {
            alphaModified(keyCode);
        } else if (isShift && isNumeric) {
            numericModified(keyCode);
        } else if (isShift && isSpecial) {
            specialModified(keyCode);
        } else if (isShift && isCaps && isAlpha) {
            alpha(keyCode);
        } else {
            return;
        }
    }

    private void alphaPress(int keyCode) {
        if (alpha.containsKey(keyCode)) {
            isAlpha = true;
        }
    }

    private void numPress(int keyCode) {
        if (numeric.containsKey(keyCode)) {
            isNumeric = true;
        }
    }

    private void specialPress(int keyCode) {
        if (special.containsKey(keyCode)) {
            isSpecial = true;
        }
    }

    private void shiftPress(int keyCode) {
        if (keyCode == NativeKeyEvent.VC_SHIFT) {
            isShift = true;
        }
    }

    private void capsPress(int keyCode) {
        if (keyCode == NativeKeyEvent.VC_CAPS_LOCK) {
            isCaps = true;
        }
    }

    private void whiteSpacePress(int keyCode) {
        if (keyCode == NativeKeyEvent.VC_ENTER || keyCode == NativeKeyEvent.VC_TAB || keyCode == NativeKeyEvent.VC_SPACE) {
            isWhiteSpace = true;
        }
    }

    private void removePress(int keyCode) {
        if (keyCode == NativeKeyEvent.VC_BACKSPACE || keyCode == NativeKeyEvent.VC_BACKSPACE) {
            isRemove = true;
        }
    }

    private void alpha(int keyCode) {
        KeyBuffer.getInstance().add(alpha.get(keyCode));
        resetFlags();
    }

    private void numeric(int keyCode) {
        KeyBuffer.getInstance().add(numeric.get(keyCode));
        resetFlags();
    }

    private void special(int keyCode) {
        KeyBuffer.getInstance().add(special.get(keyCode));
        resetFlags();
    }

    private void alphaModified(int keyCode) {
        KeyBuffer.getInstance().add(alpha.get(keyCode).toUpperCase());
        resetFlags();
    }

    private void numericModified(int keyCode) {
        KeyBuffer.getInstance().add(numericMOD.get(keyCode));
        resetFlags();
    }

    private void specialModified(int keyCode) {
        KeyBuffer.getInstance().add(specialMOD.get(keyCode));
        resetFlags();
    }

    private void whiteSpace() {
        KeyBuffer.getInstance().clear();
        resetFlags();
    }

    private void remove() {
        KeyBuffer.getInstance().clear();
        resetFlags();
    }

    public void keyRelesed(int keyCode){
        if(keyCode == NativeKeyEvent.VC_CAPS_LOCK){
            isCaps = false;
        }else if(keyCode == NativeKeyEvent.VC_SHIFT){
            isShift = false;
        }
    }

    private void resetFlags(){
        // isCaps = false;
        // isShift = false;
        isWhiteSpace = false;
        isRemove = false;
        isNumeric = false;
        isSpecial = false;
        isAlpha = false;
    }

    private void map() {
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