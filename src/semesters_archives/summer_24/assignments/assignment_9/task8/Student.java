package semesters_archives.summer_24.assignments.assignment_9.task8;

public class Student {
    private static int cseStudentCount;
    private static int bbaStudentCount;
    private static int totalStudentCount;

    private String name;
    private String department;
    private int serial;
    private int deptSerial;

    public Student(String name, String department) {
        this.name = name;
        this.department = department;

        if (department.equals("CSE")) {
            cseStudentCount++;
            this.deptSerial += cseStudentCount;
        } else if (department.equals("BBA")) {
            bbaStudentCount++;
            this.deptSerial += bbaStudentCount;
        }

        totalStudentCount = cseStudentCount + bbaStudentCount;
        this.serial = totalStudentCount;

        System.out.printf("Creating Student Number: %d\n", this.serial);
    }

    public static void totalInfo() {
        System.out.printf("Total Students: %d\n", totalStudentCount);
        System.out.printf("Total CSE Students: %d\n", cseStudentCount);
        System.out.printf("Total BBA Students: %d\n", bbaStudentCount);
    }

    public void individualInfo() {
        System.out.printf("%s is from %s department.\n", this.name, this.department);
        System.out.printf("Serial of %s among all students' is: %d\n", this.name, this.serial);
        System.out.printf("Serial of %s in %s department is: %d\n", this.name, this.department, this.deptSerial);
    }
}
