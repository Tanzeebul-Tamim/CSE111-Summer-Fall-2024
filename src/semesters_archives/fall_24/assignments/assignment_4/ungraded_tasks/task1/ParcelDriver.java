package semesters_archives.fall_24.assignments.assignment_4.ungraded_tasks.task1;

public class ParcelDriver {
    public static void main(String[] args) {
        Parcel p1 = new Parcel();
        p1.printDetails();
        p1.name = "Spongebob";
        p1.printDetails();
        System.out.println("1**************");
        Parcel p2 = new Parcel("Bob the Builder");
        p2.weight = 15;
        p2.calcFee("Gulshan");
        p2.printDetails();
        System.out.println("2**************");
        p2.addWeight(25);
        p2.calcFee("Banani");
        p2.printDetails();
        System.out.println("3**************");
        Parcel p3 = new Parcel("Dora the Explorer", 10);
        p3.addWeight(15);
        p3.calcFee("Dhanmondi");
        p3.printDetails();
    }
}
