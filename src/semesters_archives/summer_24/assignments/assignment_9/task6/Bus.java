package semesters_archives.summer_24.assignments.assignment_9.task6;

public class Bus {
    private int capacity;
    private String destination;
    private int count;

    public Bus(int capacity, String destination) {
        this.capacity = capacity;
        this.destination = destination;

        System.out.printf("Capacity: %d\n", this.capacity);
        System.out.printf("Destination: %s\n", this.destination);
    }

    public void addPassenger(String passenger, String destination) {
        if (this.destination.equals(destination)) {
            if (this.count < this.capacity) {
                count++;
                System.out.printf("%s is added to the bus.\n", passenger);
            } else {
                System.out.println("Bus is full.");
            }
        } else {
            System.out.printf("Sorry %s! The bus won't stop at %s\n", passenger, destination);
            System.out.println("Use another bus.");
        }
    }

    public void addPassenger(String passenger) {
        count++;
        System.out.printf("%s is added to the bus.\n", passenger);
        System.out.printf("%s will get off at the last stop\n", passenger);
    }
}
