package org.launchcode.java.studios.ch3.countingcharacters;

import java.util.HashMap;

public class CharCounter {
    public static HashMap<Character, Integer> countChars(String paragraph){
        HashMap<Character, Integer> charPair = new HashMap<>();
        char[] charactersInString = paragraph.toCharArray();

        for (char c : charactersInString){
            if (!Character.isAlphabetic(c)){        // skip if not a letter
                continue;
            }
            if (!charPair.containsKey(Character.toLowerCase(c))){
                int count = 0;      // hasn't been counted yet, initializing the count as a new found char
                for (char d : charactersInString){
                    if (Character.toLowerCase(c) == Character.toLowerCase(d)){
                        count += 1;     // if the first instance of c as well as others past its index == d
                    }                   // then add up all of the future instances
                }                       // then if the char is already in the hash map it won't redo this
                charPair.put(Character.toLowerCase(c),count);
            }
        }
        return charPair;
    }
}
