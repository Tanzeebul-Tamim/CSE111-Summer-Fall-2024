package fall_24.term_exams.mid_term.oop;

/*
    Design the Boxer class so that the following output is produced while running the BoxerTester class:

    Output:

    Tyson can fight 3 opponents.
    Name: Tyson, Weight: 100.4 KG
    No fights yet.
    1==============================
    Cannot fight more than 3 opponents
    Name: Tyson, Weight: 100.4 KG
    Fights:
    vs Johnson: Lost
    vs Wilder: Won
    vs Fury: Lost
    2==============================
    Career Stats:
    Won:Lost - 1:2
    3==============================
    Jake can fight 5 opponents.
    Cannot fight more than 5 opponents
    4==============================
    Name: Jake, Weight: 84.3 KG
    Fights:
    vs KSI: Won
    vs Logan: Lost
    vs Ben: Lost
    vs Askren: Won
    vs Fury: Lost
    5==============================
    Career Stats:
    Won:Lost - 2:3
*/

public class BoxerTester {
    public static void main(String[] args) {
        Boxer boxer1 = new Boxer();
        boxer1.updateDetails("Tyson", 100.4, 3);
        boxer1.showDetails();
        System.out.println("1==============================");
        boxer1.fight("Johnson", false);
        boxer1.fight("Wilder", true);
        boxer1.fight("Fury", false);
        boxer1.fight("Joshua", true);
        boxer1.showDetails();
        System.out.println("2==============================");
        System.out.println(boxer1.winMatchRatio());
        System.out.println("3==============================");
        Boxer boxer2 = new Boxer();
        boxer2.updateDetails("Jake", 84.3, 5);
        boxer2.fight("KSI", true);
        boxer2.fight("Logan");
        boxer2.fight("Ben", false);
        boxer2.fight("Askren", true);
        boxer2.fight("Fury");
        boxer2.fight("Tommy", true);
        System.out.println("4==============================");
        boxer2.showDetails();
        System.out.println("5==============================");
        System.out.println(boxer2.winMatchRatio());
    }
}
