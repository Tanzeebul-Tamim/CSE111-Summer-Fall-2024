package semesters_archives.fall_24.assignments.assignment_7.ungraded_tasks.task2;

public class ExamTester {
    public static void main(String[] args) {
        ScienceExam ex1 = new ScienceExam(100, 90, "Physics", "HigherMaths");
        System.out.println(ex1);
        System.out.println("---------------------");
        System.out.println(ex1.examSyllabus());
        System.out.println(ex1.examParts());
        System.out.println("=====================");
        ScienceExam ex2 = new ScienceExam(100, 120, "Physics", "HigherMaths", "Drawing");
        System.out.println(ex2);
        System.out.println("---------------------");
        System.out.println(ex2.examSyllabus());
        System.out.println(ex2.examParts());
    }
}
