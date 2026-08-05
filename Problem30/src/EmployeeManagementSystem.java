import java.util.Scanner;

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        String [] names =new String[100];
        int [] ids =new int[100];
        double [] salaries = new double[100];
        int employeeCount = 0;
        int choice;
        do {

            System.out.println("===== Employee Management System =====");
            System.out.println("1. Add Employee");
            System.out.println("2. Search Employee");
            System.out.println("3. Update Employee Salary");
            System.out.println("4. Delete Employee");
            System.out.println("5. Display All Employees");
            System.out.println("6. Exit");
            System.out.print("Choose: ");

            choice = input.nextInt();
            input.nextLine();

            switch (choice) {

                case 1:
                    employeeCount = addEmployee(ids, names, salaries, employeeCount, input);
                    break;

                case 2:
                    searchEmployee(ids, names, salaries, employeeCount, input);
                    break;

                case 3:
                    updateSalary(ids, salaries, employeeCount, input);
                    break;

                case 4:
                    employeeCount = deleteEmployee(ids, names, salaries, employeeCount, input);
                    break;

                case 5:
                    displayEmployees(ids, names, salaries, employeeCount);
                    break;

                case 6:
                    System.out.println("Goodbye!");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 6);

        input.close();
    }

    public static int addEmployee(int[] ids, String[] names,
                                  double[] salaries, int employeeCount,
                                  Scanner input) {

        System.out.print("Enter Employee ID: ");
        ids[employeeCount] = input.nextInt();
        input.nextLine();

        System.out.print("Enter Employee Name: ");
        names[employeeCount] = input.nextLine();

        System.out.print("Enter Employee Salary: ");
        salaries[employeeCount] = input.nextDouble();

        employeeCount++;

        System.out.println("Employee Added Successfully!");

        return employeeCount;
    }

    public static void searchEmployee(int[] ids, String[] names,
                                      double[] salaries, int employeeCount,
                                      Scanner input) {

        System.out.print("Enter Employee ID: ");
        int id = input.nextInt();

        for (int i = 0; i < employeeCount; i++) {

            if (ids[i] == id) {

                System.out.println("ID: " + ids[i]);
                System.out.println("Name: " + names[i]);
                System.out.println("Salary: " + salaries[i]);

                return;
            }
        }

        System.out.println("Employee Not Found.");
    }

    public static void updateSalary(int[] ids, double[] salaries,
                                    int employeeCount, Scanner input) {

        System.out.print("Enter Employee ID: ");
        int id = input.nextInt();

        for (int i = 0; i < employeeCount; i++) {

            if (ids[i] == id) {

                System.out.print("Enter New Salary: ");
                salaries[i] = input.nextDouble();

                System.out.println("Salary Updated Successfully.");

                return;
            }
        }

        System.out.println("Employee Not Found.");
    }

    public static int deleteEmployee(int[] ids, String[] names,
                                     double[] salaries, int employeeCount,
                                     Scanner input) {

        System.out.print("Enter Employee ID: ");
        int id = input.nextInt();

        for (int i = 0; i < employeeCount; i++) {

            if (ids[i] == id) {

                for (int j = i; j < employeeCount - 1; j++) {

                    ids[j] = ids[j + 1];
                    names[j] = names[j + 1];
                    salaries[j] = salaries[j + 1];
                }

                employeeCount--;

                System.out.println("Employee Deleted Successfully.");

                return employeeCount;
            }
        }

        System.out.println("Employee Not Found.");

        return employeeCount;
    }

    public static void displayEmployees(int[] ids, String[] names,
                                        double[] salaries, int employeeCount) {

        if (employeeCount == 0) {

            System.out.println("No Employees Found.");
            return;
        }

        for (int i = 0; i < employeeCount; i++) {

            System.out.println("-------------------------");
            System.out.println("ID: " + ids[i]);
            System.out.println("Name: " + names[i]);
            System.out.println("Salary: " + salaries[i]);
        }
    }
}
