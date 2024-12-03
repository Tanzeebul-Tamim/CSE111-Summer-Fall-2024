package summer_24.assignments.assignment_6.task8;

public class Shape {
    private String name;
    private String area;

    public void setParameters(String name, int... properties) {
        this.name = name;
        double areaValue;

        if (properties.length == 1) {
            int radius = properties[0];

            areaValue = Math.PI * Math.pow(radius, 2);
            this.area = String.format("%.2f", areaValue);
        } else if (properties.length == 2) {
            int base = properties[0];
            int height = properties[1];

            areaValue = 0.5 * base * height;
            this.area = String.format("%.2f", areaValue);
        } else if (properties.length == 3) {
            int base1 = properties[0];
            int base2 = properties[1];
            int height = properties[2];
            
            areaValue = (base1 + base2) * height / 2;
            this.area = String.format("%.2f", areaValue);
        }

    }

    public String details() {
        String name = "Shape Name: " + this.name;
        String area = "Area: " + this.area;

        return name + "\n" + area;
    }

}
