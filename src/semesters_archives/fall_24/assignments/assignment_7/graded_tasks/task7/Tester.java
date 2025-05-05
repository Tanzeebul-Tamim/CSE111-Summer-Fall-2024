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

public class Tester {
    public static void main(String[] args) {
        CinemexTicket ticket1 = new CinemexTicket("Deadpool and Wolverine", "18:30", "Action-Comedy", "July 24, 2024");
        System.out.println("Total movie ticket(s): " + CinemexTicket.getTotalTickets());
        System.out.println("1============================");
        ticket1.calculateTicketPrice();
        System.out.println("2============================");
        System.out.println(ticket1);
        System.out.println("3============================");
        System.out.println(ticket1.confirmPayment());
        System.out.println("4============================");
        System.out.println(ticket1);
        System.out.println("5============================");
        CinemexTicket ticket2 = new CinemexTicket("Twisters", "10:00", "Sci-Fi", "August 10, 2024", "Premium");
        System.out.println("Total movie ticket(s): " +
                CinemexTicket.getTotalTickets());
        System.out.println("6============================");
        ticket2.calculateTicketPrice();
        System.out.println("7============================");
        System.out.println(ticket2.confirmPayment());
        System.out.println("8============================");
        System.out.println(ticket2);
        System.out.println("9============================");
        System.out.println(ticket2.confirmPayment());
    }
}
