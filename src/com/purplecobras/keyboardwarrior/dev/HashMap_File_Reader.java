package com.purplecobras.keyboardwarrior.dev;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.HashMap;

/**
 *
 * @author Purple Cobras
 * @version 0.0.1
 * @since 2020-04-16
 */
public class HashMap_File_Reader {

    public HashMap_File_Reader() {

    }

    public static HashMap<String, String> hashMap_In(HashMap<String, String> map, String fileName) {
        try {
            FileInputStream fis = new FileInputStream(Ser_File_Lib.SER_PATH + fileName);
            ObjectInputStream ois = new ObjectInputStream(fis);
            map = (HashMap) ois.readObject();
            ois.close();
            fis.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
            return null;
        } catch (ClassNotFoundException c) {
            System.out.println("Class not found");
            c.printStackTrace();
            return null;
        }
        return map;
    }
}
