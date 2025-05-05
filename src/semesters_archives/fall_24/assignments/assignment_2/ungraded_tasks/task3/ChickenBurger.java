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

package semesters_archives.fall_24.assignments.assignment_2.ungraded_tasks.task3;

public class ChickenBurger {
    public String bun;
    public int price;
    public String sauceOption;
    public String spiceLevel;
    private String[] spiceLevels = { "Mild", "Spicy", "Naga", "Extreme" };

    public ChickenBurger() {
        this.bun = "Sesame";
        this.price = 200;
        this.sauceOption = "Less";
        this.spiceLevel = "Not Set";
    }

    public String serveBurger() {
        String output;

        if (this.spiceLevel.equals("Not Set")) {
            output = "Cannot serve now. Customize Spice Level first.";
        } else {
            output = "The burger is being served:-\nBun Type: " + this.bun + "\nPrice: " + this.price
                    + "\nSauce Option: " + this.sauceOption + "\nSpice Level: " + this.spiceLevel;
        }

        return output;
    }

    public void customizeSpiceLevel(String spiceLevel) {
        boolean isLevelValid = false;

        for (String spiceLvl : this.spiceLevels) {
            if (spiceLevel.equals(spiceLvl)) {
                isLevelValid = true;
                break;
            }
        }

        if (isLevelValid) {
            this.spiceLevel = spiceLevel;
            System.out.printf("Spice level set to %s.\n", spiceLevel);
        } else {
            System.out.println("This spice level is unavailable.");
        }
    }
}
