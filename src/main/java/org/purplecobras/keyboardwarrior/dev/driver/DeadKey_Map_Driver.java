package main.java.org.purplecobras.keyboardwarrior.dev.driver;

import java.util.HashMap;

import main.java.org.purplecobras.keyboardwarrior.HashMap_File_Writer;
import main.java.org.purplecobras.keyboardwarrior.Ser_File_Dir;


public class DeadKey_Map_Driver {
    public static void main(String[] args) {

        HashMap<String, String> map = new HashMap<String, String>();

        map.put("", "SPACE");
        map.put("", "RETURN");
        map.put("", "ENTER");
        map.put("", "TAB");
        map.put("", "CTRL");
        map.put("", "ALT");
        map.put("", "META");
        map.put("", "ESCAPE");
        map.put("", "UNDEFINE");
        map.put("", "LEFT");
        map.put("", "DOWN");
        map.put("", "RIGHT");
        map.put("", "UP");
        map.put("", "BACKSPACE");
        map.put("", "CAPS LOCK");
        map.put("", "VOLUME DOWN");
        map.put("", "VOLUME UP");
        map.put("", "MUTE");
        map.put("", "NEXT");
        map.put("", "PLAY");
        map.put("", "PREVIOUS");
        map.put("", "UNDEFINED");

        map.put("1", "Space");
        map.put("2", "Return");
        map.put("3", "Enter");
        map.put("4", "Tab");
        map.put("5", "Ctrl");
        map.put("6", "Alt");
        map.put("7", "Meta");
        map.put("8", "Escape");
        map.put("9", "Undefined");
        map.put("10", "Left");
        map.put("11", "Down");
        map.put("12", "Right");
        map.put("13", "Up");
        map.put("14", "Unknown keyCode: 0xe36");
        map.put("15", "Shift");
        map.put("16", "Backspace");
        map.put("17", "Caps Lock");
        map.put("18", "Back Quote");
        map.put("19", "Minus");
        map.put("20", "Equals");
        map.put("21", "Open Bracket");
        map.put("22", "Close Bracket");
        map.put("23", "Semicolon");
        map.put("24", "Quote");
        map.put("25", "Comma");
        map.put("26", "Period");
        map.put("27", "Slash");
        map.put("28", "Back Slash");
        map.put("29", "Open Bracket");

        HashMap_File_Writer.hashMap_SerFileOut(map, Ser_File_Dir.SF4);
    }
}