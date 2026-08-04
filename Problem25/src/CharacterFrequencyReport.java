import java.util.Scanner;

public class CharacterFrequencyReport {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Word:");
        String word = input.next();
        for (int i = 0; i < word.length(); i++) {
            char current = word.charAt(i);
            boolean found = false;
            for (int j = 0; j < i; j++) {
                if (current == word.charAt(j)) {
                    found = true;
                    break;
                }
            }
            if (found) {
                continue;
            }
            int count = 0;
            for (int k = 0; k < word.length(); k++) {
                if (current == word.charAt(k)) {
                    count++;
                }
            }

            System.out.println(current + " : " + count);
        }
    }
}
