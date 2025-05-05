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

package semesters_archives.summer_24.assignments.assignment_5.task10;

public class test1 {
    public int x = 3;
    public int y = 0;
    public int z = -1;

    public void case1(int x) {
        int y = 12;
        this.x = y + 4 + x;
        y += this.y + 1;
        case2(this.y, z);
        System.out.println(x + " " + y + " " + z);
        this.y = this.x + z;
        System.out.println(this.x + " " + this.y + " " + this.z);
    }

    public void case2(int temp, int z) {
        this.x = z + temp + this.z;
        this.z = y + z;
        System.out.println(x + " " + y + " " + z);
        y = x + y + z;
        temp = x;
        x = this.z;
        this.z = temp;
        System.out.println(this.x + " " + this.y + " " + this.z);
    }
}
