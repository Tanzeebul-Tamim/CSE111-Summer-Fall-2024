package semesters_archives.fall_24.assignments.assignment_4.graded_tasks.task7;

public class BracuStudentTester {
    public static void main(String[] args) {
        BracuStudent st1 = new BracuStudent("Afif", "Mirpur");
        System.out.println("1===============");
        BracuStudent st2 = new BracuStudent("Shanto", "Motijheel");
        BracuStudent st3 = new BracuStudent("Taskin", "Mirpur");
        st1.showDetails();
        st2.showDetails();
        System.out.println("2===============");
        st3.showDetails();
        System.out.println("3===============");
        BracuBus bus1 = new BracuBus("Mirpur");
        BracuBus bus2 = new BracuBus("Azimpur", 5);
        bus1.showDetails();
        bus2.showDetails();
        System.out.println("4===============");
        st2.getPass();
        st3.getPass();
        System.out.println("5===============");
        st2.showDetails();
        st3.showDetails();
        System.out.println("6===============");
        bus1.board();
        System.out.println("7===============");
        bus1.board(st1, st2);
        System.out.println("8===============");
        st1.getPass();
        st2.updateHome("Mirpur");
        st1.showDetails();
        st2.showDetails();
        System.out.println("9===============");
        bus1.board(st1);
        bus1.board(st2, st3);
        System.out.println("10===============");
        bus1.showDetails();

    }
}