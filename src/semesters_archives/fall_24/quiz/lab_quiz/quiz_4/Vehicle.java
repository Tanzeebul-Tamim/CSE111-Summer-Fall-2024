package semesters_archives.fall_24.quiz.lab_quiz.quiz_4;

public class Vehicle {
    public String number;
    public String brand;
    public String type;
    public int index;

    public Vehicle() {
        System.out.println("A vehicle has been created");
    }

    public Vehicle(String number, String brand, String type) {
        this.number = number;
        this.brand = brand;
        this.type = type;
    }
}
