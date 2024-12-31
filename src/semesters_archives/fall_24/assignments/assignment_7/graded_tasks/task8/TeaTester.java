package semesters_archives.fall_24.assignments.assignment_7.graded_tasks.task8;

public class TeaTester {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        KKTea t1 = new KKTea(250, 50);
        System.out.println("--------1---------");
        t1.productDetail();
        System.out.println("--------2---------");
        KKTea.totalSales();
        System.out.println("--------3---------");
        KKTea t2 = new KKTea(470, 100);
        KKTea t3 = new KKTea(360, 75);
        KKTea.updateSoldStatusRegular(t1);
        KKTea.updateSoldStatusRegular(t2);
        System.out.println("--------4---------");
        t2.productDetail();
        System.out.println("--------5---------");
        KKTea.totalSales();
        System.out.println("--------6---------");
        KKFlavouredTea t4 = new KKFlavouredTea("Jasmine", 260, 50);
        KKFlavouredTea t5 = new KKFlavouredTea("Honey Lemon", 270, 45);
        KKFlavouredTea t6 = new KKFlavouredTea("Honey Lemon", 270, 45);
        System.out.println("--------7---------");
        t4.productDetail();
        System.out.println("--------8---------");
        t6.productDetail();
        System.out.println("--------9---------");
        KKFlavouredTea.updateSoldStatusFlavoured(t4);
        KKFlavouredTea.updateSoldStatusFlavoured(t5);
        KKFlavouredTea.updateSoldStatusFlavoured(t6);
        System.out.println("--------10---------");
        KKTea.totalSales();
    }
}
