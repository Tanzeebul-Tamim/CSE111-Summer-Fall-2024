package semesters_archives.fall_24.class_notes.class_7.oop.task6;

public class Test10 {
    public static void main(String[] args) {
        Contact c1 = new Contact();
        c1.number = "+880-1111";
        c1.callHistory = new String[3];
        c1.smsHistory = new String[2];
        Contact c2 = new Contact();
        c2.number = "+880-2222";
        c2.callHistory = new String[2];
        c2.smsHistory = new String[3];
        c1.sendSms(c2, "Good morning");
        c2.call(c1);
        System.out.println("-- -- -- -- --");
        c2.sendSms(c1, "Call when you're free");
        c1.call(c2);
        System.out.println("-- -- -- -- --");
        c1.showHistory();
        System.out.println("-- -- -- -- --");
        c2.showHistory();
        System.out.println("-- -- -- -- --");
        c2.sendSms(c1, "Hello!");
        c1.call(c2);
        System.out.println("-- -- -- -- --");
        c1.showHistory();
        System.out.println("-- -- -- -- --");
        c2.showHistory();
        c1.sendSms(c1, "Are you free?");
        c2.call(c2);
        System.out.println("-- -- -- -- --");
    }
}
