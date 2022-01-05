package addLongStrings;

import java.io.*;
import java.util.ArrayList;

public class Solution {
    //проходится по файлу "rusWords" и добавляет в файл "testFileForWords" слова, длина которых превыщает 6 символов
    public static void main(String[] args)  {
        try (BufferedReader reader = new BufferedReader(new FileReader(new File("src/differentPackeges/addLongStrings/rusWords")));
        BufferedWriter writer = new BufferedWriter(new FileWriter(new File("src/differentPackeges/addLongStrings/testFileForWords")))){
            ArrayList<String> list = new ArrayList<>();
            String line;
            while ((line = reader.readLine()) != null){
                String[] lines = line.split(" ");
                for (int i = 0; i < lines.length; i++) {
                    list.add(lines[i]);
                }
            }

            ArrayList<String> list2 = new ArrayList<>();
            for (int i = 0; i < list.size(); i++){
                int u = list.get(i).length();
                if (u > 6){
                    list2.add(list.get(i));
                }
            }

            for (int i = 0; i < list2.size(); i++) {
                String n = list2.get(list2.size() - 1);
                if (list2.get(i) != n){
                    writer.write(list2.get(i) + ",");
                } else {
                    writer.write(list2.get(i));
                }
            }

        } catch (IOException e){}

    }
}
