package fall_24.class_notes.class_7.oop.task7;

public class ClubTester {
    public static void main(String[] args) {
        Club club1 = new Club();
        System.out.println("1=================");
        System.out.println(club1.approveClub("Makers Club", 4, 10000));
        System.out.println("2=================");
        System.out.println(club1.approveClub("Makers Club", 10, 10000));
        System.out.println("3=================");
        club1.info();
        System.out.println("4=================");
        club1.createEvent("Exhibit", 4099, 5);
        System.out.println("5=================");
        club1.createEvent("Impromptu", 5700, 6);
        System.out.println("6=================");
        club1.recruitMember(5);
        System.out.println("7=================");
        club1.createEvent("Impromptu", 5700, 6);
        System.out.println("8=================");
        club1.info();
        System.out.println("9=================");
        club1.createEvent("Potluck", 1200, 3);
        System.out.println("10=================");
        club1.createEvent("Potluck", 100, 3);
        System.out.println("11=================");
        club1.info();
        System.out.println("12=================");
        club1.createEvent("Speech", 100, 2);
        System.out.println("13=================");
        club1.endEvent("Exhibit");
        System.out.println("14=================");
        club1.info();
        System.out.println("15=================");
        club1.createEvent("Speech", 100, 2);
    }
}
