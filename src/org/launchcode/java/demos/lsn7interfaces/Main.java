package org.launchcode.java.demos.lsn7interfaces;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        Case menu = new Case();
        ArrayList<Flavor> flavors = menu.getFlavors();
        ArrayList<Cone> cones = menu.getCones();

        System.out.println("Before: \n");
        for (Flavor flavor : flavors){
            System.out.println(flavor.getName());
        }
        // TODO: Use a Comparator class to sort the 'flavors' array alphabetically by the 'name'
        //  field.
        flavors.sort(new FlavorComparator());
        System.out.println("\nAfter: \n");
        for (Flavor flavor : flavors){
            System.out.println(flavor.toString());
        }

        // TODO: Use a Comparator class to sort the 'cones' array in increasing order by the 'cost'
        //  field.

        System.out.println("\nBefore:\n");
        for (Cone cone : cones){
            System.out.println(cone.getName() + ": $" + cone.getCost());
        }

        cones.sort(new ConeComparator());
        System.out.println("\nAfter:\n");
        for (Cone cone : cones){
            System.out.println(cone.getName() + ": $" + cone.getCost());
        }

        // TODO: Print the 'flavors' and 'cones' lists (in a clear manner) to verify the sorting.
    }
}
