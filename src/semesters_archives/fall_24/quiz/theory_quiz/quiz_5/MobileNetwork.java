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

package semesters_archives.fall_24.quiz.theory_quiz.quiz_5;

public class MobileNetwork extends Network {
    private double limit;

    public MobileNetwork(String name, double bandwidth, String signalStrength, double limit) {
        super(name, bandwidth, signalStrength);
        this.limit = limit;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + "Data Limit: " + this.limit + " GB";
    }

    public void download(double size) {
        if (size > this.limit) {
            System.out.println("File size exceeds download limit.");
        } else {
            if (this.signalStrength.equals("weak")) {
                System.out.printf("%s has %s signal strength.\nDownload stopped.\n", this.name, this.signalStrength);
            } else {
                this.limit -= size;
                double time = size * 1000 / this.bandwidth;
                System.out.printf("Downloading %.1f GB over %.1f seconds.\n", size, time);
            }
        }
    }
}
