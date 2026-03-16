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

    }
}
