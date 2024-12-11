package semesters_archives.summer_24.assignments.assignment_9.task5;

public class SmartPhoneTester {
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone();
        System.out.println("1===================");
        s1.addFeature("Display", "6.1 inch");
        System.out.println("2===================");
        s1.updateName("Samsung Note 20");
        s1.addFeature("Display", "6.1 inch");
        s1.printDetail();
        System.out.println("3===================");
        Smartphone s2 = new Smartphone("Iphone 12 Pro");
        s2.addFeature("Display", "6.2 inch");
        s2.addFeature("Ram", "6 GB");
        System.out.println("4===================");
        s2.printDetail();
        s2.addFeature("Display", "Amoled panel");
        s2.addFeature("Ram", "DDR5");
        System.out.println("5===================");
        s2.printDetail();
        System.out.println("6===================");

    }
}
