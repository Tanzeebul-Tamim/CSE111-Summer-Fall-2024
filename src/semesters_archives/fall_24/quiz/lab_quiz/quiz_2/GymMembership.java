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

package semesters_archives.fall_24.quiz.lab_quiz.quiz_2;

public class GymMembership {
    private String name;
    private String mType;
    private String slot;
    private int duration;
    private int fee;
    private boolean isCalculated;

    public void setGymDetails(String name, String mType, String slot, int duration) {
        this.name = name;
        this.mType = mType;
        this.slot = slot;
        this.duration = duration;
        this.fee = 1000;
    }

    public double calculateFee() {
        this.isCalculated = true;

        if (this.mType.equals("Premium")) {
            this.fee += 1000;
        }

        if (this.slot.equals("Evening")) {
            this.fee += 200;
        } else if (this.slot.equals("Morning")) {
            this.fee -= 100;
        }

        return (double) this.fee;
    }

    public void printDetails() {
        System.out.printf("Gym Member Name: %s\n", this.name);
        System.out.printf("Membership Type: %s\n", this.mType);
        System.out.printf("Enrollment Time: %s\n", this.slot);
        System.out.printf("Duration: %d months\n", this.duration);

        if (this.isCalculated) {
            System.out.printf("Membership Fee:(BDT) %.1f\n", (double) this.fee);
        } else {
            System.out.println("Membership Fee has not been calculated yet.");
        }
    }
}
