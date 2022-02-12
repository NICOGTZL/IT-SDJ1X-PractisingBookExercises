/*
2.3 (Convert feet into meters) Write a program that reads a number in feet, converts it
to meters, and displays the result. One foot is 0.305 meter. Here is a sample run:
Enter a value for feet:
16.5 feet is 5.0325 meters
16.5
*/

import java.util.Scanner;

public class Question2_3 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter a number in feet: ");
        double feetNumber = keyboard.nextDouble();

        double convertToMeters = (feetNumber * 0.305);
        System.out.println(feetNumber + " foot is " + convertToMeters + " meters.");

    }
}
