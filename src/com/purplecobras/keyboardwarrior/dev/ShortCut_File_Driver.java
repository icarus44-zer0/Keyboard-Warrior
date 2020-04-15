package com.purplecobras.keyboardwarrior.dev;

import java.util.HashMap;

import com.purplecobras.keyboardwarrior.HashMap_File_Writer;

public class ShortCut_File_Driver {
    public static void main(String[] args) {
        HashMap<String, String> short_Cut = new HashMap<String, String>();

        short_Cut.put("/jp", "Josh Poe");
        short_Cut.put("/ov", "Oscar Vaquera");
        short_Cut.put("/la", "Luis Abello");
        short_Cut.put("/vp", "Viktoriya Penkova");
        short_Cut.put("/do", "Daniel Olsen");
        short_Cut.put("/pc", "Purple Cobras");
        HashMap_File_Writer.hashMap_Out(short_Cut, Ser_File_Name.SF1);
    }
}