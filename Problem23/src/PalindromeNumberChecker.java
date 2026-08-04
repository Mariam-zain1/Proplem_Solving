import java.util.Scanner;

public class PalindromeNumberChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = input.nextInt();
        int original = number;
        int reverse = 0;

        while (number > 0) {
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number /= 10;

        }
        if (original == reverse) {
            System.out.println("Palindrome Number");
        } else {
            System.out.println("Not a Palindrome");
            System.out.println("Reversed Number:" + reverse);
        }
    }
}
