import java.util.Scanner;

public class FibonacciAnalyzer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter N:");
        int N = input.nextInt();
        int first = 0;
        int second = 1;
        int sum = 0;
        int largest = 0;
        if (N >= 1) {
            System.out.println(first);
            sum += first;
        }

        if (N >= 2) {
            System.out.println(second);
            sum += second;
            largest = second;
        }
        for (int i = 3; i < N; i++) {
            int next = first + second;
            System.out.println(next);
            sum += next;
            largest = next;
            first = second;
            second = next;
        }
        System.out.println("Largest Fibonacci Number = " + largest);
        System.out.println("Sum = " + sum);
    }
}
