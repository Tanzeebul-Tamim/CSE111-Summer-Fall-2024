package semesters_archives.fall_24.assignments.assignment_7.graded_tasks.task8;

public class KKTea extends Tea {
    protected static int totalSales;
    private static int regularSales;

    private int weight;
    private int teaBagCount;

    public KKTea(int price, int teaBagCount) {
        this(null, price, teaBagCount);
    }

    public KKTea(String flavor, int price, int teaBagCount) {
        super(getName(flavor), price);
        this.weight = 2 * teaBagCount;
        this.teaBagCount = teaBagCount;
    }

    private static String getName(String flavor) {
        flavor = flavor == null ? "Regular" : flavor;
        return "KK " + flavor + " Tea";
    }

    @Override
    public void productDetail() {
        super.productDetail();
        System.out.println("Weight: " + this.weight + ", Tea Bags: " + this.teaBagCount);
    }

    public static void totalSales() {
        System.out.printf("Total Sales: %d\n", totalSales);
        System.out.printf("KK Regular Tea: %d\n", regularSales);

        int flavoredSales = totalSales - regularSales;

        if (flavoredSales > 0) {
            System.out.printf("KK Flavored Tea: %d\n", flavoredSales);
        }
    }

    public static void updateSoldStatusRegular(KKTea tea) {
        tea.status = true;
        totalSales++;
        regularSales++;
    }
}
