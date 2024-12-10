package fall_24.quiz.lab_quiz.quiz_3;

/*
    Design a CarRental class based on the given tester code and output.
        - You should keep the car types and their availability in two separate arrays.
        - Your code should work even if the car types were changed.

    Output:

    1==================
    Car Rental Name: Unnamed
    Location: Default
    Available number of Sedan: 20
    Available number of SUV: 15
    Available number of Hatchback: 16
    Available number of Luxury: 5
    Available number of Van: 8
    2==================
    Name and location have been updated
    3==================
    Successfully rented 3 SUV cars.
    Successfully rented 4 Luxury cars.
    Successfully rented 5 Hatchback cars.
    Successfully rented 10 Sedan cars.
    4==================
    Car Rental Name: City Rental
    Location: Dhaka
    Available number of Sedan: 10
    Available number of SUV: 12
    Available number of Hatchback: 11
    Available number of Luxury: 1
    Available number of Van: 8
    5==================
    2 Luxury cars are not available. Cannot rent.
    6==================
    Car Rental Name: City Rental
    Location: Dhaka
    Available number of Sedan: 10
    Available number of SUV: 12
    Available number of Hatchback: 11
    Available number of Luxury: 1
    Available number of Van: 8
*/

public class CarRentalTester {
    public static void main(String[] args) {
        CarRental cr1 = new CarRental();
        System.out.println("1==================");
        cr1.printDetails();
        System.out.println("2==================");
        System.out.println(cr1.updateDetails("City Rental", "Dhaka"));
        System.out.println("3==================");
        cr1.rentCar(3, "SUV");
        cr1.rentCar(4, "Luxury");
        cr1.rentCar("Hatchback");
        cr1.rentCar(10, "Sedan");
        System.out.println("4==================");
        cr1.printDetails();
        System.out.println("5==================");
        cr1.rentCar(2, "Luxury");
        System.out.println("6==================");
        cr1.printDetails();
    }
}