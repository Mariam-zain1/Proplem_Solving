import java.util.Scanner;

public class StudentInformationCard {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your full name:");
        String Name=scanner.nextLine();
        System.out.println("Enter your Age:");
        int Age =scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter your University:");
        String Uni=scanner.nextLine();
        System.out.println("Enter your Gpa:");
        double Gpa=scanner.nextDouble();
        System.out.println("=========Student card=========");
        System.out.println("Full Name:"+Name);
        System.out.println("Age:"+Age);
        System.out.println("University:"+Uni);
        System.out.println("Gpa"+Gpa);
        System.out.println("=======================");
    }
}
