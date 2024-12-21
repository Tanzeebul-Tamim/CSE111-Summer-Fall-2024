package semesters_archives.fall_24.assignments.assignment_4.graded_tasks.task6;

public class Teacher {
    private String name;
    private String initial;
    private Course[] courses;
    private int courseCount;

    public Teacher(String name, String department) {
        this.name = name;
        this.initial = department;
        this.courses = new Course[3];

        System.out.println("A new teacher has been created");
    }

    public void addCourse(Course course) {
        if (this.courseCount < this.courses.length) {
            this.courses[this.courseCount++] = course;
        } else {
            System.out.println("Cannot add more than 3 courses.");
        }
    }

    public void printDetail() {
        System.out.printf("Name: %s\n", this.name);
        System.out.printf("Initial: %s\n", this.initial);

        if (courseCount > 0) {
            System.out.println("List of courses:");

            for (Course course : this.courses) {
                if (course != null) {
                    System.out.println(course.courseCode);
                }
            }
        } else {
            System.out.println("No courses added.");
        }
    }
}
