package com.purplecobras.keyboardwarrior.dev;

import java.util.HashMap;

public class ShortCut_Map_Driver {
    public static void main(String[] args) {

        HashMap<String,String> map = new HashMap<String,String>();

        map.put("/jp", "Josh Poe");
        map.put("/ov", "Oscar Vaquera");
        map.put("/la", "Luis Abello");
        map.put("/vp", "Viktoriya Penkova");
        map.put("/do", "Daniel Olsen");
        map.put("/pc", "Purple Cobras");
        HashMap_File_Writer.hashMap_Out(map, Ser_File_Lib.SF1);
    }
}