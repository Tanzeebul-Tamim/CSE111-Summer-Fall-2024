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

package semesters_archives.summer_24.assignments.assignment_6.task3;

public class LightController {
    private boolean isON;
    private int brightness;

    public void showLightStatus() {
        String status = this.isON ? "ON" : "OFF";
        System.out.printf("Light status: %s\n", status);
        System.out.printf("Brightness Level: %d\n", this.brightness);
    }

    public void switchLight() {
        this.isON = !this.isON;

        if (this.isON) {
            this.brightness = this.brightness == 0 ? 1 : this.brightness;
            System.out.println("Lights are now ON.");
        } else {
            this.brightness = 0;
            System.out.println("Lights are now OFF.");
        }
    }

    public void adjustBrightness(int brightness) {
        int adjustedBrightness = this.brightness + brightness;

        if (this.isON) {
            if (1 <= adjustedBrightness && adjustedBrightness <= 10) {
                this.brightness = adjustedBrightness;
                System.out.println("Brightness adjusted.");
            } else {
                System.out.println("Brightness out of range. Set between 0 to 10.");
            }
        } else {
            System.out.println("Please turn on the light first!");
        }
    }

    public String resetSettings() {
        this.brightness = 1;
        return "Light settings have been reset.";
    }
}
