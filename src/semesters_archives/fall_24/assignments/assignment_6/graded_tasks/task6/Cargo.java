package semesters_archives.fall_24.assignments.assignment_6.graded_tasks.task6;

public class Cargo {
    protected static int count;
    private static double capacity;

    static {
        Cargo.capacity = 10;
    }

    private String content;
    private double weight;
    private int cargoId;
    private boolean isLoaded;

    protected Cargo(String content, double weight) {
        this.content = content;
        this.weight = weight;
        this.cargoId = ++count;
    }

    protected static String capacity() {
        String formattedCapacity = String.format("%.1f", capacity);
        return formattedCapacity;
    }

    protected void details() {
        System.out.printf("Cargo ID: %d, Contents: %s, Weight: %.1f, Loaded: %b\n", this.cargoId, this.content,
                this.weight, this.isLoaded);
    }

    protected void load() {
        if (capacity > this.weight) {
            this.isLoaded = true;
            capacity -= this.weight;

            System.out.printf("Cargo %d loaded for transport.\n", this.cargoId);
        } else {
            System.out.println("Cannot load cargo, exceeds weight capacity.");
        }
    }

    protected void unload() {
        this.isLoaded = false;
        capacity += this.weight;

        System.out.printf("Cargo %d unloaded.\n", this.cargoId);
    }
}
