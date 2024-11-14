package fall_24.assignments.assignment_2.graded_tasks.task5;

public class Tester5 {
    public static void main(String[] args) {
        Course c1 = new Course();
        Course c2 = new Course();
        System.out.println("========== 1 ==========");
        c1.updateDetails("Programming Language I", "CSE110", 3);
        c1.displayCourse();
        System.out.println("========== 2 ==========");
        c2.updateDetails("Data Structures", "CSE220", 3);
        c2.displayCourse();
        System.out.println("========== 3 ==========");
        c1.updateDetails("Programming Language II", "CSE111", 3);
        c1.displayCourse();
    }
}
