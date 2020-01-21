package exercises.ch3;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListPractice {
    public static void main(String[] args) {
        // numbers
        ArrayList<Integer> someNums = new ArrayList<>();
        for (int i = 2; i < 70; i += 7){
            someNums.add(i);    // just random increment to fill array with ten digits
        }
        System.out.println(someNums);

        int totalEvens = ArrayListSumMethod.getSumOfEvens(someNums);
        System.out.println("The sum of the even numbers is: " + totalEvens);

        // strings
        ArrayList<String> someWords = new ArrayList<>();
        someWords.add("ferret");
        someWords.add("five");
        someWords.add("serious");
        someWords.add("three");
        someWords.add("seven");
        someWords.add("forty");
        someWords.add("farcical");
        someWords.add("Java");

        Scanner input = new Scanner(System.in);
        System.out.println("\nHow long of a word? ");
        int wordLen = input.nextInt();

        ArrayListStrLenMethod.printWords(someWords, wordLen);
    }
}
