import java.util.Scanner;

public class PrimeAnalyzer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = input.nextInt();
        boolean isprime = true;
        int smalldivisor = 0;
        if (num <= 1) {
            isprime = false;
        } else {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    isprime = false;
                    smalldivisor = i;
                    break;
                }
            }
        }
        if (isprime) {
            System.out.println("Prime Number");
        } else {
            System.out.println("Not Prime Number");
        }
        if (smalldivisor != 0) {
            System.out.println("Smallest Divisor = " + smalldivisor);
        }
        }
    }

