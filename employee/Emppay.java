package employee;

import java.util.Scanner;

public class Emppay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Employee ID: ");
        int emp_id = sc.nextInt();
        sc.nextLine(); // consume newline
        System.out.print("Enter Category: ");
        String category = sc.nextLine();
        System.out.print("Enter Basic Pay: ");
        double basic_pay = sc.nextDouble();
        Emp e = new Emp(name, emp_id, category, basic_pay);
        System.out.println("\n--- Employee Payroll Details ---");
        e.printDetails();
        sc.close();
    }
}
