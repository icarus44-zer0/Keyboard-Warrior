package main;
import java.util.HashMap;



public class htMain {
    public static void main(String[] args) {
        hashMap_IO htl = new hashMap_IO();
        HashMap<String, String> hm1 = new HashMap<String, String>();
        
        hm1.put("key1", "value1");
        hm1.put("key2", "value2");
        hm1.put("key3", "value3");
        hm1.put("key4", "value4");
        hm1.put("key5", "value5");

        System.out.println(hm1.toString());
        htl.hashMap_Out(hm1);
        System.out.println("Exported to file");

        HashMap<String, String> hm2 = new HashMap<String, String>();
        hm2 = (HashMap<String, String>) htl.hashMap_In(hm2);
        System.out.println(hm2.toString());
        System.out.println("Imported from file");
    }
}