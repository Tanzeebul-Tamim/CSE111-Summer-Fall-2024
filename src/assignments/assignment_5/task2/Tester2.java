package assignments.assignment_5.task2;

public class Tester2 {
    public static void main(String[] args) {
        Dog scooby = new Dog();
        Dog oldie = new Dog();
        Dog goofy = new Dog();

        scooby.changeName("Scooby");
        goofy.changeName("Goofy");

        System.out.println("1. ===============");
        System.out.println(scooby.bark());
        System.out.println("2. ===============");
        System.out.println(oldie.bark());
        System.out.println("3. ===============");
        oldie.changeColor("White");
        System.out.println("4. ===============");
        System.out.println(oldie.bark());
        System.out.println("5. ===============");
        System.out.println(goofy.bark());
        System.out.println("6. ===============");
        scooby.changeColor("Brown");
        System.out.println("7. ===============");
        System.out.println(scooby.bark());
        System.out.println("8. ===============");
        goofy.changeColor("Black");
    }

}
