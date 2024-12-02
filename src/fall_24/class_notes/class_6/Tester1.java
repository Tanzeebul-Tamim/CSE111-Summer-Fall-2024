package fall_24.class_notes.class_6;

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
        s1.setTags("Action");
        s1.setTags("Drama");
        s1.setTags("Crime");
        s1.setTags("English");
        System.out.println("----------");
        s2.setTags("History");
        String[] tags = {"Drama", "Thriller"};
        s2.setTags(tags);
        System.out.println("----------");
        s3.setTags("Action");
        s3.setTags("Horror");
        String[] tags2 = {"Crime", "Fantasy"};
        s3.setTags(tags2);
        System.out.println("----------");
        System.out.println(s1.details());
        System.out.println("----------");
        System.out.println(s2.details());
        System.out.println("----------");
        System.out.println(s3.details());
        System.out.println("----------");
    }
}
