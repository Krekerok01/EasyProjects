package replacingNumberWithWords;

import java.io.*;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static Map<Integer, String> map = new HashMap<>();
    static {
        map.put(0, "ноль");
        map.put(1, "один");
        map.put(2, "два");
        map.put(3, "три");
        map.put(4, "четыре");
        map.put(5, "пять");
        map.put(6, "шесть");
        map.put(7, "семь");
        map.put(8, "восемь");
        map.put(9, "девять");
        map.put(10, "десять");
        map.put(11, "одиннадцать");
        map.put(12, "двенадцать");
    }

    public static void main(String[] args) throws IOException {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        String file = reader.readLine();
//        reader.close();

//        BufferedReader fr = new BufferedReader(new FileReader(file));
        BufferedReader fr = new BufferedReader(new FileReader(new File("src/replacingNumberWithWords/text")));
        String line;

        while ((line = fr.readLine()) != null) {
            for (Map.Entry<Integer, String> m: map.entrySet()){
                line = line.replaceAll("\\b" + m.getKey() + "\\b", m.getValue());
            }
            System.out.println(line);
        }
        fr.close();
    }
}
