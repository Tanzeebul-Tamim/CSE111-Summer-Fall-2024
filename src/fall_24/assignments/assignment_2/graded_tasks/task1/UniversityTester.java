package fall_24.assignments.assignment_2.graded_tasks.task1;

public class UniversityTester {
    public static void main(String[] args) {
        // TASK A
        University uni1 = new University();
        University uni2 = new University();

        System.out.println(uni1);
        System.out.println(uni2);

        System.out.println(uni1.name);
        System.out.println(uni1.country);

        System.out.println(uni2.name);
        System.out.println(uni2.country);

        System.out.println("Are the locations same? -> " + (uni1 == uni2));

        // TASK B
        uni1.name = "Imperial College London";
        uni1.country = "England";

        uni2.name = "Brac University";
        uni2.country = "Bangladesh";

        // The instance variables of both objects has been changed to newly assigned values
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
