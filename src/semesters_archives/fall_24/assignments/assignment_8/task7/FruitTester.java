package semesters_archives.fall_24.assignments.assignment_8.task7;

public class FruitTester {
    public static void testFruit(Fruit f) {
        System.out.println("----Printing Detail-----");
        if (f.hasFormalin()) {
            System.out.println("Do not eat the " + f.getName() + ".");
            System.out.println(f);
        } else {
            System.out.println("Eat the " + f.getName() + ".");
            System.out.println(f);
        }
    }

    public static void main(String[] args) {
        Mango m = new Mango();
        testFruit(m);
        Jackfruit j = new Jackfruit();
        testFruit(j);
    }

}
