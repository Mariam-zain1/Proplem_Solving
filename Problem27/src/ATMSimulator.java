import java.util.Scanner;

public class ATMSimulator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double balance = 0;
        int choice;
        String[] history = new String[100];
        int historyCount = 0;
        do {
            System.out.println("\n1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Transaction History");
            System.out.println("5. Exit");

            System.out.print("Choose: ");
            choice = input.nextInt();
            switch (choice) {

                case 1:
                    System.out.print("Enter deposit amount: ");
                    double deposit = input.nextDouble();

                    balance += deposit;

                    history[historyCount] = "Deposit: " + deposit;
                    historyCount++;

                    System.out.println("Deposit successful");
                    break;

                case 2:
                    System.out.print("Enter withdraw amount: ");
                    double withdraw = input.nextDouble();
                    if (withdraw <= balance) {
                        balance -= withdraw;

                        history[historyCount] = "Withdraw: " + withdraw;
                        historyCount++;

                        System.out.println("Withdraw successful");
                    } else {
                        System.out.println("Insufficient balance");
                    }
                    break;
                case 3:
                    System.out.println("Balance: " + balance);
                    break;


                case 4:
                    System.out.println("Transaction History:");

                    for (int i = 0; i < historyCount; i++) {
                        System.out.println(history[i]);
                    }
                    break;


                case 5:
                    System.out.println("Thank you!");
                    break;


                default:
                    System.out.println("Invalid choice");
            }
        }
        while (choice != 5);

    }
}


