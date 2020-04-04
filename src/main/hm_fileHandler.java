package main;
// source
// https://stackoverflow.com/questions/3347504/how-to-read-and-write-a-hashmap-to-a-file

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class hm_FileHandler {
    //HashMap<String, String> te_HashMap = null;

    hm_FileHandler() {

    }

    public void hashMap_toFile(HashMap<String, String> map) {
        try {
            FileOutputStream fos = new FileOutputStream("hashmap.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(map);
            oos.close();
            fos.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

    public Map<String,String> file_toHashMap(HashMap<String, String> map) {
        try {
            FileInputStream fis = new FileInputStream("hashmap.ser");
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

    public void print (HashMap<String, String> map){
        for( Entry<String, String> entry : map.entrySet()) {
            System.out.println( entry.getKey() + " => " + entry.getValue() );
        }
    }
}