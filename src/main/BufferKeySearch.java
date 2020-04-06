package main;

public class BufferKeySearch {

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

    private static void textExpanderData() {
    }
}