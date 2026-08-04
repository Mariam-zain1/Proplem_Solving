import java.util.Scanner;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] books = new String[100];
        boolean[] available = new boolean[100];
        int bookCount = 0;
        int choice;
        do {
            System.out.println("1.Add Book");
            System.out.println("2. Borrow Book");
            System.out.println("3. Return Book");
            System.out.println("4. Display Available Books");
            System.out.println("5. Exit");

            System.out.print("Choose: ");
            choice = input.nextInt();
            input.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("Enter book name:");
                    books[bookCount] = input.nextLine();
                    available[bookCount] = true;

                    bookCount++;
                    System.out.println("Book added successfully");
                    break;
                case 2:
                    System.out.print("Enter book name to borrow: ");
                    String borrowBook = input.nextLine();

                    for (int i = 0; i < bookCount; i++) {
                        if (books[i].equals(borrowBook)) {

                            if (available[i]) {
                                available[i] = false;
                                System.out.println("Book borrowed");
                            } else {
                                System.out.println("Book is already borrowed");
                            }

                            break;
                        }
                    }
                    break;
                case 3:
                    System.out.print("Enter book name to return: ");
                    String returnBook = input.nextLine();

                    for (int i = 0; i < bookCount; i++) {
                        if (books[i].equals(returnBook)) {

                            available[i] = true;
                            System.out.println("Book returned");

                            break;
                        }
                    }
                    break;

                case 4:
                    System.out.println("Available Books:");

                    for (int i = 0; i < bookCount; i++) {
                        if (available[i]) {
                            System.out.println(books[i]);
                        }
                    }
                    break;


                case 5:
                    System.out.println("Goodbye!");
                    break;


                default:
                    System.out.println("Invalid choice");
            }
        }
        while (choice != 5);
    }
}

