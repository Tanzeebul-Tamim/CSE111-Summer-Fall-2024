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

package semesters_archives.fall_24.class_notes.class_7.oop.task5;

public class Smartphone {
    private String model;
    private int featureCount;
    public String[] features;

    public void setModel(String model) {
        this.model = model;
    }

    public void addFeature(String featureName) {
        addFeature(featureName, "");
    }

    public void addFeature(String featureName, String featureValue) {
        if (this.model == null) {
            System.out.println("Feature cannot be added without model name");
        } else {
            int featureCapacity = this.features.length;

            if (featureCapacity > featureCount) {
                String featureWithValue = featureName + ": " + featureValue;
                String featureString = featureValue == "" ? featureName : featureWithValue;

                features[featureCount] = featureString;
                featureCount++;
            } else {
                System.out.println("Cannot add more features. Capacity reached!");
            }
        }
    }

    public void printDetail() {
        System.out.printf("Phone Model: %s\n", this.model);

        if (this.features != null) {
            for (String feature : features) {
                if (feature != null) {
                    System.out.println("- " + feature);
                }
            }
        }
    }
}
