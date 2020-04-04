package main;
import java.util.HashMap;

public class htMain {
    public static void main(String[] args) {
        hm_fileHandler htl = new hm_fileHandler();
        HashMap<String, String> hm1 = new HashMap<String, String>();
        
        hm1.put("key1", "value1");
        hm1.put("key2", "value2");
        hm1.put("key3", "value3");
        hm1.put("key4", "value4");
        hm1.put("key5", "value5");

        htl.print(hm1);
        htl.hashMap_toFile(hm1);

        HashMap<String, String> hm2 = new HashMap<String, String>();
        System.out.println("Imported from file");
        htl.print(hm2);

        hm2 = (HashMap<String, String>) htl.file_toHashMap(hm2);
        System.out.println("Imported from file");
        htl.print(hm2);

    }
}