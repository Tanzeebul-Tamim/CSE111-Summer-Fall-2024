package summer_24.assignments.assignment_5.task2;

public class Dog {
    private String name = null;
    private String color = null;

    void changeName(String name) {
        this.name = name;
    }

    String bark() {
        return name == null ? (color == null ? "A dog is barking" : color + " dog is barking")
                : (color == null ? name + " is barking" : name + " the " + color + " dog is barking");
    }

    void changeColor(String color) {
        this.color = color;
        String text = name == null ? "This dog is " + this.color : name + " is " + this.color;
        System.out.println(text);
    }
}
