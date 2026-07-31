
import java.util.Scanner;

public class MultiplicationChallenge {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an number:");
        int number = input.nextInt();
        int sum = 0;
        for (int i = 1; i <= 12; i++) {
            int result=number*i;
            System.out.println(number+"x"+i+"="+result);
            sum=sum+result;
        }
        System.out.println("Sum="+sum);
    }
}