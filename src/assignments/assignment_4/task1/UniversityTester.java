package assignments.assignment_4.task1;

public class UniversityTester {
    public static void main(String[] args) {
        // TASK A
        University uni1 = new University();
        University uni2 = new University();

        System.out.println(uni1);
        System.out.println(uni2);

        System.out.println("Are the locations same? -> " + (uni1 == uni2));

        uni1.name = "Harvard University";
        uni1.country = "USA";

        uni2.name = "University of Oxford";
        uni2.country = "UK";

        System.out.println(uni1.name);
        System.out.println(uni1.country);

        System.out.println(uni2.name);
        System.out.println(uni2.country);

        // TASK B
        uni1.name = "Imperial College London";
        uni1.country = "England";

        uni2.name = "Brac University";
        uni2.country = "Bangladesh";

        System.out.println(uni1.name);
        System.out.println(uni1.country);

        System.out.println(uni2.name);
        System.out.println(uni2.country);

        boolean checkNameSimilarity = uni1.name.equals(uni2.name);
        boolean checkCountrySimilarity = uni1.country.equals(uni2.country);

        System.out.println("Are the names same? -> " + checkNameSimilarity);
        System.out.println("Are the countries same? -> " + checkCountrySimilarity);
    }
}
