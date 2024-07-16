import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int score = 0;
        
        while (true) {
            int numToGuess = random.nextInt(100) + 1;
            int numOfAttempts = 0;
            int maxAttempts = 10;
            boolean guessedCorrectly = false;
            
            System.out.println("Game Started! Guess the number between 1 to 100");
            
            while (numOfAttempts < maxAttempts && !guessedCorrectly) {
                System.out.print("Enter Your Guess: ");
                int userGuess = sc.nextInt();
                numOfAttempts++;
                
                if (userGuess == numToGuess) {
                    System.out.println("Congratulations! You have guessed the correct number.");
                    guessedCorrectly = true;
                    score++;
                } else if (userGuess < numToGuess) {
                    System.out.println("Your guess is too low...");
                } else {
                    System.out.println("Your guess is too high...");
                }
                
                if (!guessedCorrectly && numOfAttempts < maxAttempts) {
                    System.out.println("Try again. You have " + (maxAttempts - numOfAttempts) + " attempts left.");
                }
            }
            
            if (!guessedCorrectly) {
                System.out.println("Sorry, you have 0 attempts left. The correct number was " + numToGuess);
            }
            
            System.out.println("Your current score is: " + score);
            System.out.println("");
            
            System.out.print("Do you want to play again? (yes/no): ");
            String playAgain = sc.next();
            if (!playAgain.equalsIgnoreCase("yes")) {
                break;
            }
        }
        
        System.out.println("Thank you for playing! Your final score is: " + score);
        sc.close();
    }
}
