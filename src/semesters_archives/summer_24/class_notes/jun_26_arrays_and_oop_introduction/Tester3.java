package semesters_archives.summer_24.class_notes.jun_26_arrays_and_oop_introduction;

public class Tester3 {
    public static void main(String[] args) {
        Customer c1 = new Customer();
        c1.name = "Name-1";
        c1.age = 23;
        Customer c2 = new Customer();
        c2.name = "Name-2";
        c2.age = 24;

        System.out.println("Customer1:" + c1.name + " (" + c1.age + ")");
        System.out.println("Customer2:" + c1.name + " (" + c1.age + ")");

        Customer[] database = new Customer[5];
        for (int i = 0; i < database.length; i++) {
            database[i] = new Customer();
            database[i].name = "Name-" + (i + 1);
            database[i].age = 27 + (i);
        }
        System.out.println("Full Database:");
        for (int i = 0; i < database.length; i++)
            System.out.println(database[i]);

        c1.show();

        for (int i = 0; i < database.length; i++) {
            database[i].show();
        }
    }
}
