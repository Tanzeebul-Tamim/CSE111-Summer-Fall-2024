package summer_24.assignments.assignment_6.task7;

/*
    Using varargs in Course2’s addContent(String... contents) method would replace the need for both addOneContent and addTwoContent in Course. This allows Course2 to add any number of content items in a single call
 */

public class Course2 {
    private String name;
    private String code;
    private String[] syllabus;
    private int contentCount;

    Course2() {
        this.name = "";
        this.code = "";
        this.syllabus = new String[4];
        this.contentCount = 0;
    }

    void createCourse(String name, String code) {
        this.name = name;
        this.code = code;
    }

    void addContent(String... contents) {
        for (String content : contents) {
            if (contentCount < 4) {
                syllabus[contentCount] = content;
                contentCount++;
                System.out.printf("%s was added.\n", content);
            } else {
                System.out.println("Cannot add more content.");
            }
        }
    }

    void printDetails() {
        System.out.println("Course Details:");
        System.out.printf("Course Name: %s\n", this.name);
        System.out.printf("Course Code: %s\n", this.code);
        System.out.println("Course Syllabus:");

        if (contentCount > 0) {
            for (int i = 0; i < syllabus.length; i++) {
                String content = syllabus[i];
                
                if (content != null) {
                    System.out.print(content);

                    if (this.contentCount > 1 && i != this.syllabus.length - 1) {
                        System.out.print(", ");
                    }
                }
            }

            System.out.println();
        } else {
            System.out.println("No content yet.");
        }

    }
}
