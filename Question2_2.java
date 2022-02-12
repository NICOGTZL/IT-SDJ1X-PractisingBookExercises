/*
Page 75 book, 103 of PDF (introduction-to-Java-Programming-Brief-Version.pdf).

2.2 (Compute the volume of a cylinder) Write a program that reads in the radius and
length of a cylinder and computes the area and volume using the following formulas:
area = radius * radius * PHI
volume = area * length
Here is a sample run:

Enter the radius and length of a cylinder: 5.5 12
The area is 95.0331
The volume is 1140.4
*/

import java.awt.*;
import java.util.Scanner;

public class Question2_2 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please enter a radius of a cylinder: ");
        double radiusCylinder = keyboard.nextDouble();

        System.out.println("\nPlease enter a length of a cylinder: ");
        double lengthCylinder = keyboard.nextDouble();

        double area = (radiusCylinder * radiusCylinder * Math.PI);
        System.out.println("\n\nThe area of the cylinder is: " + area);
        double volume = (area * lengthCylinder);
        System.out.println("\nThe volume of the cylinder is: " + volume);

    }

}
