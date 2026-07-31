import java.util.Scanner;

public class GuessTheSecretNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int secretNumber = 73;
        int guess;
        int attempts = 0;
        do {
            System.out.println("Guess The number:");
            guess = sc.nextInt();
            attempts++;
            if (guess > secretNumber) {
                System.out.println("Too High");
            } else if (guess < secretNumber) {
                System.out.println("Too Low");
            }

        }
        while (guess != secretNumber);
        System.out.println("Correct");
        System.out.println("Attempts = " + attempts);


    }
}
