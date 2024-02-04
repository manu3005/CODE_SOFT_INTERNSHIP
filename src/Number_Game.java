import java.util.Random;
import java.util.Scanner;
    class Guess {
        public  int numberToGuess;
        public  int attempt;
        public int maxattempt;

        public Guess(int maxAttempts) {
            Random random = new Random();
            numberToGuess = random.nextInt(100) + 1;
            attempt = 0;
            this.maxattempt = maxAttempts;
        }

        public void playgame() {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Welcome to the Number Guessing Game!");
            System.out.println("I'm thinking of a number between 1 and 100.");

            while (attempt < maxattempt) {
                System.out.print("Take guess no " + (attempt + 1) + ": ");
                int guess = scanner.nextInt();
                attempt++;
                if (guess < numberToGuess) {
                    System.out.println("Too low!");
                } else if (guess > numberToGuess) {
                    System.out.println("Too high!");
                } else {
                    System.out.println("Congratulations! You guessed the number in " + attempt + " attempts.");
                    scanner.close();
                    return;
                }
            }

            System.out.println("Sorry, you've reached the maximum number of attempts.");
            System.out.println("The number I was thinking of was: " + numberToGuess);
            scanner.close();
        }
    }

     public class Number_Game {
        public static void main(String[] args) {
            int maxAttempts = 10;
            Guess guessingGame = new Guess(maxAttempts);
            guessingGame.playgame();
        }
    }

