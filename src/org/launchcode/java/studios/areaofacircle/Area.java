package org.launchcode.java.studios.areaofacircle;
import java.util.Scanner;

public class Area {
    public static void main(String[] args){
        double radius;
        Scanner input;

        input = new Scanner(System.in);
        do {
            System.out.println("Enter a radius: ");
            if (!input.hasNextDouble()){
                System.out.println("\nInvalid input. Quitting.");
                return;
            }
            radius = input.nextDouble();
        } while (radius < 0);

        input.close();

        double area = Circle.getArea(radius);
        System.out.println("The area of a circle with radius " + radius + " is " + area);
    }
}
