import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        // Convert to lowercase and remove non-alphanumeric characters
        String cleaned = input.toLowerCase().replaceAll("[^a-z0-9]", "");
        StringBuffer sb = new StringBuffer(cleaned);
        String reversed = new StringBuffer(cleaned).reverse().toString();
        if (cleaned.equals(reversed)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a palindrome");
        }
        sc.close();
    }
}
