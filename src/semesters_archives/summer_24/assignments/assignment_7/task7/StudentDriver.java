package semesters_archives.summer_24.assignments.assignment_7.task7;

public class StudentDriver {
    public static void main(String[] args) {
        System.out.println("-----------------");
        Student student1 = new Student(12345678);
        student1.addCourse("CSE110");
        student1.setCG(2.5);
        student1.addCourse("CSE110");
        student1.addCourse("ENG101");
        student1.showAdvisee();
        System.out.println("-----------------");
        student1.rmAllCourse();
        student1.showAdvisee();
        System.out.println("-----------------");
        student1.setID(54652365);
        String[] courses = { "SOC101", "CSE111", "ENG102" };
        student1.addCourse(courses);
        student1.showAdvisee();
        System.out.println("-----------------");
        student1.addCourse("CSE230");
        student1.showAdvisee();
        System.out.println("-----------------");
        Student student2 = new Student(975738383, 3.7);
        String[] courses2 = { "CSE220", "PHY112", "MAT120", "BUS101", "CHN101" };
        student2.addCourse(courses2);
        student2.showAdvisee();
    }
}
