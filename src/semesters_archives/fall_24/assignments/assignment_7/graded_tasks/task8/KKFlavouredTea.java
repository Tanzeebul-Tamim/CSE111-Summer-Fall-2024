package semesters_archives.fall_24.assignments.assignment_7.graded_tasks.task8;

public class KKFlavouredTea extends KKTea {
    public KKFlavouredTea(String flavor, int price, int teaBagCount) {
        super(flavor, price, teaBagCount);
    }

    public static void updateSoldStatusFlavoured(KKFlavouredTea tea) {
        tea.status = true;
        totalSales++;
    }
}
