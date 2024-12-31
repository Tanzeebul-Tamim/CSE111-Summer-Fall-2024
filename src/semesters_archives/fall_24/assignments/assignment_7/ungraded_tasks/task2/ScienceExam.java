package semesters_archives.fall_24.assignments.assignment_7.ungraded_tasks.task2;

public class ScienceExam extends Exam {
    private int partCount;
    private String[] parts;

    public ScienceExam(int marks, int time, String... parts) {
        super(marks);
        this.time = time;
        this.partCount = parts.length + 2;
        this.parts = parts;
    }

    @Override
    public String toString() {
        String marks = "Marks: " + this.marks;
        String time = "Time: " + this.time + " minutes";
        String parts = "Number of Parts: " + this.partCount;
        String output = marks + " " + time + " " + parts;

        return output;
    }

    @Override
    public String examSyllabus() {
        String output = super.examSyllabus();

        for (int i = 0; i < parts.length; i++) {
            String part = this.parts[i];
            output += ", " + part;
        }

        return output;
    }

    @Override
    public String examParts() {
        String output = super.examParts();
        int count = 0;

        for (String part : this.parts) {
            output += "Part " + (++count + 2) + " - " + part + "\n";
        }

        return output;
    }
}
