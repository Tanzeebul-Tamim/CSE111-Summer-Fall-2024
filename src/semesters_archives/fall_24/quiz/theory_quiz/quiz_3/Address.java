package semesters_archives.fall_24.quiz.theory_quiz.quiz_3;

public class Address {
    private String area;
    private String city;
    private int zip;

    public Address(String area, String city, int zip) {
        this.area = area;
        this.city = city;
        this.zip = zip;
    }

    public void showAddress() {
        System.out.printf("%s, %s-%d\n", this.area, this.city, this.zip);
    }

    public void setAddress(String area, String city, int zip) {
        if (city == null) {
            if (this.zip == zip) {
                System.out.println("Updated Area.");
                this.area = area;
            } else {
                System.out.println("Updating zipcode requires a city name.");
            }
        } else {
            this.area = area;
            this.city = city;
            this.zip = zip;
        }
    }

    public void setAddress(String area, int zip) {
        this.setAddress(area, null, zip);
    }

    public String getCity() {
        return this.city;
    }
}
