package keyboardwarrior;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.HashMap;


public class SerFileWriter {

    SerFileWriter() {

    }

    public static void serFileOut(HashMap<String, String> map, String fileName, String filePath) {
        try {
            FileOutputStream fos = new FileOutputStream(filePath + fileName);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(map);
            oos.close();
            fos.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}