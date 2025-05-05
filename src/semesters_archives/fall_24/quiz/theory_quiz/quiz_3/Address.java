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

package semesters_archives.fall_24.quiz.theory_quiz.quiz_3;

public class Address {
    private String area;
    private String city;
    private int zip;

    public Address(String area, String city, int zip) {
        this.area = area;
        this.city = city;
        this.zip = zip;
    }

    public void showAddress() {
        System.out.printf("%s, %s-%d\n", this.area, this.city, this.zip);
    }

    public void setAddress(String area, String city, int zip) {
        if (city == null) {
            if (this.zip == zip) {
                System.out.println("Updated Area.");
                this.area = area;
            } else {
                System.out.println("Updating zipcode requires a city name.");
            }
        } else {
            this.area = area;
            this.city = city;
            this.zip = zip;
        }
    }

    public void setAddress(String area, int zip) {
        this.setAddress(area, null, zip);
    }

    public String getCity() {
        return this.city;
    }
}
