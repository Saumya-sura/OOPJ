package university;

public class Result extends Student {
    public Result(String name, int roll_no, String course, int[] marks) {
        super(name, roll_no, course, marks);
    }

    public void displayResult() {
        System.out.println("Name: " + getName());
        System.out.println("Roll No: " + getRollNo());
        System.out.println("Course: " + getCourse());
        System.out.println("Total Marks: " + getTotalMarks());
        System.out.println("Percentage: " + getPercentage());
        System.out.println("Grade: " + getGrade());
    }
}
