/*
 * Copyright (c) 2024 Tanzeebul Tamim
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of
 * this software and associated documentation files (the "Software"), to deal in
 * the Software without restriction, including without limitation the rights to
 * use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of
 * the Software, and to permit persons to whom the Software is furnished to do so,
 * subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS
 * FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR
 * COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER
 * IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN
 * CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package semesters_archives.fall_24.assignments.assignment_6.ungraded_tasks.task1;

public class SultansDine {
    private static int grossRevenue;
    private static int branchCount;
    private static SultansDine[] branches;

    static {
        SultansDine.branches = new SultansDine[10];
    }

    private String branchName;
    private int revenue;

    protected SultansDine(String branchName) {
        this.branchName = branchName;
        branches[branchCount++] = this;
    }

    protected static void details() {
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

    protected void sellQuantity(int quantity) {
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

    protected void branchInformation() {
        System.out.format("Branch Name: %s\n", this.branchName);
        System.out.format("Branch Sell: %d Taka\n", this.revenue);
    }
}
