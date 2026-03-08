import java.util.Scanner;
class p{
    String name;
    int age;
    Scanner sc = new Scanner(System.in);
    void getdata(){
        System.out.println("Enter name:");
        name = sc.nextLine();
        System.out.println("Enter age:");
        age = sc.nextInt();
    }
    void display(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
class Emp extends p{
    double sal;
    void getdata(){
        super.getdata();
        System.out.println("Enter salary:");
        sal = sc.nextDouble();
    }
    void display_emp(){
        super.display();
        System.out.println("Salary: " + sal);
    }
}
class Manager extends Emp{
    String dept;
    void getdata(){
        super.getdata();
        System.out.println("Enter department:");
        dept = sc.next();
    }
    void display_manager(){
        super.display_emp();
        System.out.println("Department: " + dept);
    }
}


public class person {
    public static void main(String[] args){
        Manager m = new Manager();
        m.getdata();
        System.out.println("\n--- Manager Details ---");
        m.display_manager();
        m.display_emp();

    }
}
