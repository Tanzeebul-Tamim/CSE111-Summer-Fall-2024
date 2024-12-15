package semesters_archives.fall_24.assignments.assignment_4.graded_tasks.task7;

public class BracuBus {
    private String route;
    private int capacity;
    private int count;
    private BracuStudent[] passengers;

    public BracuBus(String route, int capacity) {
        this.route = route;
        this.capacity = capacity;
        this.passengers = new BracuStudent[this.capacity];
    }

    public BracuBus(String route) {
        this(route, 2);
    }

    public void showDetails() {
        System.out.printf("Bus Route: %s\n", this.route);
        System.out.printf("Passenger Count: %d (Max: %d)\n", this.count, this.capacity);
        System.out.println("Passengers on Board:");

        for (BracuStudent passenger : this.passengers) {
            if (passenger != null) {
                System.out.print(passenger.name + " ");
            }
        }
    }

    public void board(BracuStudent passenger) {
        if (this.capacity > this.count) {
            if (passenger == null) {
                System.out.println("No passengers");
            } else {
                if (passenger.hasPass) {
                    if (passenger.residence.equals(this.route)) {
                        System.out.printf("%s boarded the bus.\n", passenger.name);

                        this.passengers[this.count++] = passenger;
                    } else {
                        System.out.println("You got on the wrong bus!");
                    }
                } else {
                    System.out.println("You don't have a bus pass!");
                }
            }
        } else {
            System.out.println("Bus is full!");
        }
    }

    public void board() {
        BracuStudent passenger = null;
        this.board(passenger);
    }

    public void board(BracuStudent... passengers) {
        for (BracuStudent passenger : passengers) {
            this.board(passenger);
        }
    }
}
