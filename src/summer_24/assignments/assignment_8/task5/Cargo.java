package summer_24.assignments.assignment_8.task5;

public class Cargo {
    public static int count;
    private static double capacity = 10;

    private String content;
    private double weight;
    private int cargoId;
    private boolean isLoaded;

    public Cargo(String content, double weight) {
        this.content = content;
        this.weight = weight;
        this.cargoId = ++count;
    }

    public static String capacity() {
        String formattedCapacity = String.format("%.1f", capacity);

        return formattedCapacity;
    }

    public void details() {
        System.out.printf("Cargo ID: %d, Contents: %s, Weight: %.1f, Loaded: %b\n", this.cargoId, this.content,
                this.weight, this.isLoaded);
    }

    public void load() {
        if (capacity > this.weight) {
            this.isLoaded = true;
            capacity -= this.weight;

            System.out.printf("Cargo %d loaded for transport.\n", this.cargoId);
        } else {
            System.out.println("Cannot load cargo, exceeds weight capacity.");
        }
    }

    public void unload() {
        this.isLoaded = false;
        capacity += this.weight;

        System.out.printf("Cargo %d unloaded.\n", this.cargoId);
    }
}
