package org.launchcode.java.studios.ch3.countingcharacters;

import java.util.HashMap;
import java.util.Map;

public class charCount {
    public static void main(String[] args) {
        String hiddenFigs = "If the product of two terms is zero then common sense says at least one of the " +
                "two terms has to be zero to start with. So if you move all the terms over to one side, you can" +
                " put the quadratics into a form that can be factored allowing that side of the equation to " +
                "equal zero. Once you've done that, it's pretty straightforward from there.";

        HashMap<Character, Integer> charPairs = CharCounter.countChars(hiddenFigs);
        for (Map.Entry<Character, Integer> charPair : charPairs.entrySet()){
            System.out.println(charPair.getKey() + ": " + charPair.getValue());
        }
    }
}
