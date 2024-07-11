package assignments.assignment_5.task4;

public class Tester4 {
    public static void main(String[] args) {
        MoneyTracker tr1 = new MoneyTracker();
        System.out.println(tr1.info());
        tr1.createTracker("John");
        System.out.println("1 ==========");
        System.out.println(tr1.info());
        System.out.println("2 ==========");
        tr1.income(1000);
        System.out.println(tr1.info());
        System.out.println("3 ==========");
        tr1.expense(800);
        tr1.expense(100);
        System.out.println(tr1.info());
        System.out.println("4 ==========");
        tr1.showHistory();
        System.out.println("5 ==========");
        tr1.expense(101);
        System.out.println("6 ==========");
        tr1.expense(200);
        System.out.println("7 ==========");
        tr1.income(200);
        tr1.showHistory();
        System.out.println("8 ==========");
    }

}
