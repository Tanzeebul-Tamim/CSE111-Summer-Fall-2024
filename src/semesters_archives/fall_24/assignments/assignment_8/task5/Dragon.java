package semesters_archives.fall_24.assignments.assignment_8.task5;

public class Dragon extends MagicalCreature {
    private int firePower;

    public Dragon(String name, int age, int firePower) {
        super(name, age);
        this.firePower = firePower;
    }

    @Override
    public void makeSound() {
        System.out.printf("%s roars with a fiery breath!\n", this.name);
    }

    @Override
    public void performMagic() {
        System.out.printf("%s breathes fire with power level: %d\n", this.name, this.firePower);
    }

    public void fly() {
        System.out.printf("%s flies through the sky.\n", this.name);
    }
}
