package semesters_archives.fall_24.class_notes.class_7.oop.task5;

public class test2 {
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone();
        s1.printDetail();
        s1.features = new String[5];
        System.out.println("==========================");
        s1.addFeature("Display", "6.1 inch");
        System.out.println("==========================");
        s1.setModel("Samsung Note 20");
        s1.addFeature("Display", "6.1 inch");
        s1.printDetail();
        System.out.println("==========================");
        Smartphone s2 = new Smartphone();
        s2.printDetail();
        s2.features = new String[5];
        s2.setModel("Iphone 12 Pro");
        s2.addFeature("Display", "6.2 inch");
        s2.addFeature("Ram", "6 GB");
        System.out.println("==========================");
        s2.printDetail();
        s2.addFeature("Display", "Amoled panel");
        s2.addFeature("AirDrop");
        System.out.println("==========================");
        s2.printDetail();
        System.out.println("==========================");
    }
}