package summer_24.assignments.assignment_7.task4;

public class Shape2D {
    private String shape;
    private int[] lengths;

    Shape2D(int length) {
        this.shape = "Square";
        this.lengths = new int[1];

        this.lengths[0] = length;

        System.out.printf("A %s has been created with length: %d\n", this.shape, length);
    }

    Shape2D(int length, int breadth) {
        this.shape = "Rectangle";
        this.lengths = new int[2];

        this.lengths[0] = length;
        this.lengths[1] = breadth;

        System.out.printf("A %s has been created with length: %d and breadth: %d\n", this.shape, length, breadth);
    }

    Shape2D(int height, int base, String shape) {
        this.shape = shape;
        this.lengths = new int[2];

        this.lengths[0] = height;
        this.lengths[1] = base;

        System.out.printf("A %s has been created with height: %d and base: %d\n", this.shape, height, base);
    }

    Shape2D(int side1, int side2, int side3) {
        this.shape = "Triangle";
        this.lengths = new int[3];

        this.lengths[0] = side1;
        this.lengths[1] = side2;
        this.lengths[2] = side3;

        System.out.printf("A triangle has been created with the following sides: %d, %d, %d\n", side1, side2, side3);
    }

    void area() {
        double area;

        if (this.shape.equals("Square")) {
            int side = this.lengths[0];
            area = Math.pow(side, 2);
        } else if (this.shape.equals("Rectangle")) {
            int side1 = this.lengths[0];
            int side2 = this.lengths[1];
            area = side1 * side2;
        } else {
            if (this.lengths.length == 2) {
                int height = this.lengths[0];
                int base = this.lengths[1];
                area = 0.5 * height * base;
            } else {
                int a = this.lengths[0];
                int b = this.lengths[1];
                int c = this.lengths[2];

                double s = (a + b + c) / 2;
                area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
            }
        }

        System.out.printf("The area of the %s is: %.2f\n", this.shape, area);
    }
}