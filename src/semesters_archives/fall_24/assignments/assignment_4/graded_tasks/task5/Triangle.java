package semesters_archives.fall_24.assignments.assignment_4.graded_tasks.task5;

public class Triangle {
    private int side1;
    private int side2;
    private int side3;
    private int perimeter;

    public void updateSides(int side1, int side2, int side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.perimeter = this.side1 + this.side2 + this.side3;
    }

    public void triangleDetails() {
        System.out.printf("Three sides of the triangle are: %d, %d, %d\n", this.side1, this.side2, this.side3);
        System.out.printf("Perimeter: %d\n", this.perimeter);
    }

    public String printTriangleType() {
        String type;

        if (side1 == side2 && side2 == side3) {
            type = "an Equilateral";
        } else if (side1 == side2 || side1 == side3 || side2 == side3) {
            type = "an Isosceles";
        } else {
            type = "a Scalene";
        }

        return "This is " + type + " Triangle.";
    }

    public void compareTriangles(Triangle triangle) {
        if (this == triangle) {
            System.out.println("These two triangle objects have the same address.");
        } else {
            int side1 = triangle.side1;
            int side2 = triangle.side2;
            int side3 = triangle.side3;
            int perimeter = triangle.perimeter;

            if (this.side1 == side1 && this.side2 == side2 && this.side3 == side3) {
                System.out.println("Addresses are different but the sides of the triangles are equal.");
            } else {
                if (this.perimeter == perimeter) {
                    System.out.println("Only the perimeter of both triangles is equal.");
                } else {
                    System.out.println("Addresses, length of the sides and perimeter all are different.");
                }
            }
        }
    }
}
