import java.util.Scanner;

public class SumChallenge {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number:");
        int num = input.nextInt();
        int evensum = 0;
        int oddsum = 0;
        for (int i = 1; i <= num; i++) {
            if (i % 2 == 0) {
                evensum++;
            } else {
                oddsum++;
            }
        }
        System.out.println("Sum of even numbers=" + evensum);
        System.out.println("Sum of odd numbers=" + oddsum);
    }
}
