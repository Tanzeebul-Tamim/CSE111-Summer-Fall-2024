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

package semesters_archives.summer_24.assignments.assignment_4.task8;

public class Bird {
    public String name;
    private int height;

    public void flyUp(int height) {
        System.out.printf("%s has flown up %d feet.\n", name, height);

        this.height += height;
    }

    public void flyDown(int height) {
        if (height > this.height) {
            System.out.printf("%s cannot fly down %d feet.\n", name, height);
        } else {
            if (height < this.height)
                System.out.printf("%s has flown down %d feet.\n", name, height);
            else
                System.out.printf("%s has flown down %d feet and landed.\n", name, height);

            this.height -= height;
        }
    }

    public void makeNoise() {
        String noise = name != null && this.name.equals("Parrot") ? "Squawk" : "Squee";

        System.out.println(noise);
    }
}
