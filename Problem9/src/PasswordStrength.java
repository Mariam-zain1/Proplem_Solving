import java.util.Scanner;

public class PasswordStrength {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter password:");
        String password = input.nextLine();
        boolean hasDigit = false;
        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);
            if (Character.isDigit(ch)) {
                hasDigit = true;
            }
        }
        if (password.length() >= 8 && hasDigit)
            System.out.println("Strong password");
        else
            System.out.println("Weak Password");
    }
}
