import java.util.Scanner;

public class RestaurantBill {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter price of meal 1:");
        double meal1 = input.nextDouble();
        System.out.println("Enter price of meal 2:");
        double meal2 = input.nextDouble();
        System.out.println("Enter price of meal 3:");
        double meal3 = input.nextDouble();
        double totalprice=meal1+ meal2+meal3;
        double vat =totalprice*0.14;
        double finalprice =totalprice+vat;
        System.out.println("Final price ="+finalprice);
    }
}
