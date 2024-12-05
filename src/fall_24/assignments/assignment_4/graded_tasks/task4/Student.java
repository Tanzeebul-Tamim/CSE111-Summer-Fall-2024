package fall_24.assignments.assignment_4.graded_tasks.task4;

public class Student {
  private int id;
  private double cgpa;
  private String[] courses;
  private int courseCount;

  public Student(int id) {
    this(id, 0);
  }

  public Student(int id, double cgpa) {
    this.id = id;
    this.storeCG(cgpa);
    this.courses = new String[4];

    if (this.cgpa == 0) {
      System.out.format("A student with ID %d has been created.\n", this.id);
    } else {
      System.out.format("A student with ID %d and cgpa %.1f has been created.\n", this.id, this.cgpa);
    }
  }

  public void storeID(int id) {
    this.id = id;
  }

  public void storeCG(double cgpa) {
    if (cgpa > 4 || cgpa < 0) {
      System.out.println("Invalid CGPA");
    } else {
      this.cgpa = cgpa;
    }
  }

  public void addCourse(String course) {
    if (cgpa == 0) {
      System.out.printf("Failed to add %s\nSet CG first", course);
    } else {
      if (this.cgpa < 3 && this.courseCount == 3) {
        System.out.printf("Failed to add %s\n", course);
        System.out.println("CG is low. Can't add more than 3 courses.");
      } else if (this.courseCount == this.courses.length) {
        System.out.printf("Failed to add %s\n", course);
        System.out.println("Maximum 4 courses allowed.");
      } else {
        this.courses[this.courseCount] = course;
        this.courseCount++;
      }
    }
  }

  public void addCourse(String[] courses) {
    for (String course : courses) {
      this.addCourse(course);
    }
  }

  public void showAdvisee() {
    System.out.printf("Student ID: %d, CGPA: %.1f\n", this.id, this.cgpa);

    if (courseCount > 0) {
      System.out.println("Added courses are:");

      for (int i = 0; i < this.courses.length; i++) {
        String course = this.courses[i];

        if (course != null) {
          System.out.print(course + " ");
        }
      }

      System.out.println();
    } else {
      System.out.println("No courses added.");
    }
  }

  public void removeAllCourse() {
    this.courseCount = 0;
    this.courses = new String[4];
  }
}
