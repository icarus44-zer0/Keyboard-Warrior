package com.purplecobras.keyboardwarrior;

import java.util.HashMap;

public class HashMap_File_Driver {
    public static void main(String[] args) {
        HashMap<String, String> hm1 = new HashMap<String, String>();

        hm1.put("JP", "Josh Poe");
        hm1.put("OV", "Oscar Vaquera");
        hm1.put("LA", "Luis Abello");
        hm1.put("VP", "Viktoriya Penkova");
        hm1.put("DO", "Daniel Olsen");
        hm1.put("PC", "Purple Cobras");

        System.out.println(hm1.toString());
        HashMap_File_Writer.hashMap_Out(hm1);
        System.out.println("Exported to file");

        HashMap<String, String> hm2 = new HashMap<String, String>();
        hm2 = HashMap_File_Reader.hashMap_In(hm2);

        System.out.println(hm2.toString());
        System.out.println("Imported from file");
    }
}