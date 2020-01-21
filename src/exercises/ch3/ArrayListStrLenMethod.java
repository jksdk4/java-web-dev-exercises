package exercises.ch3;

import java.util.ArrayList;

public class ArrayListStrLenMethod {
    public static void printWords(ArrayList<String> words, int lenOfWord){
        boolean someFound = false;
        for (String word : words){
            if (word.length() == lenOfWord){
                someFound = true;
                System.out.println(word);
            }
        }
        if (someFound == false){
            System.out.println("No words of length " + lenOfWord + " are in the list.");
        }
    }
}
