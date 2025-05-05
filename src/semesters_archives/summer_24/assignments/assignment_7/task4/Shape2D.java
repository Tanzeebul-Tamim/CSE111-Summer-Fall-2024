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

package semesters_archives.summer_24.assignments.assignment_7.task4;

public class Shape2D {
    private String shape;
    private int[] lengths;

    public Shape2D(int length) {
        this.shape = "Square";
        this.lengths = new int[1];

        this.lengths[0] = length;

        System.out.printf("A %s has been created with length: %d\n", this.shape, length);
    }

    public Shape2D(int length, int breadth) {
        this.shape = "Rectangle";
        this.lengths = new int[2];

        this.lengths[0] = length;
        this.lengths[1] = breadth;

        System.out.printf("A %s has been created with length: %d and breadth: %d\n", this.shape, length, breadth);
    }

    public Shape2D(int height, int base, String shape) {
        this.shape = shape;
        this.lengths = new int[2];

        this.lengths[0] = height;
        this.lengths[1] = base;

        System.out.printf("A %s has been created with height: %d and base: %d\n", this.shape, height, base);
    }

    public Shape2D(int side1, int side2, int side3) {
        this.shape = "Triangle";
        this.lengths = new int[3];

        this.lengths[0] = side1;
        this.lengths[1] = side2;
        this.lengths[2] = side3;

        System.out.printf("A triangle has been created with the following sides: %d, %d, %d\n", side1, side2, side3);
    }

    public void area() {
        double area;

        if (this.shape.equals("Square")) {
            int side = this.lengths[0];
            area = Math.pow(side, 2);
        } else if (this.shape.equals("Rectangle")) {
            int side1 = this.lengths[0];
            int side2 = this.lengths[1];
            area = side1 * side2;
        } else {
            if (this.lengths.length == 2) {
                int height = this.lengths[0];
                int base = this.lengths[1];
                area = 0.5 * height * base;
            } else {
                int a = this.lengths[0];
                int b = this.lengths[1];
                int c = this.lengths[2];

                double s = (a + b + c) / 2;
                area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
            }
        }

        System.out.printf("The area of the %s is: %.2f\n", this.shape, area);
    }
}
