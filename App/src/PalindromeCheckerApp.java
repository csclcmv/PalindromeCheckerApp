import java.util.Scanner;
import java.util.Stack;

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

        for(int i = inputWord.length() - 1; i >= 0; i--) {
            reversedInput = reversedInput + inputWord.charAt(i);
        }

        if(inputWord.equals(reversedInput)) {
            System.out.println("Result: It is a Palindrome");
        } else {
            System.out.println("Result: It is NOT a Palindrome");
        }

        // ==============================
        // UC4 - Character Array Based Palindrome Check
        // ==============================

        System.out.println("\nUC4: Palindrome Check Using Character Array");

        char[] charArray = inputWord.toCharArray();

        int start = 0;
        int end = charArray.length - 1;
        boolean isPalindrome = true;

        while(start < end) {
            if(charArray[start] != charArray[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        if(isPalindrome) {
            System.out.println("Result (UC4): It is a Palindrome");
        } else {
            System.out.println("Result (UC4): It is NOT a Palindrome");
        }

        // ==============================
        // UC5 - Stack-Based Palindrome Checker
        // ==============================

        System.out.println("\nUC5: Palindrome Check Using Stack");

        Stack<Character> stack = new Stack<>();

        // Push characters into stack
        for(int i = 0; i < inputWord.length(); i++) {
            stack.push(inputWord.charAt(i));
        }

        String reversedStack = "";

        // Pop characters to form reversed string
        while(!stack.isEmpty()) {
            reversedStack = reversedStack + stack.pop();
        }

        // Compare original and reversed
        if(inputWord.equals(reversedStack)) {
            System.out.println("Result (UC5): It is a Palindrome");
        } else {
            System.out.println("Result (UC5): It is NOT a Palindrome");
        }

        scanner.close();
    }
}