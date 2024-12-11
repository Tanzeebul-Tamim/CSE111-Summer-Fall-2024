package semesters_archives.fall_24.assignments.assignment_4.graded_tasks.task4;

public class StudentDriver {
    public static void main(String[] args) {
        Student student1 = new Student(12345678);
        System.out.println("1-----------------");
        student1.addCourse("CSE110");
        System.out.println("2-----------------");
        student1.storeCG(2.5);
        student1.addCourse("CSE110");
        student1.addCourse("ENG101");
        student1.showAdvisee();
        System.out.println("3-----------------");
        student1.removeAllCourse();
        student1.showAdvisee();
        System.out.println("4-----------------");
        student1.storeID(54652365);
        String[] courses = { "SOC101", "CSE111", "ENG102" };
        student1.addCourse(courses);
        student1.showAdvisee();
        System.out.println("5-----------------");
        student1.addCourse("CSE230");
        student1.showAdvisee();
        System.out.println("6-----------------");
        Student student2 = new Student(975738383, 3.7);
        System.out.println("7-----------------");
        String[] courses2 = { "CSE220", "PHY112", "MAT120", "BUS101", "CHN101" };
        student2.addCourse(courses2);
        student2.showAdvisee();
    }
}
