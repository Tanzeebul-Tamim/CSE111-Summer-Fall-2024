package semesters_archives.fall_24.assignments.assignment_8.task4;

public class Nokia extends Mobile {
    private double balance;

    public Nokia(String model, boolean simCardStatus, String IMEICode, double balance) {
        super(model, IMEICode, simCardStatus);
        this.balance = balance;
    }

    @Override
    public String toString() {
        return super.toString() + "\nBalance: " + String.format("%.1f", this.balance) + " TK";
    }

    public String dialCall(String contactNo) {
        String output;

        if (this.simCardStatus) {
            if (this.balance == 0) {
                output = "Insufficient balance! Please recharge.";
                return output;
            } else {
                char firstDigit = contactNo.charAt(0);
                String country = firstDigit == '8'
                        ? "Bangladesh"
                        : firstDigit == '4'
                                ? "USA"
                                : "";
                output = country.isEmpty()
                        ? "Dialing is not allowed in this region."
                        : "Dialing the number " + contactNo + " to " + country + " region.";

                return output;
            }
        } else {
            output = "No SIM card available! Please check the SIM card connectivity.";
            return output;
        }
    }

    public void rechargeSIMCard(int amount) {
        this.balance += amount;
        System.out.printf("Recharge successful! Current balance %.1f TK.\n", this.balance);
    }
}
