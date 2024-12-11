package fall_24.quiz.theory_quiz.quiz_3;

public class Person {
    public String fullName;
    public Address presentAddress;
    public Address permanentAddress;

    public Person(String name, Address permAd, Address presAd) {
        this.fullName = name;
        this.permanentAddress = permAd;
        this.presentAddress = presAd;

        System.out.println("New Person created.");
    }

    public void displayInfo() {
        System.out.printf("Name: %s\n", this.fullName);
        System.out.println("Present Address:");
        this.presentAddress.showAddress();
        System.out.println("Permanent Address:");
        this.permanentAddress.showAddress();
    }
}
