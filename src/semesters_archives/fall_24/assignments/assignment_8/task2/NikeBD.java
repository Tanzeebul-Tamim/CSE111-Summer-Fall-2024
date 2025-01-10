package semesters_archives.fall_24.assignments.assignment_8.task2;

public class NikeBD {
    private static String[] products;
    private static int branchCount;
    private static int[] totalStock;
    private static int totalSales;

    private String branchName;
    private int[] branchStock;
    private int branchSales;

    static {
        products = new String[] { "Jordan", "Cortez", "Kobe" };
        totalStock = new int[products.length];
    }

    public NikeBD(String branchName) {
        branchCount++;
        this.branchName = branchName;
        this.branchStock = new int[products.length];
    }

    public static void status() {
        System.out.println("Nike Bangladesh Status:");
        System.out.printf("Branches Opened: %d\n", branchCount);
        System.out.print("Currently Stocked: ");
        printProducts(totalStock);
        System.out.printf("Sold: %d\n", totalSales);
    }

    public void details() {
        System.out.printf("Nike %s outlet:\n", this.branchName);
        System.out.print("Products Currently Stocked: ");
        printProducts(branchStock);
        System.out.printf("Sold: %d\n", this.branchSales);
    }

    private static void printProducts(int[] stockCount) {
        for (int i = 0; i < products.length; i++) {
            String product = products[i];
            int stocked = stockCount[i];

            System.out.printf("%s: %d"
                    + (i == products.length - 1 ? "\n" : ", "),
                    product,
                    stocked);
        }
    }

    public void restockProducts(String productName, int stockCount) {
        for (int i = 0; i < products.length; i++) {
            String product = products[i];

            if (product.equals(productName)) {
                this.branchStock[i] += stockCount;
                totalStock[i] += stockCount;
                break;
            }
        }
    }

    public void restockProducts(String[] productNames, int[] stockCounts) {
        if (productNames.length == stockCounts.length) {
            for (int i = 0; i < productNames.length; i++) {
                String productName = productNames[i];
                int stockCount = stockCounts[i];
                this.restockProducts(productName, stockCount);
            }
        }
    }

    public void productSold(String product1, int stock1, String product2, int stock2) {
        boolean[] flags = { false, false };

        for (int i = 0; i < products.length; i++) {
            String product = products[i];

            if (product.equals(product1)) {
                flags[0] = true;
                this.branchStock[i] -= stock1;
                totalStock[i] -= stock1;

            } else if (product.equals(product2)) {
                flags[1] = true;
                this.branchStock[i] -= stock2;
                totalStock[i] -= stock2;
            }

            if (flags[0] && flags[1]) {
                break;
            }
        }

        this.branchSales += stock1 + stock2;
        totalSales += stock1 + stock2;
    }
}
