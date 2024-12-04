package fall_24.quiz.lab_quiz.quiz_3;

public class CarRental {
    private String name;
    private String location;
    private String[] carTypes;
    private int[] availability;

    public CarRental() {
        this.name = "Not Set";
        this.location = "Default";
        this.carTypes = new String[] { "SUV", "Sedan", "Hatchback", "Electric", "Hybrid" };
        this.availability = new int[] { 15, 20, 10, 12, 16 };
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void showDetails() {
        System.out.printf("Car Rental Name: %s\n", this.name);
        System.out.printf("Location: %s\n", this.location);

        for (int i = 0; i < this.carTypes.length; i++) {
            String carType = this.carTypes[i];
            int count = this.availability[i];

            System.out.printf("Available number of %s cars: %d\n", carType, count);
        }
    }

    public void rentCar(int count, String carType) {
        boolean found = false;
        int idx = -1;

        for (int i = 0; i < this.carTypes.length; i++) {
            String type = this.carTypes[i];

            if (type.equals(carType)) {
                found = true;
                idx = i;
                break;
            }
        }

        if (found) {
            if (count > this.availability[idx]) {
                System.out.printf("%d %s cars is not available.\n", count, carType);
            } else {
                System.out.printf("%d %s cars rented successfully.\n", count, carType);
                this.availability[idx] -= count;
            }
        } else {
            System.out.printf("We don't have any %s cars for rent.\n", carType);
        }
    }

    public void rentCar(String carType) {
        this.rentCar(5, carType);
    }
}
