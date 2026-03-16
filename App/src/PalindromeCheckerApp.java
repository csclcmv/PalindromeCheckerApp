import java.util.Scanner;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // UC1 - Application Entry
        System.out.println("=================================");
        System.out.println("Welcome to Palindrome Checker App");
        System.out.println("Application Version: 1.0");
        System.out.println("=================================");

        // UC2 - Hardcoded Palindrome Check
        String word = "madam";
        String reversed = "";

        for(int i = word.length() - 1; i >= 0; i--) {
            reversed = reversed + word.charAt(i);
        }

        System.out.println("Word to check: " + word);

        if(word.equals(reversed)) {
            System.out.println("Result: It is a Palindrome");
        } else {
            System.out.println("Result: It is NOT a Palindrome");
        }

        // ==============================
        // UC3 - Palindrome Check Using String Reverse (User Input)
        // ==============================

        Scanner scanner = new Scanner(System.in);

        System.out.println("\nEnter a word to check palindrome:");
        String inputWord = scanner.nextLine();

        String reversedInput = "";

        // Reverse string using loop
        for(int i = inputWord.length() - 1; i >= 0; i--) {
            reversedInput = reversedInput + inputWord.charAt(i);
        }

        // Compare original and reversed
        if(inputWord.equals(reversedInput)) {
            System.out.println("Result: It is a Palindrome");
        } else {
            System.out.println("Result: It is NOT a Palindrome");
        }

        scanner.close();
    }
}