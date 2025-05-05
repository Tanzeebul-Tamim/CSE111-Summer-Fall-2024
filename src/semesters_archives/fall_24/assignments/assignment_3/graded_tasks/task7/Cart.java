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

package semesters_archives.fall_24.assignments.assignment_3.graded_tasks.task7;

public class Cart {
    private int cartNo;
    private int itemCount;
    private Item[] items;
    private String[] itemNames;
    private double[] itemPrices;
    private double discount;
    boolean hasDiscount;

    public Cart() {
        this.items = new Item[3];
        this.itemNames = new String[3];
        this.itemPrices = new double[3];
    }

    private class Item {
        private String itemName;
        private double itemPrice;
        private double discountPrice;

        private Item(String itemName, double itemPrice) {
            this.itemName = itemName;
            this.itemPrice = itemPrice;
        }
    }

    public void create_cart(int cartNo) {
        this.cartNo = cartNo;
    }

    public void addItem(String itemName, double itemPrice) {
        if (itemCount < 3) {
            Item item = new Item(itemName, itemPrice);

            items[itemCount] = item;
            itemNames[itemCount] = item.itemName;
            itemPrices[itemCount++] = item.itemPrice;

            System.out.printf("%s added to cart %d.\n", itemName, this.cartNo);
            System.out.printf("You have %d item(s) in your cart now.\n", this.itemCount);
        } else {
            System.out.printf("You already have %d items in your cart.\n", this.itemCount);
        }
    }

    public void addItem(double itemPrice, String itemName) {
        addItem(itemName, itemPrice);
    }

    public void giveDiscount(int discountPercentage) {
        for (Item item : items) {
            if (item != null) {
                item.discountPrice = item.itemPrice - item.itemPrice * discountPercentage / 100;
            }
        }

        this.hasDiscount = true;
        this.discount = discountPercentage;
    }

    public void cartDetails() {
        System.out.printf("Your cart (c%d) :\n", this.cartNo);
        double total = 0;

        for (Item item : items) {
            if (item != null) {
                System.out.printf("%s - %.2f\n", item.itemName, item.itemPrice);
                total = this.hasDiscount ? total + item.discountPrice : total + item.itemPrice;
            }
        }

        System.out.printf("Discount Applied: %.1f%%\n", this.discount);
        System.out.printf("Total price: %.2f\n", total);
    }

}
