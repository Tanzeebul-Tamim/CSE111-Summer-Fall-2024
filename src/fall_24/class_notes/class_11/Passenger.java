package fall_24.class_notes.class_11;

// Class to represent a passenger
public class Passenger {
    // Instance variables to store passenger details
    public String name; // Name of the passenger
    public String destination; // Destination of the passenger
    public String location; // Current location of the passenger
    public Bus onBus; // Reference to the bus the passenger is currently on

    // Constructor to initialize passenger details
    public Passenger(String n, String loc, String dest) {
        this.name = n; // Set the passenger's name
        this.location = loc; // Set the passenger's current location
        this.destination = dest; // Set the passenger's destination
    }

    // Method to allow the passenger to board a bus
    public void getOnBus(Bus busObj) {
        // Check if the passenger is already on a bus
        if (this.onBus != null) {
            System.out.println(this.name + " is already on " + this.onBus.number); // Notify if already on a bus
        }
        // Check if the bus is currently at the passenger's location
        else if (this.location.equals(busObj.location)) {
            busObj.passengers[busObj.passIndex++] = this; // Add passenger to the bus
            System.out.println(this.name + " got on " + busObj.number); // Confirm boarding
            this.onBus = busObj; // Update the passenger's bus reference
        }
        // Notify if the bus has not reached the passenger's location yet
        else {
            System.out.println(this.name + ", please wait for " + busObj.number + " to arrive at " + this.location);
        }
    }
}
