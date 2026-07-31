import java.util.Scanner;

public class ClassroomStatistics {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] marks = new int[10];
        int sum = 0;
        int highest = 0;
        int lowest = 0;
        int passed = 0;
        for (int i = 0; i < marks.length; i++) {
            System.out.print("Enter mark for student " + (i + 1) + ": ");
            marks[i] = input.nextInt();
            sum += marks[i];
            if (i == 0) {
                highest = marks[i];
                lowest = marks[i];
            }
            if (marks[i] > highest) {
                highest = marks[i];
            }
            if (marks[i] < lowest) {
                lowest = marks[i];
            }
            if (marks[i] >= 50) {
                passed++;
            }
        }

        double average = (double) sum / marks.length;
        System.out.println("Highest Mark = " + highest);
        System.out.println("Lowest Mark = " + lowest);
        System.out.println("Average = " + average);
        System.out.println("Passed Students = " + passed);
    }
}
