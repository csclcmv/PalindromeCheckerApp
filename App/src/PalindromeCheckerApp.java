import java.util.Scanner;
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Deque;
import java.util.ArrayDeque;

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
        // UC3 - User Input (String Reverse)
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
        // UC4 - Character Array (Two Pointer)
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
        // UC5 - Stack-Based
        // ==============================

        System.out.println("\nUC5: Palindrome Check Using Stack");

        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < inputWord.length(); i++) {
            stack.push(inputWord.charAt(i));
        }

        String reversedStack = "";

        while(!stack.isEmpty()) {
            reversedStack = reversedStack + stack.pop();
        }

        if(inputWord.equals(reversedStack)) {
            System.out.println("Result (UC5): It is a Palindrome");
        } else {
            System.out.println("Result (UC5): It is NOT a Palindrome");
        }

        // ==============================
        // UC6 - Queue + Stack Comparison
        // ==============================

        System.out.println("\nUC6: Palindrome Check Using Queue + Stack");

        Stack<Character> stack2 = new Stack<>();
        Queue<Character> queue = new LinkedList<>();

        for(int i = 0; i < inputWord.length(); i++) {
            char ch = inputWord.charAt(i);
            stack2.push(ch);
            queue.add(ch);
        }

        boolean isPalindromeQS = true;

        while(!stack2.isEmpty() && !queue.isEmpty()) {
            if(stack2.pop() != queue.remove()) {
                isPalindromeQS = false;
                break;
            }
        }

        if(isPalindromeQS) {
            System.out.println("Result (UC6): It is a Palindrome");
        } else {
            System.out.println("Result (UC6): It is NOT a Palindrome");
        }

        // ==============================
        // UC7 - Deque-Based Optimized Check
        // ==============================

        System.out.println("\nUC7: Palindrome Check Using Deque");

        Deque<Character> deque = new ArrayDeque<>();

        // Insert characters into deque
        for(int i = 0; i < inputWord.length(); i++) {
            deque.add(inputWord.charAt(i));
        }

        boolean isPalindromeDeque = true;

        // Compare front and rear
        while(deque.size() > 1) {
            char front = deque.removeFirst();
            char rear = deque.removeLast();

            if(front != rear) {
                isPalindromeDeque = false;
                break;
            }
        }

        if(isPalindromeDeque) {
            System.out.println("Result (UC7): It is a Palindrome");
        } else {
            System.out.println("Result (UC7): It is NOT a Palindrome");
        }

        scanner.close();
    }
}