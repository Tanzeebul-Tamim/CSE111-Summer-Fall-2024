package summer_24.assignments.assignment_9.task6;

public class BusTester {
    public static void main(String[] args) {
        Bus b1 = new Bus(4, "Jatrabari");
        System.out.println("1--------------");
        @SuppressWarnings("unused")
        Bus b2 = new Bus(10, "Gazipur");
        System.out.println("2--------------");
        b1.addPassenger("Fahim", "Mirpur");
        System.out.println("3--------------");
        b1.addPassenger("Anika", "Jatrabari");
        System.out.println("4--------------");
        b1.addPassenger("Ali");
        System.out.println("5--------------");
        b1.addPassenger("Zafar");
        System.out.println("6--------------");
        b1.addPassenger("Mim", "Badda");
        b1.addPassenger("Nowrin");
        System.out.println("7--------------");
        b1.addPassenger("Walid", "Jatrabari");

    }
}
