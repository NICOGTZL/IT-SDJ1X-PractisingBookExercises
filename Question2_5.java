//*2.5 (Financial application: calculate tips) Write a program that reads the subtotal and
//the gratuity rate, then computes the gratuity and total. For example, if the user
//enters 10 for subtotal and 15% for gratuity rate, the program displays $1.5 as gratuity and $11.5 as total.
// Here is a sample run:

//Enter the subtotal and a gratuity rate: 10 15
//The gratuity is $1.5 and total is $11.5

import java.util.Scanner;

public class Question2_5 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter the subtotal: ");
        double subtotal = keyboard.nextDouble();

        System.out.print("Please enter a gratuity rate: ");
        double gratuityRate = keyboard.nextDouble();

        double gratuity = (gratuityRate * subtotal / 100);
        double total = (gratuity + subtotal);
        System.out.print("The gratuity is $" + gratuity + " and total is $" + total + ".");
    }
}
