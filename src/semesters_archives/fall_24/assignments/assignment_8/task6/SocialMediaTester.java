package semesters_archives.fall_24.assignments.assignment_8.task6;

public class SocialMediaTester {
    public static void main(String[] args) {
        Bondhus f1 = new Bondhus("Sheldon", "sheldon@qmail.com");
        Bondhus f2 = new Bondhus("Penny", "penny@qmail.com");
        Bondhus f3 = new Bondhus("Leonard", "leonard@qmail.com");
        System.out.println("1----------------------------");
        f1.showSentbox();
        System.out.println("2----------------------------");
        f2.showSentbox();
        System.out.println("3----------------------------");
        f2.sendMessage("Hi");
        f2.sendMessage("Hello");
        f2.sendMessage("NiHao");
        f3.sendMessage("Hola");
        f3.sendMessage("Sheldon, please.");
        System.out.println("4----------------------------");
        f2.showSentbox();
        System.out.println("5----------------------------");
        f1.showSentbox();
        System.out.println("6----------------------------");
        f1.sendMessage("Bazinga!");
        f2.sendMessage("Well, duh!");
        f3.showSentbox();
        System.out.println("7----------------------------");
        f2.showSentbox();
        f2.sendMessage("Bye.");
        f2.sendMessage("Oh! No");
        System.out.println("8----------------------------");
        f1.showSentbox();
        System.out.println("9----------------------------");
        System.out.println(f1);
        System.out.println("10----------------------------");
        System.out.println(f2);

    }
}
