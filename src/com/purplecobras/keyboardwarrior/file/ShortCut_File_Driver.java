package com.purplecobras.keyboardwarrior.file;

import java.util.HashMap;

public class ShortCut_File_Driver {
    public static void main(String[] args) {

        HashMap<String,String> map = new HashMap<String,String>();

        map.put("/jp", "Josh Poe");
        map.put("/ov", "Oscar Vaquera");
        map.put("/la", "Luis Abello");
        map.put("/vp", "Viktoriya Penkova");
        map.put("/do", "Daniel Olsen");
        map.put("/pc", "Purple Cobras");
        HashMap_File_Writer.hashMap_Out(map, Ser_File_Name.SF1);
    }
}