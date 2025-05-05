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

package semesters_archives.fall_24.class_notes.class_12.food_order;

// Class to test the Order class
public class Tester0002 {
    public static void main(String[] args) {
        Order o1 = new Order("Burger"); // Create a new order for a burger
        System.out.println(o1.orderNo + " " + o1.item); // Display order number and item name

        Order o2 = new Order("Pizza"); // Create a new order for a pizza
        System.out.println(o2.orderNo + " " + o2.item); // Display order number and item name

        Order o3 = new Order("Pasta"); // Create a new order for pasta
        System.out.println(o3.orderNo + " " + o3.item); // Display order number and item name

        System.out.println("---- ----"); // Separator for clarity in output
        System.out.println(o1.orderNo + " " + o1.item); // Re-display order details for the first order
    }
}
