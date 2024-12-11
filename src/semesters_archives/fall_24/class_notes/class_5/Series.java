package semesters_archives.fall_24.class_notes.class_5;

public class Series {
    // Instance variables to store the series details
    public String name;
    public int year;
    public String status;

    // Method to set the details of the series
    public void newShow(String n, int y, String s) {
        name = n; // Sets the name of the series
        year = y; // Sets the release year of the series
        status = s; // Sets the current status of the series (e.g., "Completed", "Ongoing")
    }

    // Method to return the details of the series as a formatted string
    public String details() {
        String out = "Series Name: " + name; // Concatenates the series name
        out += "\nRelease year: " + year; // Concatenates the release year
        out += "\nStatus: " + status; // Concatenates the series status
        return out; // Returns the formatted details
    }
}
