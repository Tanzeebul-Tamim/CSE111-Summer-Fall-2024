package semesters_archives.fall_24.assignments.assignment_3.graded_tasks.task4;

public class Tester {
    public static void main(String[] args) {
        Library a1 = new Library();
        a1.setBookCapacity(3);
        System.out.println("1-------------");
        a1.addBook("Ice");
        System.out.println("2-------------");
        a1.printDetail();
        System.out.println("3-------------");
        a1.addBook("Emma");
        a1.addBook("Wings");
        a1.addBook("Next");
        System.out.println("4-------------");
        a1.printDetail();
        Library a2 = new Library();
        a2.setBookCapacity(4);
        System.out.println("5-------------");
        a2.addBook("Onnobhubon");
        a2.addBook("Ami");
        System.out.println("6-------------");
        a2.printDetail();
        System.out.println("7-------------");
        a2.addBook("Deyal");
        a2.addBook("Himu");
        a2.addBook("Megher Upor Bari");
        System.out.println("8-------------");
        a2.printDetail();
    }
}
