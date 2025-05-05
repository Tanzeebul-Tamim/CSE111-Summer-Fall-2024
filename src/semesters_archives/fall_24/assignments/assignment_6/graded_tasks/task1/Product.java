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

package semesters_archives.fall_24.assignments.assignment_6.graded_tasks.task1;

public class Product {
    private String name;
    private int quantity;
    private double price;

    protected Product() {
        this("Unknown", 0);
    }

    protected Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    protected void displayInfo() {
        this.displayInfo(false);
    }

    protected void displayInfo(boolean display) {
        String name;
        double price;
        int quantity;

        if (display) {
            name = this.name;
            price = this.price;
            quantity = this.quantity;
        } else {
            name = "Unknown";
            price = 0;
            quantity = 0;
        }

        System.out.format("Product Name: %s\n", name);
        System.out.format("Price: $%.1f", price);

        if (display) {
            System.out.println();
        }

        if (this.quantity != 0) {
            System.out.format("Quantity: %d\n", quantity);
        }
    }

    protected String getName() {
        return this.name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    protected int getQuantity() {
        return this.quantity;
    }

    protected void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    protected double getPrice() {
        return this.price;
    }

    protected void setPrice(double price) {
        this.price = price;
    }
}
