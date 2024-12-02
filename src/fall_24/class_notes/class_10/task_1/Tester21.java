package fall_24.class_notes.class_10.task_1;

// Import the Programmer class from task_2 package
import fall_24.class_notes.class_10.task_2.Programmer;

public class Tester21 {
    // Main method to test the Programmer class functionality
    public static void main(String[] args) {
        // Create a Programmer object (Junior Software Engineer) with initial salary
        Programmer joy = new Programmer("Joy", "Junior Software Engineer", 50000);
        System.out.println("1===================="); // Section divider for clarity

        // Add skills to the programmer
        joy.setSkill("c++", "java"); // Add two skills
        joy.setSkill("c#", "python"); // Add two more skills
        joy.showInfo(); // Display the programmer's information

        System.out.println("2===================="); // Section divider for clarity

        // Create another Programmer object (Software Engineer) with initial salary
        Programmer anik = new Programmer("Anik", "Software Engineer", 60000);
        System.out.println("3===================="); // Section divider for clarity

        // Add multiple skills to the programmer
        anik.setSkill("c++", "java", "python"); // Add three skills
        anik.setSkill("c#", "ruby", "swift"); // Add three more skills
        anik.showInfo(); // Display the programmer's information

        System.out.println("4===================="); // Section divider for clarity

        // Create a Programmer object (Senior Software Engineer) without an initial
        // salary
        Programmer luna = new Programmer("Luna", "Senior Software Engineer");

        // Add skills to the programmer
        luna.setSkill("c++", "java", "ruby"); // Add three skills
        luna.showInfo(); // Display the programmer's information

        System.out.println("5===================="); // Section divider for clarity

        // Update the salary for the programmer
        luna.setSalary(70000); // Set the salary to 70000
        System.out.println("6===================="); // Section divider for clarity

        // Display the updated programmer information
        luna.showInfo();
    }
}