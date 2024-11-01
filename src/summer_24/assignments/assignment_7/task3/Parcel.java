package summer_24.assignments.assignment_7.task3;

public class Parcel {
    public String name;
    public int weight;
    private double fee;

    Parcel() {
        this.name = null;
        this.weight = 0;
        this.fee = 0;
    }

    Parcel(String name) {
        this.name = name;
        this.weight = 0;
        this.fee = 0;
    }

    Parcel(String name, int weight) {
        this.name = name;
        this.weight = weight;
        this.fee = 0;
    }

    void printDetails() {
        if (this.name == null) {
            System.out.println("Set name first");
        } else {
            System.out.printf("Name: %s\n", this.name);
            System.out.printf("Total Weight: %d\n", this.weight);
            System.out.printf("Total Fee: %.1f\n", this.fee);
        }
    }

    void addWeight(int weight) {
        this.weight += weight;
        System.out.printf("Updated Weight: %d\n", this.weight);
    }

    void calcFee(String location) {
        int locationCharge = location.equals("Dhanmondi") ? 50 : 0;

        if (this.weight != 0) {
            this.fee = (this.weight * 20) + locationCharge;
        }
    }
}
