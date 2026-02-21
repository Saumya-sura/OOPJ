package attendance;
import java.util.Scanner;
public class AttendanceReport {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Employee ID: ");
        int empID = sc.nextInt();
        System.out.print("Enter Total Working Days: ");
        int totalWorkingDays = sc.nextInt();
        System.out.print("Enter Days Present: ");
        int daysPresent = sc.nextInt();
        EmployeeAttendance ea = new EmployeeAttendance(name, empID, totalWorkingDays, daysPresent);
        System.out.println("\n--- Attendance Summary ---");
        ea.displayAttendance();
        sc.close();
    }
}