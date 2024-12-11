package semesters_archives.summer_24.assignments.assignment_7.task3;

public class Parcel {
    public String name;
    public int weight;
    private double fee;

    public Parcel() {
        this(null, 0);
    }

    public Parcel(String name) {
        this(name, 0);
    }

    public Parcel(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public void printDetails() {
        if (this.name == null) {
            System.out.println("Set name first");
        } else {
            System.out.printf("Name: %s\n", this.name);
            System.out.printf("Total Weight: %d\n", this.weight);
            System.out.printf("Total Fee: %.1f\n", this.fee);
        }
    }

    public void addWeight(int weight) {
        this.weight += weight;
        System.out.printf("Updated Weight: %d\n", this.weight);
    }

    public void calcFee(String location) {
        int locationCharge = location.equals("Dhanmondi") ? 50 : 0;

        if (this.weight != 0) {
            this.fee = (this.weight * 20) + locationCharge;
        }
    }
}
