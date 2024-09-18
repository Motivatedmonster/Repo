/*
CMSC203 Assignment 1 Design
Class: CMSC203 CRN XXXX
Program: Assignment #1
Instructor: Ahemed Terk
Summary of Description: Create a guessing game that makes the user geuss
between seven colors.
Due Date: 09/10/2024 
Integrity Pledge: I pledge that I have completed the programming 
assignment independently.
I have not copied the code from a student or any source.
Student’s Name: Dagimawi Degu
*/
package guesscolor;

//import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Scanner;
import java.util.Random;
//import org.junit.jupiter.api.Test;

public class ESPGame {
public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
 System.out.println("Enter your name: ");
 String name = scanner.nextLine();
 System.out.println("Describe yourself: ");
 String description = scanner.nextLine();
 System.out.print("Due Date (MM/DD/YY): ");
 String dueDate = scanner.nextLine();
 System.out.print("CMSC203 Assignment1: Test your ESP skills!");
 final String colorRed = "Red";
 final String colorGreen = "Green";
 final String ColorBlue = "Blue";
 final String ColorYellow = "Yellow";
 final String ColorOrange = "Orange";
 String[] colors = {colorRed, colorGreen, ColorBlue, ColorYellow, ColorOrange};
 int rightGuess = 0;
 int totalRounds = 11;
 for (int round = 1; round <= totalRounds; round++) {
   System.out.println("Round " + round + ":");
   System.out.println("I am thinking of a color.");
   System.out.println("Is it Red, Green, Blue, Orange, or Yellow?");
   Random random = new Random();
   int ranIndex = random.nextInt(colors.length);
   String rightColor = colors[ranIndex];
   String Guess;
   while (true) {
     System.out.print("Enter your guess: ");
     Guess = scanner.nextLine();
     if (Guess.equalsIgnoreCase(rightColor)) {
       rightGuess++;
       System.out.println("I was thinking of " + rightColor + "!");
       break;
     }  else {
       System.out.println("I was thinking of " + rightColor + "!");
       System.out.println("You entered incorrect color. Is it Red, Green, Blue, Orange, or Yellow?");
       break;
       
     }
   }

 }
 System.out.println("\nGame Over");
 System.out.println("You guessed " + rightGuess + " out of " + totalRounds + " colors correctly.");
 System.out.println("Student Name: " + name);
 System.out.println("User Description: " + description);
 System.out.println("Due Date: " + dueDate);
}
}