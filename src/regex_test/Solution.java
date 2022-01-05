package regex_test;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(new File("src/regex/TestPhoneNumber")));

        Pattern pattern = Pattern.compile("\\d\\,[\\d]+");
        String line;

        while ((line = reader.readLine()) != null){
            Matcher m2 = pattern.matcher(line);
            if (m2.find()){
                System.out.println(m2.group());
            }

            if (line.matches("\\+\\d{3}[\\(-]?\\d{2}[\\)-]?\\d{3}-?\\d{2}-?\\d{2}")){
                System.out.println(line);
            }
        }


    }
}
