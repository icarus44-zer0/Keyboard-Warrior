package com.purplecobras.keyboardwarrior.dev;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.HashMap;

/**
 *
 * @author Purple Cobras
 * @version 0.0.1
 * @since 2020-04-16
 */
public class HashMap_File_Writer {

    HashMap_File_Writer() {

    }

    public static void hashMap_SerFileOut(HashMap<String, String> map, String fileName) {
        try {
            FileOutputStream fos = new FileOutputStream(Ser_File_Dir.FILE_PATH + fileName);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(map);
            oos.close();
            fos.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}