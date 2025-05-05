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

package semesters_archives.fall_24.assignments.assignment_4.ungraded_tasks.task1;

public class Parcel {
    public String name;
    public int weight;
    private double fee;

    public Parcel() {
        this(null, 0);
    }

    public Parcel(String name) {
        this(name, 0);
    }

    public Parcel(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public void printDetails() {
        if (this.name == null) {
            System.out.println("Set name first");
        } else {
            System.out.printf("Name: %s\n", this.name);
            System.out.printf("Total Weight: %d\n", this.weight);
            System.out.printf("Total Fee: %.1f\n", this.fee);
        }
    }

    public void addWeight(int weight) {
        this.weight += weight;
        System.out.printf("Updated Weight: %d\n", this.weight);
    }

    public void calcFee(String location) {
        int locationCharge = location.equals("Dhanmondi") ? 50 : 0;

        if (this.weight != 0) {
            this.fee = (this.weight * 20) + locationCharge;
        }
    }
}
