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
