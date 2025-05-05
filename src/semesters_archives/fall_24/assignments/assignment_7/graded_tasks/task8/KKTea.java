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
