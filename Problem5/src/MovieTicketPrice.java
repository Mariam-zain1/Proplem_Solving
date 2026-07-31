import java.util.Scanner;

public class MovieTicketPrice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your Age:");
        int Age = input.nextInt();
        if (Age <= 6)
            System.out.println("Free Ticket");
        else if ( Age <= 17)
            System.out.println("Student Ticket");
        else if ( Age <= 60)
            System.out.println(" Regular Ticket ");
        else
            System.out.println(" Senior Discount ");
    }
}
