package summer_24.assignments.assignment_4.task7;

public class Test7 {
    public static void main(String[] args) {
        Cat c1 = new Cat();
        System.out.println("===================");
        c1.printCat();
        c1.color = "Black";
        System.out.println("===================");
        c1.printCat();
        c1.color = "Brown";
        c1.action = "jumping";
        System.out.println("===================");
        c1.printCat();
    }
}
