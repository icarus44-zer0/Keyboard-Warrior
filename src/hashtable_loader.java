// source
// https://stackoverflow.com/questions/3347504/how-to-read-and-write-a-hashmap-to-a-file
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Map.Entry;

public class hashtable_loader {
    HashMap<String, String> te_HashMap = null;

    hashtable_loader() {
        te_HashMap = new HashMap<String, String>();
        te_HashMap.put("key1", "value1");
        te_HashMap.put("key2", "value2");
        te_HashMap.put("key3", "value3");
        te_HashMap.put("key4", "value4");
        te_HashMap.put("key5", "value5");
    }

    private void hashMap_toFile(HashMap<String, String> hashObj) {
        try {
            FileOutputStream fos = new FileOutputStream("hashmap.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(hashObj);
            oos.close();
            fos.close();
            System.out.printf("Serialized HashMap data is saved in hashmap.ser");
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

    private void file_toHashMap(HashMap<String, String> map) {
        try {
            FileInputStream fis = new FileInputStream("hashmap.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            map = (HashMap) ois.readObject();
            ois.close();
            fis.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
            return;
        } catch (ClassNotFoundException c) {
            System.out.println("Class not found");
            c.printStackTrace();
            return;
        }
    }

    private void print (HashMap<String, String> map){
        for( Entry<String, String> entry : map.entrySet()) {
            System.out.println( entry.getKey() + " => " + entry.getValue() );
        }
    }
}