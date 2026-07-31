import java.util.Scanner;

public class DigitStatistics {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number:");
        int number = input.nextInt();
        int count = 0;
        int sum = 0;
        int largest = 0;
        int smallest = 0;
        while (number > 0) {
            int digit = number % 10;
            count++;
            sum += digit;
            if (digit > largest) {
                largest = digit;
            }
            if (digit < smallest) {
                smallest = digit;
            }
            number = number / 10;
        }
        System.out.println("Number of digits = " + count);
        System.out.println("Sum of digits = " + sum);
        System.out.println("Largest digit = " + largest);
        System.out.println("Smallest digit = " + smallest);
    }

}
