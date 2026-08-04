import java.util.Scanner;

public class StringAnalyzer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String sentence = input.nextLine();
        int characters = sentence.length();
        int words = 0;
        int vowels = 0;
        int consonants = 0;

        if (!sentence.trim().isEmpty()) {
            words = 1;
        }
        for (int i = 0; i < sentence.length(); i++) {
            char letter = sentence.charAt(i);
            if (letter == ' ') {
                words++;
            }
            if (Character.isLetter(letter)) {
                letter = Character.toLowerCase(letter);

                if (letter == 'a' || letter == 'e' || letter == 'i' ||
                        letter == 'o' || letter == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }
        System.out.println("Number of Characters: " + characters);
        System.out.println("Number of Words: " + words);
        System.out.println("Number of Vowels: " + vowels);
        System.out.println("Number of Consonants: " + consonants);
    }
}
