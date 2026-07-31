import java.util.Scanner;

public class ATMPINVerification {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Please enter pin:");
        int pin=input.nextInt();
        if(pin==1234)
            System.out.println("Access Granted");
        else
            System.out.println("Invalid PIN");
    }
}
