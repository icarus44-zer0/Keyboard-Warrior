package main.java.org.purplecobras.keyboardwarrior;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.HashMap;


public class SerFileWriter {

    SerFileWriter() {

    }

    public static void serFileOut(HashMap<String, String> map, String fileName) {
        try {
            FileOutputStream fos = new FileOutputStream(SerFileDir.FILE_PATH + fileName);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(map);
            oos.close();
            fos.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}