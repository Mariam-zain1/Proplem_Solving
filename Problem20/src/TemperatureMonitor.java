import java.util.Scanner;

public class TemperatureMonitor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] temperatures = new double[7];
        double sum = 0;
        for (int i = 0; i <= temperatures.length; i++) {
            System.out.print("Enter Day " + (i + 1) + ": ");
            temperatures[i] = input.nextDouble();
            sum += temperatures[i];
        }
        double average = sum / temperatures.length;
        double highest = temperatures[0];
        double lowest = temperatures[0];
        int daysAboveAverage = 0;
        for (int i = 0; i < temperatures.length; i++) {

            if (temperatures[i] > highest) {
                highest = temperatures[i];
            }

            if (temperatures[i] < lowest) {
                lowest = temperatures[i];
            }

            if (temperatures[i] > average) {
                daysAboveAverage++;
            }
        }
        System.out.println("Highest Temperature = " + highest);
        System.out.println("Lowest Temperature = " + lowest);
        System.out.println("Weekly Average = " + average);
        System.out.println("Days Above Average = " + daysAboveAverage);
    }
}
