package fall_24.quiz.lab_quiz.quiz_4;

public class Garage {
    private Vehicle[] vehicles;
    private int count;

    public Garage() {
        this.vehicles = new Vehicle[3];
    }

    public void parkVehicle(Vehicle vehicle) {
        if (count < 3) {
            vehicle.index = this.count;
            this.vehicles[this.count++] = vehicle;

            System.out.printf("%s no %s has been parked!\n", vehicle.type, vehicle.number);
        } else {
            System.out.println("No more space!");
        }
    }

    public void removeVehicle(Vehicle vehicle) {
        this.vehicles[vehicle.index] = null;
        this.count--;

        System.out.printf("%s no %s has left the garage!\n", vehicle.type, vehicle.number);
    }

    public void info() {
        System.out.println("Garage Name: The Parking Spot");
        System.out.printf("Total Vehicles: %d\n", this.count);

        printVehicles("Car");
        printVehicles("Bike");
    }

    private void printVehicles(String type) {
        System.out.println(type + "s:");

        for (Vehicle vehicle : this.vehicles) {
            if (vehicle != null) {
                if (vehicle.type.equals(type)) {
                    System.out.printf("Number: %s, Brand: %s\n", vehicle.number, vehicle.brand);
                }
            }
        }
    }
}
