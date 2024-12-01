package summer_24.assignments.assignment_9.task8;

public class StudentTester2 {
    public static void main(String[] args) {
        Student s1 = new Student("Naruto", "CSE");
        System.out.println("1----------------");
        s1.individualInfo();
        System.out.println("################");
        Student.totalInfo();
        System.out.println("==================");
        Student s2 = new Student("Sakura", "BBA");
        System.out.println("2----------------");
        s2.individualInfo();
        System.out.println("################");
        Student.totalInfo();
        System.out.println("==================");
        Student s3 = new Student("Shikamaru", "CSE");
        System.out.println("3----------------");
        s3.individualInfo();
        System.out.println("################");
        Student.totalInfo();
        System.out.println("==================");
        Student s4 = new Student("Deidara", "BBA");
        System.out.println("4----------------");
        s4.individualInfo();
        System.out.println("################");
        Student.totalInfo();
    }
}
