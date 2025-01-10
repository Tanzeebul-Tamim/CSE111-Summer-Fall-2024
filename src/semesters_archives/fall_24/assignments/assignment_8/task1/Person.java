package semesters_archives.fall_24.assignments.assignment_8.task1;

public class Person {
    private String name;
    private int age;
    private String type;
    private Vaccine vaccine;
    private int dosageCount;

    public Person(String name, int age) {
        this(name, age, "General Citizen");
    }

    public Person(String name, int age, String type) {
        this.name = name;
        this.age = age;
        this.type = type;
    }

    public void pushVaccine(Vaccine vaccine) {
        this.pushVaccine(vaccine, "1st Dose");
    }

    public void pushVaccine(Vaccine vaccine, String dose) {
        boolean condition1 = this.dosageCount == 0 && !dose.equals("1st Dose");
        boolean condition2 = !this.type.equalsIgnoreCase("student") &&
                this.age < 25;
        boolean condition3 = this.dosageCount >= 1 &&
                this.vaccine != null &&
                !vaccine.getName().equals(this.vaccine.getName());
        boolean condition4 = this.dosageCount > 1;

        if (condition1) {
            System.out.printf("Sorry %s, invalid dose request.\n", this.name);
            return;
        }

        if (condition2) {
            System.out.printf("Sorry %s, minimum age for taking vaccines is 25 years now.\n", this.name);
            return;
        }

        if (condition3) {
            System.out.printf("Sorry %s, you can't take 2 different vaccines.\n", this.name);
            return;
        }

        if (condition4) {
            System.out.printf("Sorry %s, you already received both doses.\n", this.name);
            return;
        }

        this.vaccine = vaccine;
        this.dosageCount++;
        System.out.printf("%s done for %s.\n", dose, this.name);
    }

    public void showDetail() {
        System.out.printf("Name: %s Age: %d Type: %s\n",
                this.name,
                this.age,
                this.type);

        System.out.printf("Vaccine name: %s\n", this.vaccine.getName());

        System.out.printf("1st dose: %s\n",
                this.dosageCount >= 1
                        ? "Given"
                        : "Not given");

        System.out.printf("2nd dose: %s\n",
                this.dosageCount > 1
                        ? "Given"
                        : "Please come after "
                                + (this.vaccine.getName().equalsIgnoreCase("Moderna")
                                        ? 30
                                        : 60)
                                + " days");
    }
}
