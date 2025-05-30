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

package semesters_archives.fall_24.assignments.assignment_3.ungraded_tasks.task4;

public class Customer {
    private String name;
    private int total;
    private int itemCount;
    private String[] items;
    private int[] prices;
    private boolean fourParams;

    public Customer() {
        this.items = new String[4];
        this.prices = new int[4];
    }

    public void createCustomer(String name) {
        this.name = name;
    }

    public void showCart() {
        System.out.printf("Customer: %s\n", this.name);

        if (itemCount != 0) {
            for (int i = 0; i < itemCount; i++) {
                String item = items[i];
                int price = prices[i];

                if (item != null && price != 0) {
                    System.out.printf("Item: %s Price: %d\n", item, price);
                }
            }
        }
    }

    public void addItem(String item, int price) {
        if (this.itemCount >= 4) {
            System.out.println("Cart is full");
        } else {
            this.items[this.itemCount] = item;
            this.prices[this.itemCount++] = price;
            this.total += price;

            if (!this.fourParams) {
                System.out.printf("%s added to cart\n", item);
            }
        }
    }

    public void addItem(String item1, int price1, String item2, int price2) {
        this.fourParams = true;

        addItem(item1, price1);
        addItem(item2, price2);

        if (this.fourParams) {
            System.out.printf("%s and %s added to cart\n", item1, item2);
        }

        this.fourParams = false;
    }

    public void calculatePrice() {
        System.out.printf("Total: %d\n", this.total);
    }
}
