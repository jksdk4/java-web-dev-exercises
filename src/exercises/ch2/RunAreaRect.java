package exercises.ch2;

import java.util.Scanner;

public class RunAreaRect {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double wid;
        do {
            System.out.println("Enter the width: ");
            wid = input.nextDouble();
        } while (wid < 0);
        // why can't I seem to find a way to check for empty input??


        System.out.println("Enter the length: ");
        double len = input.nextDouble();

        double area = AreaRect.calcAreaRect(wid,len);
        System.out.println("The area of the rectangle is: " + area);
        if (len == wid){
            System.out.println("This rectangle is also a square!");
        }
    }
}
