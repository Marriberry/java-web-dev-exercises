package exercises;

import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        int width;
        int length;
        int area;
        Scanner input;

        input = new Scanner(System.in);
        System.out.println("Enter the length for the rectangle: ");
        length = input.nextInt();

        System.out.println("Enter a width for the rectangle: ");
        width = input.nextInt();
        input.close();

        area = length * width;
        System.out.println("The area of the rectangle is: " + area + " square units.");
    }
}
