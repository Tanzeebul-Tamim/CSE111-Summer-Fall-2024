package semesters_archives.fall_24.class_notes.class_11;

// Class to represent a bus
public class Bus {
    // Instance variables to store bus details
    public String location; // Current location of the bus
    public Passenger[] passengers; // Array to hold passengers on the bus
    public int passIndex; // Index to track the number of passengers
    public String number; // Bus number or identifier

    // Constructor to initialize bus details
    public Bus(String busNo, String place) {
        this.number = busNo; // Set the bus number
        this.location = place; // Set the initial location of the bus
        this.passIndex = 0; // Initialize the passenger index
        this.passengers = new Passenger[5]; // Initialize the passenger array with a capacity of 5
    }

    // Method to update the bus location and handle passenger destinations
    public void reachPlace(String d) {
        this.location = d; // Update the current location of the bus
        Passenger[] newPassengers = new Passenger[this.passengers.length]; // Temporary array for remaining passengers
        int newIndex = 0; // Index for the new passenger array

        // Loop through current passengers to process arrivals
        for (int i = 0; i < passIndex; i++) {
            // Check if the passenger's destination matches the bus location
            if (this.passengers[i].destination.equals(d)) {
                System.out.println(this.passengers[i].name + " has arrived at " + d + "."); // Notify arrival
                this.passengers[i].onBus = null; // Remove bus reference from passenger
                this.passengers[i].location = d; // Update passenger location
            } else {
                newPassengers[newIndex++] = this.passengers[i]; // Keep the passenger on the bus
            }
        }

        // Update the passenger list with remaining passengers
        this.passengers = newPassengers;
    }
}
