package com.purplecobras.keyboardwarrior.file;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.HashMap;

public class HashMap_File_Writer {

    HashMap_File_Writer() {

    }

    public static void hashMap_Out(HashMap<String, String> map,String fileName) {
        try {
            FileOutputStream fos = new FileOutputStream(Ser_File_Name.SER_PATH + fileName);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(map);
            oos.close();
            fos.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}