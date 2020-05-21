package keyboardwarrior;

import java.util.HashMap;

import org.jnativehook.keyboard.NativeKeyEvent;

public class standardKeyMap {
    HashMap<Integer, String> standardKeyMap = new HashMap<Integer, String>();
    Boolean shiftPress = false;
    Boolean capsPress = false;
    Boolean bothPress = false;
    Boolean isLetterKey = false;
    int keyCode = 0;


    public String init(){
        if (shiftPress==true&&capsPress==false){
            return shiftPressed();
        }else if (capsPress==true&&shiftPress==false){
           return capsLockPressed();
        }else if (bothPress==false&&isLetterKey==true){
            return bothPressed();
        }else if (shiftPress==false&&capsPress==false){
            return keyPressed();
        }else{
            return "Unknown keyCode: 0xe36";
        }

    }
    public String keyPressed() {

        switch (keyCode) {
            case NativeKeyEvent.VC_0:
                return "0";
            case NativeKeyEvent.VC_1:
                return "1";
            case NativeKeyEvent.VC_2:
                return "2";
            case NativeKeyEvent.VC_3:
                return "3";
            case NativeKeyEvent.VC_4:
                return "4";
            case NativeKeyEvent.VC_5:
                return "5";
            case NativeKeyEvent.VC_6:
                return "6";
            case NativeKeyEvent.VC_7:
                return "7";
            case NativeKeyEvent.VC_8:
                return "8";
            case NativeKeyEvent.VC_9:
                return "9";
            case NativeKeyEvent.VC_A:
                return "a";
            case NativeKeyEvent.VC_B:
                return "b";
            case NativeKeyEvent.VC_C:
                return "c";
            case NativeKeyEvent.VC_D:
                return "d";
            case NativeKeyEvent.VC_E:
                return "e";
            case NativeKeyEvent.VC_F:
                return "f";
            case NativeKeyEvent.VC_G:
                return "g";
            case NativeKeyEvent.VC_H:
                return "h";
            case NativeKeyEvent.VC_I:
                return "i";
            case NativeKeyEvent.VC_J:
                return "j";
            case NativeKeyEvent.VC_K:
                return "k";
            case NativeKeyEvent.VC_L:
                return "l";
            case NativeKeyEvent.VC_M:
                return "m";
            case NativeKeyEvent.VC_N:
                return "n";
            case NativeKeyEvent.VC_O:
                return "o";
            case NativeKeyEvent.VC_P:
                return "p";
            case NativeKeyEvent.VC_Q:
                return "q";
            case NativeKeyEvent.VC_R:
                return "r";
            case NativeKeyEvent.VC_S:
                return "s";
            case NativeKeyEvent.VC_T:
                return "t";
            case NativeKeyEvent.VC_U:
                return "u";
            case NativeKeyEvent.VC_V:
                return "v";
            case NativeKeyEvent.VC_W:
                return "w";
            case NativeKeyEvent.VC_X:
                return "x";
            case NativeKeyEvent.VC_Y:
                return "y";
            case NativeKeyEvent.VC_Z:
                return "z";
            case NativeKeyEvent.VC_MINUS:
                return "-";
            case NativeKeyEvent.VC_EQUALS:
                return "=";
            case NativeKeyEvent.VC_OPEN_BRACKET:
                return "[";
            case NativeKeyEvent.VC_CLOSE_BRACKET:
                return "[";
            case NativeKeyEvent.VC_BACK_SLASH:
                return "\\\\";
            case NativeKeyEvent.VC_SEMICOLON:
                return ";";
            case NativeKeyEvent.VC_QUOTE:
                return "\'";
            case NativeKeyEvent.VC_COMMA:
                return ",";
            case NativeKeyEvent.VC_PERIOD:
                return ".";
            case NativeKeyEvent.VC_SLASH:
                return "/";
            default:
                return "Uknown";
        }
    }

    public String shiftPressed() {
        switch (keyCode) {
            case NativeKeyEvent.VC_0:
                return ")";
            case NativeKeyEvent.VC_1:
                return "!";
            case NativeKeyEvent.VC_2:
                return "@";
            case NativeKeyEvent.VC_3:
                return "#";
            case NativeKeyEvent.VC_4:
                return "$";
            case NativeKeyEvent.VC_5:
                return "%";
            case NativeKeyEvent.VC_6:
                return "^";
            case NativeKeyEvent.VC_7:
                return "&";
            case NativeKeyEvent.VC_8:
                return "*";
            case NativeKeyEvent.VC_9:
                return "(";
            case NativeKeyEvent.VC_MINUS:
                return "_";
            case NativeKeyEvent.VC_EQUALS:
                return "+";
            case NativeKeyEvent.VC_OPEN_BRACKET:
                return "{";
            case NativeKeyEvent.VC_CLOSE_BRACKET:
                return "}";
            case NativeKeyEvent.VC_BACK_SLASH:
                return "|";
            case NativeKeyEvent.VC_SEMICOLON:
                return ":";
            case NativeKeyEvent.VC_QUOTE:
                return "\"\"";
            case NativeKeyEvent.VC_COMMA:
                return "<";
            case NativeKeyEvent.VC_PERIOD:
                return ">";
            case NativeKeyEvent.VC_SLASH:
                return "?";

            // 
            case NativeKeyEvent.VC_A:
                return "A";
            case NativeKeyEvent.VC_B:
                return "B";
            case NativeKeyEvent.VC_C:
                return "C";
            case NativeKeyEvent.VC_D:
                return "D";
            case NativeKeyEvent.VC_E:
                return "E";
            case NativeKeyEvent.VC_F:
                return "F";
            case NativeKeyEvent.VC_G:
                return "G";
            case NativeKeyEvent.VC_H:
                return "H";
            case NativeKeyEvent.VC_I:
                return "I";
            case NativeKeyEvent.VC_J:
                return "J";
            case NativeKeyEvent.VC_K:
                return "K";
            case NativeKeyEvent.VC_L:
                return "L";
            case NativeKeyEvent.VC_M:
                return "M";
            case NativeKeyEvent.VC_N:
                return "N";
            case NativeKeyEvent.VC_O:
                return "O";
            case NativeKeyEvent.VC_P:
                return "P";
            case NativeKeyEvent.VC_Q:
                return "Q";
            case NativeKeyEvent.VC_R:
                return "R";
            case NativeKeyEvent.VC_S:
                return "S";
            case NativeKeyEvent.VC_T:
                return "T";
            case NativeKeyEvent.VC_U:
                return "U";
            case NativeKeyEvent.VC_V:
                return "V";
            case NativeKeyEvent.VC_W:
                return "W";
            case NativeKeyEvent.VC_X:
                return "X";
            case NativeKeyEvent.VC_Y:
                return "Y";
            case NativeKeyEvent.VC_Z:
                return "Z";
            default:
                return "Uknown";
        }
    }

    public String capsLockPressed(){
        return "Uknown";
    }

    public String bothPressed(){
        return "Uknown";
    }

    public void map() {

        /** VC_0 thru VC_9 */
        standardKeyMap.put(NativeKeyEvent.VC_0, "0");
        standardKeyMap.put(NativeKeyEvent.VC_1, "1");
        standardKeyMap.put(NativeKeyEvent.VC_2, "2");
        standardKeyMap.put(NativeKeyEvent.VC_3, "3");
        standardKeyMap.put(NativeKeyEvent.VC_4, "4");
        standardKeyMap.put(NativeKeyEvent.VC_5, "5");
        standardKeyMap.put(NativeKeyEvent.VC_6, "6");
        standardKeyMap.put(NativeKeyEvent.VC_7, "7");
        standardKeyMap.put(NativeKeyEvent.VC_8, "8");
        standardKeyMap.put(NativeKeyEvent.VC_9, "9");

        /** VC_A thru VC_Z */
        standardKeyMap.put(NativeKeyEvent.VC_A, "A");
        standardKeyMap.put(NativeKeyEvent.VC_B, "B");
        standardKeyMap.put(NativeKeyEvent.VC_C, "C");
        standardKeyMap.put(NativeKeyEvent.VC_D, "D");
        standardKeyMap.put(NativeKeyEvent.VC_E, "E");
        standardKeyMap.put(NativeKeyEvent.VC_F, "F");
        standardKeyMap.put(NativeKeyEvent.VC_G, "G");
        standardKeyMap.put(NativeKeyEvent.VC_H, "H");
        standardKeyMap.put(NativeKeyEvent.VC_I, "I");
        standardKeyMap.put(NativeKeyEvent.VC_J, "J");
        standardKeyMap.put(NativeKeyEvent.VC_K, "K");
        standardKeyMap.put(NativeKeyEvent.VC_L, "L");
        standardKeyMap.put(NativeKeyEvent.VC_M, "M");
        standardKeyMap.put(NativeKeyEvent.VC_N, "N");
        standardKeyMap.put(NativeKeyEvent.VC_O, "O");
        standardKeyMap.put(NativeKeyEvent.VC_P, "P");
        standardKeyMap.put(NativeKeyEvent.VC_Q, "Q");
        standardKeyMap.put(NativeKeyEvent.VC_R, "R");
        standardKeyMap.put(NativeKeyEvent.VC_S, "S");
        standardKeyMap.put(NativeKeyEvent.VC_T, "T");
        standardKeyMap.put(NativeKeyEvent.VC_U, "U");
        standardKeyMap.put(NativeKeyEvent.VC_V, "V");
        standardKeyMap.put(NativeKeyEvent.VC_W, "W");
        standardKeyMap.put(NativeKeyEvent.VC_X, "X");
        standardKeyMap.put(NativeKeyEvent.VC_Y, "Y");
        standardKeyMap.put(NativeKeyEvent.VC_Z, "Z");

        /** Modifier and Control Keys */
        standardKeyMap.put(NativeKeyEvent.VC_SHIFT, "");
        standardKeyMap.put(NativeKeyEvent.VC_CONTROL, "");
        standardKeyMap.put(NativeKeyEvent.VC_META, "");
        standardKeyMap.put(NativeKeyEvent.VC_ALT, "");
        standardKeyMap.put(NativeKeyEvent.VC_CAPS_LOCK, "");
        standardKeyMap.put(NativeKeyEvent.VC_NUM_LOCK, "");

        /** Removal and Delete Keys */
        standardKeyMap.put(NativeKeyEvent.VC_BACKSPACE, "Backspace");
        standardKeyMap.put(NativeKeyEvent.VC_DELETE, "Delete");

        /** Start Arithmatic Keys */
        standardKeyMap.put(NativeKeyEvent.VC_MINUS, "-");
        standardKeyMap.put(NativeKeyEvent.VC_EQUALS, "=");

        /** Start Punctuation Keys */
        standardKeyMap.put(NativeKeyEvent.VC_OPEN_BRACKET, "[");
        standardKeyMap.put(NativeKeyEvent.VC_CLOSE_BRACKET, "]");

        standardKeyMap.put(NativeKeyEvent.VC_BACK_SLASH, "\\\\");
        standardKeyMap.put(NativeKeyEvent.VC_SEMICOLON, ";");

        standardKeyMap.put(NativeKeyEvent.VC_QUOTE, "\"\"");
        standardKeyMap.put(NativeKeyEvent.VC_COMMA, ",");
        standardKeyMap.put(NativeKeyEvent.VC_PERIOD, ".");
        standardKeyMap.put(NativeKeyEvent.VC_SLASH, "/");

        /** Whitespace Keys */
        standardKeyMap.put(NativeKeyEvent.VC_SPACE, " ");
        standardKeyMap.put(NativeKeyEvent.VC_ENTER, "");
        standardKeyMap.put(NativeKeyEvent.VC_TAB, "");
    }
}