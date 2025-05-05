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

package semesters_archives.fall_24.assignments.assignment_4.graded_tasks.task10;

public class msgClass {
    public int content;
}

class FinalT5A {
    public int sum = 2, y = 1, x = 1;

    public void methodA() {
        int x = 6, y = 0;
        msgClass myMsg = new msgClass();
        myMsg.content = this.x;
        x = x + myMsg.content;
        this.y = this.y + methodB(myMsg, myMsg.content);
        System.out.println(x + " " + this.y + " " + sum);
        y = this.y / 2 + this.x;
        x = y + sum / 2;
        sum = x + y + myMsg.content;
        System.out.println(x + " " + y + " " + sum);
    }

    public int methodB(msgClass mg2, int mg1) {
        int x = 0;
        y = y + mg2.content;
        mg2.content = y + mg1;
        x = this.x + 3 + mg1;
        sum = sum + x + y;
        System.out.println(this.x + " " + this.y + " " + sum);
        mg2.content = sum - mg1;
        return sum;
    }
}
