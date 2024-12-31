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
