import java.util.Scanner;

/*
2.4 (Convert pounds into kilograms) Write a program that converts pounds into kilograms.
The program prompts the user to enter a number in pounds, converts it to
kilograms, and displays the result. One pound is 0.454 kilograms. Here is a sample run:

Enter a number in pounds:
55.5 pounds is 25.197 kilograms

*/
public class Question2_4 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please enter a number in pounds: ");
        double pounds = keyboard.nextDouble();
        double kilograms = (pounds * 0.454);
        System.out.println("\n" + pounds + " pounds is " + kilograms + " kilograms.");
    }
}
