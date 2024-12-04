package fall_24.quiz.lab_quiz.quiz_3;

/*
    Design the CarRental class so that the following output is produced while running the CarRentalTester class:

    Output:

    Car Rental Name: Not Set
    Location: Default
    Available number of SUV cars: 15
    Available number of Sedan cars: 20
    Available number of Hatchback cars: 10
    Available number of Electric cars: 12
    Available number of Hybrid cars: 16
    1==============================
    Car Rental Name: Premium Rentals
    Location: Dhaka
    Available number of SUV cars: 15
    Available number of Sedan cars: 20
    Available number of Hatchback cars: 10
    Available number of Electric cars: 12
    Available number of Hybrid cars: 16
    2==============================
    5 Electric cars rented successfully.
    3==============================
    Car Rental Name: Premium Rentals
    Location: Dhaka
    Available number of SUV cars: 15
    Available number of Sedan cars: 20
    Available number of Hatchback cars: 10
    Available number of Electric cars: 7
    Available number of Hybrid cars: 16
    4==============================
    18 Hybrid cars is not available.
    5==============================
    We don't have any Sports cars for rent.
    6==============================
    5 Hatchback cars rented successfully.
    7==============================
    Car Rental Name: Premium Rentals
    Location: Dhaka
    Available number of SUV cars: 15
    Available number of Sedan cars: 20
    Available number of Hatchback cars: 5
    Available number of Electric cars: 7
    Available number of Hybrid cars: 16
    7==============================
    Car Rental Name: Budget Rentals
    Location: Chittagong
    Available number of SUV cars: 15
    Available number of Sedan cars: 20
    Available number of Hatchback cars: 10
    Available number of Electric cars: 12
    Available number of Hybrid cars: 16
*/

public class CarRentalTester {
    public static void main(String[] args) {
        CarRental cr1 = new CarRental();
        cr1.showDetails();
        System.out.println("1==============================");
        cr1.setName("Premium Rentals");
        cr1.setLocation("Dhaka");
        cr1.showDetails();
        System.out.println("2==============================");
        cr1.rentCar(5, "Electric");
        System.out.println("3==============================");
        cr1.showDetails();
        System.out.println("4==============================");
        cr1.rentCar(18, "Hybrid");
        System.out.println("5==============================");
        cr1.rentCar("Sports");
        System.out.println("6==============================");
        cr1.rentCar("Hatchback");
        System.out.println("7==============================");
        cr1.showDetails();
        System.out.println("7==============================");
        CarRental cr2 = new CarRental();
        cr2.setName("Budget Rentals");
        cr2.setLocation("Chittagong");
        cr2.showDetails();
    }
}