package keyboardwarrior;

import java.util.HashMap;
import org.jnativehook.keyboard.NativeKeyEvent;

public class KeyMap {
    private static KeyMap instance = null;
    private HashMap<Integer, String> alpha;
    private HashMap<Integer, String> numeric;
    private HashMap<Integer, String> special;
    private HashMap<Integer, String> numericMOD;
    private HashMap<Integer, String> specialMOD;
    private HashMap<Integer, String> notInUse;

    private KeyMap() {
        mapLoader();
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
