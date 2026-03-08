package exp4.attendance;

public class EmployeeAttendance {
    public String name;
    public int empID;
    public int totalWorkingDays;
    public int daysPresent;
    public int daysAbsent;
    public double attendancePercentage;

    public EmployeeAttendance(String name, int empID, int totalWorkingDays, int daysPresent) {
        this.name = name;
        this.empID = empID;
        this.totalWorkingDays = totalWorkingDays;
        this.daysPresent = daysPresent;
        this.daysAbsent = totalWorkingDays - daysPresent;
        calculatePercentage();
    }

    public void calculatePercentage() {
        if (totalWorkingDays > 0) {
            attendancePercentage = (daysPresent * 100.0) / totalWorkingDays;
        } else {
            attendancePercentage = 0;
        }
    }

    public void displayAttendance() {
        System.out.println("Employee ID: " + empID);
        System.out.println("Name: " + name);
        System.out.println("Total Working Days: " + totalWorkingDays);
        System.out.println("Days Present: " + daysPresent);
        System.out.println("Days Absent: " + daysAbsent);
        System.out.println("Attendance Percentage: " + attendancePercentage + "%");
    }
}
