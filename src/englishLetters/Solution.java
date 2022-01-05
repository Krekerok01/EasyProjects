package englishLetters;


import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream(new File("src/englishLetters/letters.txt"));


        char[] lettersArray = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        char[] lettersBigArray = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        int count = 0;

        while (fis.available() > 0){
            char letterFromFile = (char) fis.read();
            for (char letter: lettersArray){
                if (letter == letterFromFile){
                    count++;
                }
            }

            for (char letter: lettersBigArray){
                if (letter == letterFromFile){
                    count++;
                }
            }
        }

        fis.close();
        System.out.println(count);
    }
}
