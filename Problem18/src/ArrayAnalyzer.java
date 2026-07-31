import java.util.Scanner;

public class ArrayAnalyzer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int size = input.nextInt();

        int[] array = new int[size];

        int sum = 0;
        int largest = 0;
        int smallest = 0;
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = input.nextInt();
            sum += array[i];
            if (i == 0) {
                largest = array[i];
                smallest = array[i];
            }

            if (array[i] > largest) {
                largest = array[i];
            }

            if (array[i] < smallest) {
                smallest = array[i];
            }

            int average = sum / array.length;
            System.out.println("Largest Element = " + largest);
            System.out.println("Smallest Element = " + smallest);
            System.out.println("Sum = " + sum);
            System.out.println("Average = " + average);
        }
    }
}
