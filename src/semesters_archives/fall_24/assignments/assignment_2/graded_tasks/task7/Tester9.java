package semesters_archives.fall_24.assignments.assignment_2.graded_tasks.task7;

public class Tester9 {
    public static void main(String[] args) {
        CellPhone phone1 = new CellPhone();
        phone1.printDetails();
        phone1.model = "Nokia 1100";
        System.out.println("1##################");
        phone1.storeContact("Joy - 01834");
        System.out.println("===================");
        phone1.printDetails();
        System.out.println("2##################");
        phone1.storeContact("Toya - 01334");
        phone1.storeContact("Aayan - 01135");
        System.out.println("===================");
        phone1.printDetails();
        System.out.println("3##################");
        phone1.storeContact("Sani - 01441");
        System.out.println("===================");
        phone1.printDetails();
    }
}
