package fall_24.assignments.assignment_4.graded_tasks.task8;

public class Usis {
    private Student[] users;
    private int totalAdvisee;

    public Usis() {
        System.out.println("Usis is ready to use!");
        this.users = new Student[5];
    }

    public void login(Student user) {
        if (user.email == null || user.password == null) {
            System.out.println("Email and password need to be set.");
        } else {
            System.out.println("Login successful");
            user.updateLoginStatus("Logged-in");
        }
    }

    public void advising(Student user, String... courses) {
        if (user.getLoginStatus() == null) {
            System.out.println("Please login to advise courses!");
        } else {
            if (courses == null) {
                System.out.println("You haven't selected any courses.");
            } else {
                if (courses.length > 3) {
                    System.out.println("You need special approval to take more than 3 courses.");
                } else {
                    user.courses = courses;
                    this.users[this.totalAdvisee] = user;
                    this.totalAdvisee++;

                    System.out.println("Advising successful!");
                }
            }
        }
    }

    public void advising(Student user) {
        String[] courses = null;
        this.advising(user, courses);
    }

    public void allAdviseeInfo() {
        System.out.printf("Total Advisee: %d\n", this.totalAdvisee);

        for (Student user : this.users) {
            if (user != null) {
                System.out.printf("Name: %s ID: %d\n", user.name, user.id);
                System.out.printf("Department: %s\n", user.department);
                System.out.println("Advised Courses:");

                for (String course : user.courses) {
                    if (course != null) {
                        System.out.print(course + " ");
                    }
                }

                System.out.println("\n==============");
            }
        }
    }
}
