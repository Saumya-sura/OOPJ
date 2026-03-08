package exp4.portal;
import java.util.Scanner;

import exp4.university.Student;

public class StudentPortal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student name: ");
        String name = sc.nextLine();
        System.out.print("Enter roll number: ");
        int rollNo = sc.nextInt();
        sc.nextLine(); // consume newline
        System.out.print("Enter course: ");
        String course = sc.nextLine();
        System.out.print("Enter number of subjects: ");
        int n = sc.nextInt();
        int[] marks = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter marks for subject " + (i+1) + ": ");
            marks[i] = sc.nextInt();
        }
        Student s = new Student(name, rollNo, course, marks);
        System.out.println("\nStudent Name: " + s.getName());
        System.out.println("Roll No: " + s.getRollNo());
        System.out.println("Course: " + s.getCourse());
        // The following lines would cause error if uncommented:
        // System.out.println(s.marks); // Not accessible
        // System.out.println(s.name);  // Not accessible
        sc.close();
    }
}
