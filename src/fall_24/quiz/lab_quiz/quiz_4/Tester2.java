package fall_24.quiz.lab_quiz.quiz_4;

/*
    Question: Design the Vehicle and Garage classes so that the Tester2 class produces the given outputs.

    Restriction: Garage class can't have more than 1 array.

    Output:
    
 */

public class Tester2 {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle();
        Vehicle v2 = new Vehicle("123-XYZ", "Toyota", "Car");
        System.out.println("1-----------------------");
        Garage g1 = new Garage();
        g1.info();
        System.out.println("2-----------------------");
        Vehicle v3 = new Vehicle("567-MPH", "Yamaha", "Bike");
        Vehicle v4 = new Vehicle("281-WRH", "Honda", "Car");
        System.out.println("3-----------------------");
        g1.parkVehicle(v2);
        g1.parkVehicle(v3);
        System.out.println("4-----------------------");
        g1.info();
        System.out.println("5-----------------------");
        g1.parkVehicle(v4);
        g1.parkVehicle(v1);
        System.out.println("6-----------------------");
        g1.info();
        System.out.println("7-----------------------");
        g1.removeVehicle(v4);
        System.out.println("8-----------------------");
        g1.info();
    }
}
