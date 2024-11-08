package fall_24.class_notes.lec_5;

public class Tester1 {
    public static void main(String[] args) {
        // Creating three Series objects using the constructor
        Series s1 = new Series();
        s1.newShow("name1", 2025, "Coming soon"); // Setting details for the first Series object

        Series s2 = new Series();
        s2.newShow("name2", 2010, "Completed"); // Setting details for the second Series object

        Series s3 = new Series();
        s3.newShow("name3", 2013, "Ongoing"); // Setting details for the third Series object

        // Printing a separator line for better readability
        System.out.println("----------");

        // Calling the 'details' method of each Series object and printing the result
        System.out.println(s1.details()); // Prints details of s1
        System.out.println("----------");

        System.out.println(s2.details()); // Prints details of s2
        System.out.println("----------");

        System.out.println(s3.details()); // Prints details of s3
        System.out.println("----------");
    }
}
