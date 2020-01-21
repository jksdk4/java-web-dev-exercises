package exercises.ch3;

import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 3, 5, 8};
        for (int num : nums){
            if (num % 2 == 1){
                System.out.println(num);
            }
        }

        String sam = "I would not, could not, in a box. I would not, could not with " +
                "a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] samArr = sam.split("\\.");
        System.out.println(Arrays.toString(samArr));
    }
}
