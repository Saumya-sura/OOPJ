import java.util.Scanner;

public class PasswordMask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter password: ");
        String password = sc.nextLine();
        StringBuffer masked = new StringBuffer(password);
        for (int i = 0; i < masked.length(); i++) {
            masked.replace(i, i+1, "*");
        }
        System.out.println("Masked Password: " + masked);
        sc.close();
    }
}