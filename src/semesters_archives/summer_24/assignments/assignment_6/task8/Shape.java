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

package semesters_archives.summer_24.assignments.assignment_6.task8;

public class Shape {
    private String name;
    private String area;

    public void setParameters(String name, int... properties) {
        this.name = name;
        double areaValue;

        if (properties.length == 1) {
            int radius = properties[0];

            areaValue = Math.PI * Math.pow(radius, 2);
            this.area = String.format("%.2f", areaValue);
        } else if (properties.length == 2) {
            int base = properties[0];
            int height = properties[1];

            areaValue = 0.5 * base * height;
            this.area = String.format("%.2f", areaValue);
        } else if (properties.length == 3) {
            int base1 = properties[0];
            int base2 = properties[1];
            int height = properties[2];

            areaValue = (base1 + base2) * height / 2;
            this.area = String.format("%.2f", areaValue);
        }

    }

    public String details() {
        String name = "Shape Name: " + this.name;
        String area = "Area: " + this.area;

        return name + "\n" + area;
    }

}
