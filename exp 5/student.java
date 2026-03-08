import java.util.Scanner;
 class stu {
        String name, dob;
        int roll_no;
        void input (){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter name:");
            name = sc.nextLine();
            System.out.println("Enter date of birth:");
            dob = sc.nextLine();
            System.out.println("Enter roll number:");
            roll_no = sc.nextInt();
        }
}
class marks extends stu{
    int m1,m2,m3;
    double total, percentage;
    char grade;
    void input_marks(){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter marks of subject 1:");
        m1 = sc.nextInt();
        System.out.println("Enter marks of subject 2:");
        m2 = sc.nextInt();
        System.out.println("Enter marks of subject 3:");
        m3 = sc.nextInt();
    }
    void compute (){
        total = m1 + m2 + m3;
        percentage = total / 3.0;
        if (percentage >= 90) {
            grade = 'A';
        } else if (percentage >= 80) {
            grade = 'B';
        } else if (percentage >= 70) {
            grade = 'C';
        } else if (percentage >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
    }
    void show (){
        System.out.println("Name: " + name);
        System.out.println("Date of Birth: " + dob);
        System.out.println("Roll Number: " + roll_no);
        System.out.println("Marks: " + m1 + ", " + m2 + ", " + m3);
        System.out.println("Total Marks: " + total);
        System.out.println("Percentage: " + percentage);
        System.out.println("Grade: " + grade);
    }
}
public class student{
public static void main (String[] args){
    marks obj = new marks();
    obj.input();
    obj.input_marks();
    obj.compute();
    obj.show();
}
}