package semesters_archives.fall_24.assignments.assignment_8.task4;

class Mobile {
    public String model;
    public String IMEICode;
    public boolean simCardStatus;

    public Mobile(String model, String IMEICode, boolean simCardStatus) {
        this.model = model;
        this.IMEICode = IMEICode;
        this.simCardStatus = simCardStatus;
        System.out.println("Model " + model + " is manufactured.");
    }

    public String getCountryName(String countryCode) {
        if (countryCode.equals("880")) {
            return "Bangladesh";
        } else if (countryCode.equals("455")) {
            return "USA";
        }
        return null;
    }

    public void activateSimCard() {
        if (!simCardStatus) {
            simCardStatus = true;
            System.out.println("SIM card is activated successfully.");
        }
    }

    @Override
    public String toString() {
        return "Mobile Phone Detail:\nModel: " + model + "\nIMEICode: " + IMEICode + "\nSIM Card Status: "
                + simCardStatus;
    }
}

public class MobileTester {
    public static void main(String[] args) {
        Nokia N3110 = new Nokia("N3110", true, "IMEI-102", 0);
        System.out.println(N3110);
        System.out.println("1========================");
        Nokia N1100 = new Nokia("N1100", false, "IMEI-124", 100);
        System.out.println(N1100);
        System.out.println("2========================");
        System.out.println(N3110.dialCall("88017196xxxx"));
        System.out.println("3========================");
        N3110.rechargeSIMCard(200);
        N1100.rechargeSIMCard(300);
        System.out.println("4========================");
        System.out.println(N3110.dialCall("88017196xxxx"));
        System.out.println("5========================");
        System.out.println(N1100.dialCall("45517196xxxx"));
        System.out.println("6========================");
        N1100.activateSimCard();
        System.out.println("7========================");
        System.out.println(N1100.dialCall("45517196xxxx"));
        System.out.println("8========================");
        System.out.println(N1100.dialCall("96617196xxxx"));

    }
}
