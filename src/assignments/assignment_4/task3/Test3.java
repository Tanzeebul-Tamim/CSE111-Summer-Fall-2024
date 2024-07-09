package assignments.assignment_4.task3;

public class Test3 {
    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println("Name of the Student: " + s1.name);
        System.out.println("ID of the Student: " + s1.id);
        s1.id = 123;
        System.out.println("ID of the Student: " + s1.id);
    }
}