package keyboardwarrior;

import org.jnativehook.keyboard.NativeKeyEvent;

public class temp {
    
    public String numeric(int keyCode) {
        switch (keyCode) {
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
            case NativeKeyEvent.VC_0:
                return "0";
            default:
                return "Unknown keyCode: 0xe36";
        }
    }

    public String alpha(int keyCode) {
        switch (keyCode) {
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
            default:
                return "Unknown keyCode: 0xe36";
        }
    }

    public String special(int keyCode) {
        switch (keyCode) {
            case NativeKeyEvent.VC_BACKQUOTE:
                return "`";
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
                return "Unknown keyCode: 0xe36";
        }
    }

    public String numericModified(int keyCode) {
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
            default:
                return "Unknown keyCode: 0xe36";
        }
    }

    public String upper(int keyCode) {
        switch (keyCode) {
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
                return "Unknown keyCode: 0xe36";
        }

    }

    public String specialModified(int keyCode) {
        switch (keyCode) {
            case NativeKeyEvent.VC_BACKQUOTE:
                return "~";
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
            default:
                return "Unknown keyCode: 0xe36";
        }
    }
}