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

public class CinemexTicket extends MovieTicket {
    private static int ticketCount;

    private String genre;
    private String id;
    private boolean paid;

    public CinemexTicket(String movie, String showTime, String genre, String date) {
        this(movie, showTime, genre, date, seatTypes[0]);
    }

    public CinemexTicket(String movie, String showtime, String genre, String date, String seat) {
        super(movie, date, showtime, getSeatPrice(seat));
        ticketCount++;

        this.seat = seat;
        this.genre = genre;
        this.id = generateID();
    }

    private static double getSeatPrice(String seat) {
        double seatPrice = -1;

        for (int i = 0; i < seatTypes.length; i++) {
            String seatType = seatTypes[i];
            seatPrice = seatPrices[i];

            if (seat.equals(seatType)) {
                break;
            }
        }

        return seatPrice;
    }

    public static int getTotalTickets() {
        return ticketCount;
    }

    public void calculateTicketPrice() {
        try {
            int showtime = Integer.parseInt(this.showtime.split(":")[0]);

            if (18 <= showtime && showtime <= 23) {
                double price = this.getPrice();
                price += price * 15 / 100;
                this.setPrice(price);
            }

            System.out.println("Ticket price is calculated successfully.");
        } catch (NumberFormatException err) {
            System.out.println("Invalid Time!");
        }
    }

    public String confirmPayment() {
        String output = this.paid ? "Ticket price is already paid!" : "Payment Successful.";
        this.paid = true;
        return output;
    }

    private String generateID() {
        String movie = this.getMovie();
        char seatInitial = this.seat.charAt(0);
        return movie + "-" + seatInitial + "-" + ticketCount;
    }

    @Override
    public String toString() {
        String ticketID = "Ticket ID: " + this.id + "\n";
        String genre = "\nGenre: " + this.genre;
        String seatType = "\nSeat Type: " + this.seat;
        String price = "\nPrice(tk): " + String.format("%.1f", this.getPrice());
        String status = "\nStatus: " + (this.paid ? "Paid" : "Not Paid");

        return ticketID + super.toString() + genre + seatType + price + status;
    }
}
