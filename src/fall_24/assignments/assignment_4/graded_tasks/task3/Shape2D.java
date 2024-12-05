package fall_24.assignments.assignment_4.graded_tasks.task3;

public class Shape2D {
    private String shapeName;
    private double area;

    public Shape2D(int height, int base, String shapeName) {
        System.out.printf("A %s has been created with height: %d and base: %d\n", shapeName, height, base);
        this.area = 0.5 * height * base;
        this.shapeName = shapeName;
    }

    public Shape2D(int side1, int side2, int side3) {
        if (side1 != 0 && side2 != 0 && side3 != 0) {
            System.out.printf("A Triangle has been created with the following sides: %d, %d, %d\n", side1, side2,
                    side3);
            int s = (side1 + side2 + side3) / 2;
            this.area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
            this.shapeName = "Triangle";
        } else if (side1 != 0 && side2 != 0 && side3 == 0) {
            System.out.printf("A Rectangle has been created with length: %d and breadth: %d\n", side1, side2);
            this.area = side1 * side2;
            this.shapeName = "Rectangle";
        } else if (side1 == 0 && side2 == 0 && side3 == 0) {
            System.out.println("A Square has been created with length: 5");
            this.area = 5 * 5;
            this.shapeName = "Square";
        }
    }

    public Shape2D(int side1, int side2) {
        this(side1, side2, 0);
    }

    public Shape2D() {
        this(0, 0, 0);
    }

    public void area() {
        System.out.format("The area of the %s is: %.2f\n", this.shapeName, this.area);
    }
}
