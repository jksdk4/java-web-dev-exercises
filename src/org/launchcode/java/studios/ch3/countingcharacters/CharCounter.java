package org.launchcode.java.studios.ch3.countingcharacters;

import java.util.HashMap;

public class CharCounter {
    public static HashMap<Character, Integer> countChars(String paragraph){
        HashMap<Character, Integer> charPair = new HashMap<>();
        char[] charactersInString = paragraph.toCharArray();
        char character;

        for (char c : charactersInString){
            if (!charPair.containsKey(c)){
                character = c;
                int count = 0;

                for (char d : charactersInString){
                    if (character == d){
                        count += 1;
                    }
                }
                charPair.put(character,count);
            }
        }
        return charPair;
    }
}
