package semesters_archives.fall_24.assignments.assignment_6.ungraded_tasks.task1;

public class SultansDine {
    private static int grossRevenue;
    private static int branchCount;
    private static SultansDine[] branches = new SultansDine[10];

    private String branchName;
    private int revenue;

    public SultansDine(String branchName) {
        this.branchName = branchName;
        branches[branchCount++] = this;
    }

    public static void details() {
        System.out.format("Total Number of branch(s): %d\n", branchCount);
        System.out.format("Total Sell: %d Taka\n", grossRevenue);

        if (branchCount > 0) {
            for (SultansDine branch : branches) {
                if (branch != null) {
                    double percentage = (double) branch.revenue / grossRevenue * 100;

                    System.out.format("Branch Name: %s, Branch Sell: %d Taka\n", branch.branchName, branch.revenue);
                    System.out.format("Branch consists of total sell's %.2f%%\n", percentage);
                }
            }
        }
    }

    public void sellQuantity(int quantity) {
        if (quantity > 0) {
            if (quantity < 10) {
                this.revenue = quantity * 300;
            } else if (quantity < 20) {
                this.revenue = quantity * 350;
            } else {
                this.revenue = quantity * 400;
            }

            grossRevenue += this.revenue;
        } else {
            System.out.println("Invalid Input!");
        }
    }

    public void branchInformation() {
        System.out.format("Branch Name: %s\n", this.branchName);
        System.out.format("Branch Sell: %d Taka\n", this.revenue);
    }
}
