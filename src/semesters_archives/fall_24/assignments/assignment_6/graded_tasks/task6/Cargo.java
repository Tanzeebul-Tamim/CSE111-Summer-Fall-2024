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

package semesters_archives.fall_24.assignments.assignment_6.graded_tasks.task6;

public class Cargo {
    protected static int count;
    private static double capacity;

    static {
        Cargo.capacity = 10;
    }

    private String content;
    private double weight;
    private int cargoId;
    private boolean isLoaded;

    protected Cargo(String content, double weight) {
        this.content = content;
        this.weight = weight;
        this.cargoId = ++count;
    }

    protected static String capacity() {
        String formattedCapacity = String.format("%.1f", capacity);
        return formattedCapacity;
    }

    protected void details() {
        System.out.printf("Cargo ID: %d, Contents: %s, Weight: %.1f, Loaded: %b\n", this.cargoId, this.content,
                this.weight, this.isLoaded);
    }

    protected void load() {
        if (capacity > this.weight) {
            this.isLoaded = true;
            capacity -= this.weight;

            System.out.printf("Cargo %d loaded for transport.\n", this.cargoId);
        } else {
            System.out.println("Cannot load cargo, exceeds weight capacity.");
        }
    }

    protected void unload() {
        this.isLoaded = false;
        capacity += this.weight;

        System.out.printf("Cargo %d unloaded.\n", this.cargoId);
    }
}
