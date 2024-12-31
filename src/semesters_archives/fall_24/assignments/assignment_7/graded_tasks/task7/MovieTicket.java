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
