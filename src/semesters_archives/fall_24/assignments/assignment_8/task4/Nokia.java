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

package semesters_archives.fall_24.assignments.assignment_8.task4;

public class Nokia extends Mobile {
    private double balance;

    public Nokia(String model, boolean simCardStatus, String IMEICode, double balance) {
        super(model, IMEICode, simCardStatus);
        this.balance = balance;
    }

    @Override
    public String toString() {
        return super.toString() + "\nBalance: " + String.format("%.1f", this.balance) + " TK";
    }

    public String dialCall(String contactNo) {
        String output;

        if (this.simCardStatus) {
            if (this.balance <= 0) {
                output = "Insufficient balance! Please recharge.";
                return output;
            } else {
                String countryCode = "";

                for (int i = 0; i < 3; i++) {
                    char digit = contactNo.charAt(i);
                    countryCode += digit;
                }

                String country = this.getCountryName(countryCode);

                output = country == null
                        ? "Dialing is not allowed in this region."
                        : "Dialing the number " + contactNo + " to " + country + " region.";

                return output;
            }
        } else {
            output = "No SIM card available! Please check the SIM card connectivity.";
            return output;
        }
    }

    public void rechargeSIMCard(int amount) {
        this.balance += amount;
        System.out.printf("Recharge successful! Current balance %.1f TK.\n", this.balance);
    }
}
