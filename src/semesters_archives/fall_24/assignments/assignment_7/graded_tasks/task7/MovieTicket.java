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

package semesters_archives.fall_24.assignments.assignment_7.graded_tasks.task7;

public class MovieTicket {
    public static String[] seatTypes = { "Regular", "Premium",
            "IMAX 3D" };
    public static double[] seatPrices = { 300.0, 450.0, 600.0 };
    public static int nightShowCharge = 15;
    
    private String movie;
    public String showtime;
    public String date;
    private double price;
    public String seat;

    public MovieTicket(String movie, String date, String showtime,
            double price) {
        this.movie = movie;
        this.showtime = showtime;
        this.date = date;
        this.price = price;
        this.seat = "Not Selected";
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String getMovie() {
        return movie;
    }

    public String toString() {
        return "Movie: " + movie + "\nShowtime: " + showtime +
                "\nDate: " + date;
    }
}
