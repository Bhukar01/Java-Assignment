import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PangramChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();
        scanner.close();

        boolean isPangram = isPangram(input);

        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }

    public static boolean isPangram(String input) {
        // Create a set to store encountered letters
        Set<Character> letters = new HashSet<>();

        // Iterate through the input string
        for (char ch : input.toLowerCase().toCharArray()) {
            if (Character.isLetter(ch)) {
                // Add the lowercase letter to the set
                letters.add(ch);
            }
        }

        // Check if the set contains all letters from 'a' to 'z'
        for (char ch = 'a'; ch <= 'z'; ch++) {
            if (!letters.contains(ch)) {
                return false; // If any letter is missing, it's not a pangram
            }
        }

        return true; // All letters from 'a' to 'z' were encountered
    }
}
