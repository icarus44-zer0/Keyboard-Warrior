package main;
import java.util.HashMap;



public class htMain {
    public static void main(String[] args) {
        hm_FileHandler htl = new hm_FileHandler();
        HashMap<String, String> hm1 = new HashMap<String, String>();
        
        hm1.put("key1", "value1");
        hm1.put("key2", "value2");
        hm1.put("key3", "value3");
        hm1.put("key4", "value4");
        hm1.put("key5", "value5");

        htl.print(hm1);
        htl.hashMap_toFile(hm1);
        System.out.println("Exported to file");

        HashMap<String, String> hm2 = new HashMap<String, String>();
        hm2 = (HashMap<String, String>) htl.file_toHashMap(hm2);
        htl.print(hm2);
        System.out.println("Imported from file");
    }
}