package main;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BufferKeySearch {
    public static Map<Object, String> m = new HashMap<Object, String>();


    public static void textExpander(Buffer buf) {
        String ret = "";

        try {
            textExpanderData();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        Object[] arr = buf.toArray();
        for (int i = 0; i < arr.length; i++) {
            ret += arr[i];
        }

        ret = ret.toLowerCase();

        if (m.containsKey(ret)) {
            System.out.println(m.get(ret));
        }
    }

    public static void textExpanderData()throws FileNotFoundException {
		Scanner scan = new Scanner( new File("file.txt"));
		while(scan.hasNextLine()) {
			int count = 0;
			Object key = "";
			String value = "";
			Scanner line = new Scanner(scan.nextLine());
			while(line.hasNext()) {
				if(count == 0) {
					key = line.next();
					count++;
				}else {
					value = value + " " + line.next();
				}
			}
			m.put(key, value);
		}
		
		scan.close();
	}
	
	public static void textExpanderInput(Object key, String value) {
		try(
				FileWriter fw = new FileWriter("file.txt", true);
			    BufferedWriter bw = new BufferedWriter(fw);
			    PrintWriter out = new PrintWriter(bw))
			{
			
			    out.println(key + "				" + value);
			
			} catch (IOException e) {
				
				System.err.println("IOException: " + e.getMessage());
			}
		
	}
}