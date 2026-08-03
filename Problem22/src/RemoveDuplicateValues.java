import java.util.Scanner;

public class RemoveDuplicateValues {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Array size:");
        int size = input.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter element" + (i + 1) + ":");
            array[i] = input.nextInt();
        }
        int[] unique = new int[size];
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            boolean found = false;
            for (int j = 0; j < count; j++) {
                if (array[i] == unique[j]) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                unique[count] = array[i];
                count++;
            }
        }
        for (int i = 0; i < count; i++) {
            System.out.print(unique[i] + " ");
        }
    }
}
