package semesters_archives.summer_24.assignments.assignment_8.task5;

public class CargoTester {
    public static void main(String[] args) {
        System.out.println("Cargo Capacity: " + Cargo.capacity());
        System.out.println("1====================");
        Cargo a = new Cargo("Industrial Machinery", 4.5);
        a.details();
        System.out.println("2====================");
        a.load();
        System.out.println("3====================");
        Cargo b = new Cargo("Steel Ingot", 2.7);
        b.details();
        System.out.println("4====================");
        System.out.println("Cargo Capacity: " + Cargo.capacity());
        System.out.println("5====================");
        b.load();
        System.out.println("Cargo Capacity: " + Cargo.capacity());
        System.out.println("6====================");
        Cargo c = new Cargo("Tree Trunks", 3.6);
        c.load();
        System.out.println("7====================");
        c.details();
        b.details();
        System.out.println("8====================");
        Cargo d = new Cargo("Processed Goods", 1.8);
        d.load();
        System.out.println("Cargo Capacity: " + Cargo.capacity());
        System.out.println("9====================");
        b.unload();
        System.out.println("Cargo Capacity: " + Cargo.capacity());
        System.out.println("10====================");
        c.load();
        System.out.println("11====================");
        b.details();
        System.out.println("Cargo Capacity: " + Cargo.capacity());
    }
}
