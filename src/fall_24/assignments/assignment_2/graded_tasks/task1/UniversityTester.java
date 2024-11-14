package fall_24.assignments.assignment_2.graded_tasks.task1;

public class UniversityTester {
    public static void main(String[] args) {
        University uni1 = new University();
        University uni2 = new University();

        System.out.println(uni1);
        System.out.println(uni2);

        System.out.println(uni1.name);
        System.out.println(uni1.country);

        System.out.println(uni2.name);
        System.out.println(uni2.country);

        uni1.name = "Imperial College London";
        uni1.country = "England";

        uni2.name = "Brac University";
        uni2.country = "Bangladesh";

        System.out.println(uni1.name);
        System.out.println(uni1.country);

        System.out.println(uni2.name);
        System.out.println(uni2.country);
    }
}
