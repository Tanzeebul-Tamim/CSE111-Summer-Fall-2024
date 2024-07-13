package assignments.assignment_5.task6;

public class Tester6 {
    public static void main(String[] args) {
        Cart c1 = new Cart();
        Cart c2 = new Cart();
        Cart c3 = new Cart();

        c1.create_cart(1);
        c2.create_cart(2);
        c3.create_cart(3);
        System.out.println("====1====");
        c1.addItem("Table", 3900.5);
        c1.addItem("Chair", 1400.76);
        c1.addItem("Television", 5400.87);
        c1.addItem("Refrigerator", 5000);

        System.out.println("====2====");
        c2.addItem("Stove", 439.90);

        System.out.println("====3====");
        c3.addItem("Chair", 1400.5);
        c3.addItem("Chair", 3400);

        System.out.println("====4====");
        c1.cartDetails();

        System.out.println("====5====");
        c2.cartDetails();

        System.out.println("====6====");
        c3.cartDetails();
        c1.giveDiscount(10);

        System.out.println("====7====");
        c1.cartDetails();
    }

}
