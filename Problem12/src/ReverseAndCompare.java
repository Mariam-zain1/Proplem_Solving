import java.util.Scanner;

public class ReverseAndCompare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = input.nextInt();
        int original = number;
        int reverse = 0;
        while (number > 0) {
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number = number / 10;
        }
        System.out.println("Reverse=" + reverse);
        if (original == reverse) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }
    }
}
