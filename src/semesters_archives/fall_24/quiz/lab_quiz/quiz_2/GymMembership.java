package semesters_archives.fall_24.quiz.lab_quiz.quiz_2;

public class GymMembership {
    private String name;
    private String mType;
    private String slot;
    private int duration;
    private int fee;
    private boolean isCalculated;

    public void setGymDetails(String name, String mType, String slot, int duration) {
        this.name = name;
        this.mType = mType;
        this.slot = slot;
        this.duration = duration;
        this.fee = 1000;
    }

    public double calculateFee() {
        this.isCalculated = true;

        if (this.mType.equals("Premium")) {
            this.fee += 1000;
        }

        if (this.slot.equals("Evening")) {
            this.fee += 200;
        } else if (this.slot.equals("Morning")) {
            this.fee -= 100;
        }

        return (double) this.fee;
    }

    public void printDetails() {
        System.out.printf("Gym Member Name: %s\n", this.name);
        System.out.printf("Membership Type: %s\n", this.mType);
        System.out.printf("Enrollment Time: %s\n", this.slot);
        System.out.printf("Duration: %d months\n", this.duration);

        if (this.isCalculated) {
            System.out.printf("Membership Fee:(BDT) %.1f\n", (double) this.fee);
        } else {
            System.out.println("Membership Fee has not been calculated yet.");
        }
    }
}
