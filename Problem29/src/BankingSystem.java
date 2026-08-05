import java.util.Scanner;

public class BankingSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] names = new String[100];
        int[] accountNumbers = new int[100];
        double[] balances = new double[100];
        int accountCount = 0;
        int choice;
        do {
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Search by Account Number");
            System.out.println("5. Display All Accounts");
            System.out.println("6. Exit");
            System.out.print("Choose: ");
            choice = input.nextInt();
            input.nextLine();
            switch (choice) {
                case 1:
                    accountCount = createAccount(accountNumbers, names, balances, accountCount, input);
                    break;

                case 2:
                    deposit(accountNumbers, balances, accountCount, input);
                    break;

                case 3:
                    withdraw(accountNumbers, balances, accountCount, input);
                    break;

                case 4:
                    searchAccount(accountNumbers, names, balances, accountCount, input);
                    break;

                case 5:
                    displayAccounts(accountNumbers, names, balances, accountCount);
                    break;

                case 6:
                    System.out.println("Goodbye");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

        }
        while (choice != 6);
        input.close();
    }

    public static int createAccount(int[] accountNumbers, String[] names, double[] balances, int accountCount, Scanner input) {
        System.out.print("Enter Account Number: ");
        accountNumbers[accountCount] = input.nextInt();
        input.nextLine();
        System.out.print("Enter Name: ");
        names[accountCount] = input.nextLine();
        System.out.print("Enter Balance: ");
        balances[accountCount] = input.nextDouble();
        accountCount++;
        System.out.println("Account Created Successfully!");
        return accountCount;
    }
    public static void deposit(int[] accountNumbers, double[] balances,
                               int accountCount, Scanner input) {

        System.out.print("Enter Account Number: ");
        int account = input.nextInt();

        for (int i = 0; i < accountCount; i++) {

            if (accountNumbers[i] == account) {

                System.out.print("Enter Deposit Amount: ");
                double amount = input.nextDouble();

                balances[i] += amount;

                System.out.println("Deposit Successful.");
                return;
            }
        }

        System.out.println("Account Not Found.");
    }
    public static void withdraw(int[] accountNumbers, double[] balances,
                                int accountCount, Scanner input) {

        System.out.print("Enter Account Number: ");
        int account = input.nextInt();

        for (int i = 0; i < accountCount; i++) {

            if (accountNumbers[i] == account) {

                System.out.print("Enter Withdraw Amount: ");
                double amount = input.nextDouble();

                if (balances[i] >= amount) {
                    balances[i] -= amount;
                    System.out.println("Withdraw Successful.");
                } else {
                    System.out.println("Insufficient Balance.");
                }

                return;
            }
        }

        System.out.println("Account Not Found.");
    }
    public static void searchAccount(int[] accountNumbers, String[] names,
                                     double[] balances, int accountCount,
                                     Scanner input) {

        System.out.print("Enter Account Number: ");
        int account = input.nextInt();

        for (int i = 0; i < accountCount; i++) {

            if (accountNumbers[i] == account) {

                System.out.println("Account Number: " + accountNumbers[i]);
                System.out.println("Name: " + names[i]);
                System.out.println("Balance: " + balances[i]);

                return;
            }
        }

        System.out.println("Account Not Found.");
    }
    public static void displayAccounts(int[] accountNumbers, String[] names,
                                       double[] balances, int accountCount) {

        if (accountCount == 0) {
            System.out.println("No Accounts Found.");
            return;
        }

        for (int i = 0; i < accountCount; i++) {

            System.out.println("---------------------------");
            System.out.println("Account Number: " + accountNumbers[i]);
            System.out.println("Name: " + names[i]);
            System.out.println("Balance: " + balances[i]);
        }
    }
}





