package semesters_archives.summer_24.assignments.assignment_4.task11;

public class Test11 {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = null;
        s1.name = "Student One";
        s1.cgpa = 2.3;
        s3 = s1;
        s2.name = "Student Two";
        s2.cgpa = s3.cgpa + 1;
        s3.name = "New Student";
        System.out.println(s1.name);
        System.out.println(s2.name);
        System.out.println(s3.name);
        System.out.println(s1.cgpa);
        System.out.println(s2.cgpa);
        System.out.println(s3.cgpa);
        s3 = s2;
        s1.name = "old student";
        s2.name = "older student";
        s3.name = "oldest student";
        s2.cgpa = s1.cgpa - s3.cgpa + 4.5;
        System.out.println(s1.name);
        System.out.println(s2.name);
        System.out.println(s3.name);
        System.out.println(s1.cgpa);
        System.out.println(s2.cgpa);
        System.out.println(s3.cgpa);
    }
}

// Output:
/*
 * New Student
 * Student Two
 * New Student
 * 2.3
 * 3.3
 * 2.3
 * old student
 * oldest student
 * oldest student
 * 2.3
 * 3.5
 * 3.5
 */