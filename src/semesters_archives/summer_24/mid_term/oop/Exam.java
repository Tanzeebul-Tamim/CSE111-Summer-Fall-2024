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

package semesters_archives.summer_24.mid_term.oop;

public class Exam {
    private String eName;
    private double time;
    private int subCount;
    private int hasSub;
    private boolean hasEnded;
    private String[] topics;

    void createExam(String eName, double time, int subCount) {
        this.eName = eName;
        this.time = time;
        this.subCount = subCount;
        this.topics = new String[subCount];
    }

    void printInfo() {
        System.out.printf("%s Examination:\n", eName);
        System.out.print("Time left: ");

        if (hasEnded) {
            System.out.println("0.0 mins");
        } else {
            System.out.printf("%.1f mins\n", time);

            if (hasSub > 0) {
                System.out.printf("Topics chosen:\n");

                for (String topic : topics) {
                    if (topic != null) {
                        System.out.println(topic);
                    }
                }
            } else {
                System.out.println("No topics were chosen.");
            }
        }
    }

    void setTopic(String topic) {
        if (hasEnded) {
            System.out.println("The exam has already ended.");
        } else {
            if (hasSub < subCount) {
                topics[hasSub++] = topic;
            } else {
                System.out.printf("Couldn't add topic %s.\n", topic);
            }
        }
    }

    String endExam() {
        hasEnded = true;
        return "The " + eName + " examination has ended.";
    }
}
