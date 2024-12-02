package fall_24.class_notes.class_6;

public class Series {
    // Instance variables to hold the series details
    public String name;         // Name of the series
    public int year;            // Release year of the series
    public String[] tags = new String[3];  // Array to hold up to 3 tags for the series
    public String status;       // Status of the series (e.g., "Completed", "Ongoing")

    // Method to initialize the series details
    public void newShow(String n, int y, String s) {
        name = n;               // Set the name of the series
        year = y;               // Set the release year of the series
        status = s;             // Set the status of the series
    }

    // Method to return the details of the series as a formatted string
    public String details() {
        String out = "Series Name: " + name;      // Start with the name of the series
        out += "\nRelease year: " + year;         // Add the release year
        out += "\nStatus: " + status;             // Add the status

        out += "\nTags: ";                        // Start the tags section
        // Loop through the tags array to append non-null tags to the string
        for (int i = 0; i < tags.length; i++) {
            if (tags[i] != null)                 // Check if the tag is not null
                out += tags[i] + ", ";           // Append the tag and a comma
        }
        return out;   // Return the final string with series details
    }

    // Method to add a single tag to the series
    public void setTags(String t) {
        boolean success = false;   // To track if the tag was successfully added
        // Loop through the tags array to find an empty slot for the new tag
        for (int i = 0; i < tags.length; i++) {
            if (tags[i] != null) {   // If the tag slot is already occupied, skip
                continue;
            } else {                    // If an empty slot is found
                tags[i] = t;           // Add the new tag
                success = !success;    // Mark the operation as successful
                break;                 // Exit the loop once the tag is added
            }
        }
        if (!success) {     // If no empty slot was found, print an error message
            System.out.println("Too many tags given.");
        } else {            // Otherwise, confirm the tag update
            System.out.println("Tags updated");
        }
    }

    // Method to add multiple tags to the series (overloaded)
    public void setTags(String[] t) {
        int idx = 0;         // Index to keep track of the position in the tags array
        // Loop through the tags array to fill it with multiple tags
        for (int i = 0; i < tags.length; i++) {
            if (tags[i] != null) {   // If the tag slot is already occupied, skip
                continue;
            } else if (idx < t.length) {    // If there are still tags left to add
                tags[i] = t[idx];          // Add the tag from the input array
                idx++;                      // Move to the next tag in the input array
            }
        }
        if (idx < t.length) {      // If there are still tags left to add after the loop
            System.out.println("Too many tags given.");  // Print an error message
        } else {                    // Otherwise, confirm the tag update
            System.out.println("Tags updated");
        }
    }
}
