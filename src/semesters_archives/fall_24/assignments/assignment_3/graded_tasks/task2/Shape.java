package semesters_archives.fall_24.assignments.assignment_3.graded_tasks.task2;

public class Shape {
    private String name;
    private String area;
    private double areaValue;

    public void setParameters(String name, int radius) {
        this.name = name;
        areaValue = Math.PI * Math.pow(radius, 2);
        this.area = String.format("%.2f", areaValue);
    }

    public void setParameters(String name, int height, int base) {
        this.name = name;
        areaValue = 0.5 * base * height;
        this.area = String.format("%.1f", areaValue);
    }

    public void setParameters(String name, double height, double length) {
        this.name = name;
        areaValue = length * height;
        this.area = String.format("%.2f", areaValue);
    }

    public String details() {
        String name = "Shape Name: " + this.name;
        String area = "Area: " + this.area;

        return name + "\n" + area;
    }

}
