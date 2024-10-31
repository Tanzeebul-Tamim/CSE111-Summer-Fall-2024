package summer_24.assignments.assignment_5.task8;

public class UberApp {
    private String name;
    private int age;
    private String contactNo;
    private int rideCount;
    private String[] rideHistory;

    UberApp() {
        this.name = null;
        this.age = -1;
        this.contactNo = null;
        this.rideCount = 0;
        this.rideHistory = new String[3];
    }

    void createProfile(String name, int age, String contactNo) {
        this.name = name;
        this.age = age;
        this.contactNo = contactNo;
    }

    void showProfile() {
        System.out.println("Hello! This is your Profile:");
        System.out.printf("Full Name: %s\n", name);
        System.out.printf("Age: %s\n", age);
        System.out.printf("Phone Number: %s\n", contactNo);
    }

    int remainingRides() {
        return 3 - rideCount;
    }

    void bookRide(String destination, double distance) {
        if (rideCount < 3) {
            double fare = 30 * distance;

            System.out.printf("%s has booked a ride!\n", name);
            System.out.printf("Destination : %s\n", destination);
            System.out.printf("Fare: %.1f Taka\n", fare);

            rideHistory[rideCount] = destination;
            rideCount++;
        } else {
            System.out.printf("%s, please update your plan to premium or wait till next month!\n", name);
        }
    }

    void changeLocation(String destination, double distance) {
        double regularFare = 30 * distance;
        double feeAddedFare = regularFare + regularFare * 20 / 100;

        System.out.printf("%s has changed the destination of his current ride to %s\n", name, destination);
        System.out.printf("New fare after adding 20%% change fees: %.1f Taka.\n", feeAddedFare);

        rideHistory[rideCount - 1] = destination;
    }

    void ridingHistory() {
        String locations = "";
        int visitedCount = 0;

        for (int i = 0; i < rideHistory.length; i++) {
            if (rideHistory[i] != null) {
                if (visitedCount > 0) {
                    locations += ", ";
                }
                locations += rideHistory[i];
                visitedCount++;
            }
        }

        if (visitedCount == 0) {
            System.out.printf("%s, you haven't visited anywhere this month.\n", name);
        } else {
            System.out.printf("%s, you have visited %s this month.\n", name, locations);
        }
    }

    void resetMonth() {
        rideHistory = new String[3];
        rideCount = 0;
    }
}
