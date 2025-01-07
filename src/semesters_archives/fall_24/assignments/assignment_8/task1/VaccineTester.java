package semesters_archives.fall_24.assignments.assignment_8.task1;

public class VaccineTester {
    public static void main(String[] args) {
        Vaccine astra = new Vaccine("AstraZeneca", "UK", 60);
        Vaccine modr = new Vaccine("Moderna", "UK", 30);
        Vaccine sin = new Vaccine("Sinopharm", "China", 30);

        Person p1 = new Person("Bob", 21, "Student");
        System.out.println("=================");
        p1.pushVaccine(astra);
        System.out.println("=================");
        p1.showDetail();
        System.out.println("=================");
        p1.pushVaccine(sin, "2nd Dose");
        System.out.println("=================");
        p1.pushVaccine(astra, "2nd Dose");
        System.out.println("=================");
        p1.showDetail();
        System.out.println("=================");
        p1.pushVaccine(astra, "2nd Dose");
        System.out.println("=================");
        p1.showDetail();
        System.out.println("=================");

        Person p2 = new Person("Carol", 23, "Actor");
        System.out.println("=================");
        p2.pushVaccine(sin);
        System.out.println("=================");

        Person p3 = new Person("David", 34);
        System.out.println("=================");
        p3.pushVaccine(modr, "2nd Dose");
        System.out.println("=================");
        p3.pushVaccine(modr, "1st Dose");
        System.out.println("=================");
        p3.showDetail();
        System.out.println("=================");
        p3.pushVaccine(modr, "2nd Dose");

    }
}
