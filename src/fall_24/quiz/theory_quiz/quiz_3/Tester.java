package fall_24.quiz.theory_quiz.quiz_3;

/*
    Question:

    Design and implement a Java application to manage personal information and addresses. The application should handle the following requirements:

    The `Address` Class stores and displays the details of an address, including area, city, and zpi code - all 3 are `private` attributes. The class also allows updating address details under certain constraints.

    The `Person` class stores and displays a person't name and their permanent and present addresses.

    Carefully observe the following driver code and expected output to design the two classes.

    Note: You do not need to write additional getter() & setter() methods.
 */

public class Tester {
    public static void main(String[] args) {
        Address b1 = new Address("House:3, Banani", "Dhaka", 1212);
        b1.showAddress();
        System.out.println("1 ----------------");
        Address ctg = new Address("34, Kaptai Road", "Chattogram", 4347);
        Person person1 = new Person("Mohammad Ali", ctg, b1);
        person1.displayInfo();
        System.out.println("2 ----------------");
        ctg.setAddress("Shahid Saifuddin Khaled Rd", 4000);
        person1.permanentAddress.showAddress();
        System.out.println("3 ----------------");
        ctg.setAddress("Shahid Saifuddin Khaled Rd", "Chattogram", 4000);
        person1.displayInfo();
        System.out.println("4 ----------------");
        String city = person1.presentAddress.getCity();
        System.out.println(person1.fullName + " lives in " + city);
        String city2 = person1.permanentAddress.getCity();
        System.out.println(person1.fullName + " is from " + city2);
        System.out.println("5 ----------------");
        person1.presentAddress.setAddress("House:7, Banani", 1212);
        b1.showAddress();
        System.out.println("6 ----------------");
    }
}
