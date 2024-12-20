package semesters_archives.fall_24.assignments.assignment_6.ungraded_tasks.task1;

public class SultansDineTester {
    public static void main(String[] args) {
        SultansDine.details();
        System.out.println("1===================");
        SultansDine dhanmondi = new SultansDine("Dhanmondi");
        dhanmondi.sellQuantity(25);
        dhanmondi.branchInformation();
        System.out.println("2===================");
        SultansDine.details();
        System.out.println("3===================");
        SultansDine baily_road = new SultansDine("Baily Road");
        baily_road.sellQuantity(15);
        baily_road.branchInformation();
        System.out.println("4===================");
        SultansDine.details();
        System.out.println("5===================");
        SultansDine gulshan = new SultansDine("Gulshan");
        gulshan.sellQuantity(9);
        gulshan.branchInformation();
        System.out.println("6===================");
        SultansDine.details();

    }
}
