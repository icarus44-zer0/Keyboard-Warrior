package keyboardwarrior;


import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.HashMap;


public class SerFileReader {

    public SerFileReader() {

    }

    @SuppressWarnings("unchecked")
    public static HashMap<String, String> serFileIn(HashMap<String, String> map, String fileName ,String filePath) {
        try {
            FileInputStream fis = new FileInputStream(filePath + fileName);
            ObjectInputStream ois = new ObjectInputStream(fis);
            map = (HashMap<String,String>) ois.readObject();
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
