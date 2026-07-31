import java.util.Scanner;

public class CountdownTime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number:");
        int number= input.nextInt();
        if(number>0) {
            for (int i = number; i >= 0; i--) {
                System.out.println(i);
            }
            System.out.println("Blast Off! ");
        }
        else{
            System.out.println("Please enter a positive number.");

        }
    }
}
