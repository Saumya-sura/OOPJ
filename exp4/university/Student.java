package exp4.university;

public class Student {
    private String name;
    private int roll_no;
    private String course;
    private int[] marks;

    public Student(String name, int roll_no, String course, int[] marks) {
        this.name = name;
        this.roll_no = roll_no;
        this.course = course;
        this.marks = marks;
    }

    public int getTotalMarks() {
        int total = 0;
        for (int m : marks) total += m;
        return total;
    }

    public double getPercentage() {
        return (getTotalMarks() / (marks.length * 100.0)) * 100;
    }

    public String getGrade() {
        double percent = getPercentage();
        if (percent >= 90) return "A";
        else if (percent >= 75) return "B";
        else if (percent >= 60) return "C";
        else if (percent >= 40) return "D";
        else return "F";
    }

    // Getters for StudentPortal (not private data)
    public String getName() { return name; }
    public int getRollNo() { return roll_no; }
    public String getCourse() { return course; }
}
