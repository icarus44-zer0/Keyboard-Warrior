package main.java.org.purplecobras.keyboardwarrior;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.HashMap;


public class HashMap_File_Reader {

    public HashMap_File_Reader() {

    }

    public static HashMap<String, String> hashMap_SerFileIn(HashMap<String, String> map, String fileName) {
        try {
            FileInputStream fis = new FileInputStream(Ser_File_Dir.FILE_PATH + fileName);
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
