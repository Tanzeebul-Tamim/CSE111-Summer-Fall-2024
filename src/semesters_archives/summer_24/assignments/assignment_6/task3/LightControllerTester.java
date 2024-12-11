package semesters_archives.summer_24.assignments.assignment_6.task3;

public class LightControllerTester {
    public static void main(String args[]) {
        LightController c1 = new LightController();
        c1.showLightStatus();
        System.out.println("1---------------");
        c1.adjustBrightness(4);
        c1.switchLight();
        System.out.println("2---------------");
        c1.showLightStatus();
        System.out.println("3---------------");
        c1.adjustBrightness(4);
        System.out.println("4---------------");
        c1.showLightStatus();
        System.out.println("5---------------");
        c1.adjustBrightness(-2);
        c1.adjustBrightness(9);
        System.out.println("6---------------");
        c1.showLightStatus();
        System.out.println("7---------------");
        System.out.println(c1.resetSettings());
        c1.showLightStatus();
        System.out.println("8---------------");
        c1.switchLight();
        System.out.println("9---------------");
        c1.showLightStatus();
    }
}
