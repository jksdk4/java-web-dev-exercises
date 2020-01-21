package exercises.ch3;

import java.util.ArrayList;

public class ArrayListSumMethod {
    public static int getSumOfEvens(ArrayList<Integer> numList){
        int sumOfEvenNums = 0;
        for (int i = 0; i < numList.size(); i++){
            if (i % 2 == 0){
                sumOfEvenNums += numList.get(i);
            }
        }
        return sumOfEvenNums;
    }
}
