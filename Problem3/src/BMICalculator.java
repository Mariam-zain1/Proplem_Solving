import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your weight(kg) :");
        double weight = input.nextDouble();
        System.out.println("Enter your Height(meters): ");
        double height = input.nextDouble();
        double BMI = weight / (height * height);
        if (BMI < 18.5)
            System.out.println("Underweight");
        else if (BMI < 25)
            System.out.println("Normal");
        else if (BMI < 30)
            System.out.println("Overweight");
        else
            System.out.println("obese");
    }
}
