package org.launchcode.java.studios.areaofacircle;

import org.launchcode.java.Circle;

import java.util.Scanner;

public class Area {

    public static void  main(String[] args) {
        Scanner input;
        Double radius;
        Double areaOfCircle;

        input = new Scanner(System.in);
        System.out.println("Enter the radius for the circle: ");
        radius = input.nextDouble();
        input.close();

        areaOfCircle = Circle.getArea(radius);
        System.out.println("The area of the circle is: " + areaOfCircle);
    }
}
