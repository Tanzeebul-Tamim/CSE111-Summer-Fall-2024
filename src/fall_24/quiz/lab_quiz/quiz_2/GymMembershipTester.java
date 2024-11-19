package fall_24.quiz.lab_quiz.quiz_2;

/*
    Design the GymMembership class so that the following output is produced while running theGymMembershipTester class:

    Output:

    Gym Member Name: Andrew
    Membership Type: Premium
    Enrollment Time: Evening
    Duration: 12 months
    Membership Fee has not been calculated yet.
    1==============================
    Calculated Membership Fee:(BDT) 2200.0
    2==============================
    Gym Member Name: Andrew
    Membership Type: Premium
    Enrollment Time: Evening
    Duration: 12 months
    Membership Fee:(BDT) 2200.0
    3==============================
    Calculated Membership Fee:(BDT) 1900.0
    4==============================
    Gym Member Name: Daniel
    Membership Type: Premium
    Enrollment Time: Morning
    Duration: 18 months
    Membership Fee:(BDT) 1900.0
    5==============================
    Gym Member Name: Pamella
    Membership Type: Standard
    Enrollment Time: Morning
    Duration: 6 months
    Membership Fee:(BDT) 900.0

    Hint: A standard membership will cost 1000 TK while a premium one costs 2000 TK. An evening slot will cost an additional 200 TK whereas a morning slot have a discount of 100 TK.
 */

public class GymMembershipTester {
    public static void main(String[] args) {
        GymMembership gm1 = new GymMembership();
        gm1.setGymDetails("Andrew", "Premium", "Evening", 12);
        gm1.printDetails();
        System.out.println("1==============================");
        double fee1 = gm1.calculateFee();
        System.out.println("Calculated Membership Fee:(BDT) " + fee1);
        System.out.println("2==============================");
        gm1.printDetails();
        System.out.println("3==============================");
        GymMembership gm2 = new GymMembership();
        gm2.setGymDetails("Daniel", "Premium", "Morning", 18);
        double fee2 = gm2.calculateFee();
        System.out.println("Calculated Membership Fee:(BDT) " + fee2);
        System.out.println("4==============================");
        gm2.printDetails();
        System.out.println("5==============================");
        GymMembership gm3 = new GymMembership();
        gm3.setGymDetails("Pamella", "Standard", "Morning", 6);
        double fee3 = gm3.calculateFee();
        gm3.printDetails();
    }
}
