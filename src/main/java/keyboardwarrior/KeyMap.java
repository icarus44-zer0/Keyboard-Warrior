package keyboardwarrior;

import java.util.HashMap;
import org.jnativehook.keyboard.NativeKeyEvent;

public class KeyMap {
    private static KeyMap instance = null;
    
    private HashMap<Integer, String> alpha;
    private HashMap<Integer, String> numeric;
    private HashMap<Integer, String> special;
    private HashMap<Integer, String> numericMod;
    private HashMap<Integer, String> specialMod;

    private KeyMap() {
        alpha = new HashMap<Integer,String>();
        numeric = new HashMap<Integer,String>();
        special = new HashMap<Integer,String>();
        numericMod = new HashMap<Integer,String>();
        specialMod = new HashMap<Integer,String>();
        initializeMap();
    }

    /**
     * 
     * @return
     */
    public static KeyMap getInstance() {
        if (instance == null) {
            instance = new KeyMap();
        }
        return instance;
    }

    private void initializeMap() {
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

        numericMod.put(NativeKeyEvent.VC_0, ")");
        numericMod.put(NativeKeyEvent.VC_1, "!");
        numericMod.put(NativeKeyEvent.VC_2, "@");
        numericMod.put(NativeKeyEvent.VC_3, "#");
        numericMod.put(NativeKeyEvent.VC_4, "$");
        numericMod.put(NativeKeyEvent.VC_5, "%");
        numericMod.put(NativeKeyEvent.VC_6, "^");
        numericMod.put(NativeKeyEvent.VC_7, "&");
        numericMod.put(NativeKeyEvent.VC_8, "*");
        numericMod.put(NativeKeyEvent.VC_9, "(");

        specialMod.put(NativeKeyEvent.VC_BACKQUOTE, "~");
        specialMod.put(NativeKeyEvent.VC_MINUS, "_");
        specialMod.put(NativeKeyEvent.VC_EQUALS, "+");
        specialMod.put(NativeKeyEvent.VC_OPEN_BRACKET, "{");
        specialMod.put(NativeKeyEvent.VC_CLOSE_BRACKET, "}");
        specialMod.put(NativeKeyEvent.VC_BACK_SLASH, "|");
        specialMod.put(NativeKeyEvent.VC_SEMICOLON, ":");
        specialMod.put(NativeKeyEvent.VC_QUOTE, "\"");
        specialMod.put(NativeKeyEvent.VC_COMMA, "<");
        specialMod.put(NativeKeyEvent.VC_PERIOD, ">");
        specialMod.put(NativeKeyEvent.VC_SLASH, "?");
    }

    public HashMap<Integer, String> getAlpha() {
        return alpha;
    }

    public HashMap<Integer, String> getNumeric() {
        return numeric;
    }

    public HashMap<Integer, String> getSpecial() {
        return special;
    }

    public HashMap<Integer, String> getNumericMod() {
        return numericMod;
    }

    public HashMap<Integer, String> getSpecialMod() {
        return specialMod;
    }

    @SuppressWarnings("unused")
    private void unused() {
        /** Whitespace Keys */
        HashMap<Integer, String> notInUse = new HashMap<Integer, String>();
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
