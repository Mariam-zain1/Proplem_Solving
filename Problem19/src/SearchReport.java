import java.util.Scanner;

public class SearchReport {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int size = input.nextInt();

        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = input.nextInt();
        }
        System.out.print("Enter target number: ");
        int target = input.nextInt();
        int position = -1;
        int occurrences = 0;
        for (int i = 0; i < array.length; i++) {

            if (array[i] == target) {

                occurrences++;

                if (position == -1) {
                    position = i;
                }
            }
        }
        if (occurrences > 0) {
            System.out.println("Found");
            System.out.println("Position = " + position);
            System.out.println("Occurrences = " + occurrences);
        } else {
            System.out.println("Not Found");
        }
    }
}
