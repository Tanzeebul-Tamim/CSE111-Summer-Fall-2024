package summer_24.assignments.assignment_7.task7;

public class Student {
    private int id;
    private double cgpa;
    private String[] courses;
    private int courseCount;

    Student(int id) {
        this.id = id;
        this.cgpa = 0;
        this.courses = new String[4];
        this.courseCount = 0;
    }

    Student(int id, double cgpa) {
        this.id = id;
        this.cgpa = cgpa;
        this.courses = new String[4];
        this.courseCount = 0;
    }

    void setID(int id) {
        this.id = id;
    }

    void setCG(double cgpa) {
        this.cgpa = cgpa;
    }

    void addCourse(String course) {
        if (cgpa == 0) {
            System.out.printf("Failed to add %s\n", course);
            System.out.printf("Set CG first\n");
        } else {
            if (this.cgpa < 3 && this.courseCount == 3) {
                System.out.printf("Failed to add %s\n", course);
                System.out.println("CG is low. Can't add more than 3 courses.");
            } else if (this.courseCount == 4) {
                System.out.printf("Failed to add %s\n", course);
                System.out.println("Maximum 4 courses allowed.");
            } else {
                this.courses[this.courseCount] = course;
                this.courseCount++;
            }
        }
    }

    void addCourse(String[] courses) {
        for (String course : courses) {
            addCourse(course);
        }
    }

    void showAdvisee() {
        System.out.printf("Student ID: %d, CGPA: %.1f\n", this.id, this.cgpa);

        if (courseCount > 0) {
            System.out.println("Added courses are:");

            for (int i = 0; i < this.courses.length; i++) {
                String course = this.courses[i];

                if (course != null) {
                    System.out.print(course);

                    if (this.courseCount > 1 && i != this.courses.length - 1) {
                        System.out.print(" ");
                    }

                }
            }
            
            System.out.println();
        } else {
            System.out.println("No courses added.");
        }
    }

    void rmAllCourse() {
        this.courseCount = 0;
        this.courses = new String[4];
    }
}
