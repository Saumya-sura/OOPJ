// A college wants to store student details. Each student has a roll number and 
// name. 
// The system should: 
// a. Initialize student details using constructors 
// b. Display details using methods 
// c. Calculate total marks using method overloading 
class student{
    int rollNumber;
    String name;
    student(int rn, String n){
        rollNumber = rn;
        name = n;
    }
    void display(){
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
    }
    int totalMarks(int marks1, int marks2){
        return marks1 + marks2;
    }
   int totalMarks(int marks1, int marks2, int marks3){
        return marks1 + marks2 + marks3;
    }
    public static void main (String [] args){
        student s1 = new student(1, "Alice");
        s1.display();
        System.out.println("Total Marks (2 subjects): " + s1.totalMarks(85, 90));
        System.out.println("Total Marks (3 subjects): " + s1.totalMarks(85, 90, 95));
    }
}