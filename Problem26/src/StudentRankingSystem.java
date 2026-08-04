import java.util.Scanner;

public class StudentRankingSystem {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = input.nextInt();
        String[] names = new String[n];
        int[] marks = new int[n];
        int sum = 0;
        int passed = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Enter student name " + (i + 1) + ": ");
            names[i] = input.next();

            System.out.print("Enter mark: ");
            marks[i] = input.nextInt();
            sum += marks[i];
            if (marks[i] >= 50) {
                passed++;
            }
        }
        int topIndex = 0;
        int lowestIndex = 0;

        for (int i = 1; i < n; i++) {

            if (marks[i] > marks[topIndex]) {
                topIndex = i;
            }

            if (marks[i] < marks[lowestIndex]) {
                lowestIndex = i;
            }
        }
        double average = (double) sum / n;

        System.out.println("Top Student: " + names[topIndex] + " - " + marks[topIndex]);
        System.out.println("Lowest Student: " + names[lowestIndex] + " - " + marks[lowestIndex]);
        System.out.println("Class Average: " + average);
        System.out.println("Number of Passed Students: " + passed);
    }

    }

