package semesters_archives.fall_24.assignments.assignment_8.task2;

public class NikeTester {
    public static void main(String[] args) {
        System.out.println("==========1==========");
        NikeBD.status();
        NikeBD dhaka = new NikeBD("Dhaka Banani");
        NikeBD chittagong = new NikeBD("Chittagong GEC");
        System.out.println("==========2==========");
        dhaka.details();
        System.out.println("==========3==========");
        chittagong.details();
        System.out.println("==========4==========");
        dhaka.restockProducts("Jordan", 200);
        System.out.println("==========5==========");
        String[] products = { "Jordan", "Cortez", "Kobe" };
        int[] qty = { 1200, 200, 200 };
        String[] products2 = { "Jordan", "Cortez", "Kobe" };
        int[] qty2 = { 1200, 250, 100 };
        dhaka.restockProducts(products, qty);
        System.out.println("==========6==========");
        chittagong.restockProducts(products2, qty2);
        System.out.println("==========7==========");
        NikeBD.status();
        System.out.println("==========8==========");
        dhaka.details();
        System.out.println("==========9==========");
        chittagong.details();
        dhaka.productSold("Jordan", 760, "Cortez", 90);
        chittagong.productSold("Jordan", 520, "Kobe", 70);
        System.out.println("==========10==========");
        NikeBD.status();
        System.out.println("==========11==========");
        chittagong.details();
    }
}
