package semesters_archives.fall_24.assignments.assignment_3.graded_tasks.task6;

public class StudentTester {
    public static void main(String[] args) {
        Student std1 = new Student();
        std1.showDetails();
        System.out.println("1---------------");
        std1.updateDetails("Alif", 3.99, 12);
        System.out.println("2---------------");
        std1.checkScholarshipEligibility();
        System.out.println("3---------------");
        std1.showDetails();
        Student std2 = new Student();
        std2.updateDetails("Mim", 3.4);
        Student std3 = new Student();
        std3.updateDetails("Henry", 3.5, 15, "BBA");
        System.out.println("5---------------");
        std2.checkScholarshipEligibility();
        System.out.println("6---------------");
        std3.checkScholarshipEligibility();
        System.out.println("7---------------");
        std2.showDetails();
        System.out.println("8---------------");
        std3.showDetails();
    }
}
