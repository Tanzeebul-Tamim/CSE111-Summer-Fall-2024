package semesters_archives.fall_24.assignments.assignment_2.ungraded_tasks.task3;

public class BurgerMaker {
    public static void main(String[] args) {
        ChickenBurger b1 = new ChickenBurger();
        System.out.println(b1.bun);
        System.out.println(b1.price);
        System.out.println(b1.sauceOption);
        System.out.println(b1.spiceLevel);
        System.out.println("----------1----------");
        System.out.println(b1.serveBurger());
        System.out.println("----------2----------");
        b1.customizeSpiceLevel("Extreme Jhaal");
        b1.customizeSpiceLevel("Spicy");
        System.out.println("----------3----------");
        System.out.println(b1.serveBurger());
        System.out.println("----------4----------");
        ChickenBurger b2 = new ChickenBurger();
        b2.bun = "Brioche";
        b2.price += 50;
        b2.sauceOption = "Regular";
        b2.customizeSpiceLevel("Naga");
        System.out.println("----------5----------");
        System.out.println(b2.serveBurger());
    }
}