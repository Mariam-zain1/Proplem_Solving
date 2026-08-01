import java.util.Scanner;

public class SecondLargestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Array size:");
        int size = input.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter element" + (i + 1) + ":");
            array[i] = input.nextInt();
        }
        int largest, secondLargest;
        if (array[0] > array[1]) {
            largest = array[0];
            secondLargest = array[1];
        } else {
            largest = array[1];
            secondLargest = array[0];
        }
        for (int i = 2; i < size; i++) {
            if (array[i] > largest) {
                secondLargest = largest;
                largest = array[i];
            } else if
            (array[i] > secondLargest) {
                secondLargest = array[i];
            }
        }
        System.out.println("Largest Number =" + largest);
        System.out.println("Second Largest Number = " + secondLargest);
    }

}

