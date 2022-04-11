package exercises;

import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args) {
        int gallons;
        int miles;
        int mpg;
        Scanner input;

        input = new Scanner(System.in);
        System.out.println("Enter the amount of miles driven: ");
        miles = input.nextInt();

        System.out.println("Enter the amount of gallons of gas used: ");
        gallons = input.nextInt();
        input.close();

        mpg = miles / gallons;
        System.out.println("Your car gets: " + mpg + " miles per gallon.");
    }
}
