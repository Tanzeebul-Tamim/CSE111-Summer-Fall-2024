package fall_24.assignments.assignment_4.graded_tasks.task6;

public class TestTeacher {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Matin Saad Abdullah", "MSA");
        Teacher t2 = new Teacher("Mumit Khan", "MMK");
        Teacher t3 = new Teacher("Sadia Hamid Kazi", "SKZ");
        Course c1 = new Course("CSE 110");
        Course c2 = new Course("CSE 111");
        Course c3 = new Course("CSE 220");
        Course c4 = new Course("CSE 221");
        Course c5 = new Course("CSE 230");
        Course c6 = new Course("CSE 310");
        Course c7 = new Course("CSE 320");
        Course c8 = new Course("CSE 340");
        t1.addCourse(c1);
        t1.addCourse(c2);
        t2.addCourse(c3);
        t2.addCourse(c4);
        t2.addCourse(c5);
        t3.addCourse(c6);
        t3.addCourse(c7);
        t3.addCourse(c8);
        System.out.println("1========================");
        t1.printDetail();
        System.out.println("2========================");
        t2.printDetail();
        System.out.println("3========================");
        t3.printDetail();

    }
}