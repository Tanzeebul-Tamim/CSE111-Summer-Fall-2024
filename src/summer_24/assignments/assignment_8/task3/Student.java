package summer_24.assignments.assignment_8.task3;

public class Student {
    private static int totalStudent;
    private static int cseStudent;

    private String name;
    private int id;
    private double cgpa;
    private String department;

    public Student(String name, double cgpa) {
        this.id = ++totalStudent;
        this.name = name;
        this.cgpa = cgpa;
        this.department = "CSE";
        cseStudent++;
    }

    public static Student createStudent(String name, double cgpa, String department) {
        Student newStudent = new Student(name, cgpa);
        newStudent.department = department;

        if (!newStudent.department.equals("CSE")) {
            cseStudent--;
        }

        return newStudent;
    }

    public static void printDetails() {
        int otherDeptStudents = totalStudent - cseStudent;

        System.out.printf("Total Student(s): %d\n", totalStudent);
        System.out.printf("CSE Student(s): %d\n", cseStudent);
        System.out.printf("Other Department Student(s): %d\n", otherDeptStudents);
    }

    public void individualDetail() {
        String formattedCgpa = String.format("%.2f", this.cgpa);

        if (formattedCgpa.endsWith(".00")) {
            formattedCgpa = formattedCgpa.substring(0, formattedCgpa.length() - 3);

        } else if (formattedCgpa.endsWith("0")) {
            formattedCgpa = formattedCgpa.substring(0, formattedCgpa.length() - 1);
        }

        System.out.printf("ID: %d\n", this.id);
        System.out.printf("Name: %s\n", this.name);
        System.out.printf("CGPA: %s\n", formattedCgpa);
        System.out.printf("Department: %s\n", this.department);
    }

}
