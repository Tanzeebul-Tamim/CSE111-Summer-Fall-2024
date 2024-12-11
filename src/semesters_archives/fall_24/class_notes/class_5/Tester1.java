package semesters_archives.fall_24.class_notes.class_5;

public class Tester1 {
    public static void main(String[] args) {
        Series s1 = new Series();
        s1.newShow("name1", 2025, "Coming soon");
        Series s2 = new Series();
        s2.newShow("name2", 2010, "Completed");
        Series s3 = new Series();
        s3.newShow("name3", 2013, "Ongoing");
        System.out.println("----------");
        System.out.println(s1.details());
        System.out.println("----------");
        System.out.println(s2.details());
        System.out.println("----------");
        System.out.println(s3.details());
        System.out.println("----------");
    }
}
