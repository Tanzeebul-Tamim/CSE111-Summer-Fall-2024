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

package semesters_archives.fall_24.quiz.lab_quiz.quiz_5;

@SuppressWarnings("static-access")
public class LabQuiz {
    public static int x, y = 0;
    public int a, b = -20;

    public LabQuiz(int a, int b) {
        this.a -= a;
        this.b += b;
        x += AnotherClass.x;
        y += 3;
    }

    public void methodA(int a) {
        this.a = x + a;
        this.b = this.b + this.a + this.methodB();
        System.out.println(this.a + " " + this.b + " " + x);
    }

    public int methodB() {
        this.b = x - this.x - (++AnotherClass.x);
        System.out.println(a + " " + this.b + " " + AnotherClass.x);
        x = this.b - 5;
        return this.b;
    }

    public void methodB(LabQuiz quiz1) {
        quiz1.y = this.y - quiz1.b + this.b;
        this.a = (quiz1.x--) + (++AnotherClass.x);
        System.out.println(this.a + " " + quiz1.y + " " + this.x);
    }
}