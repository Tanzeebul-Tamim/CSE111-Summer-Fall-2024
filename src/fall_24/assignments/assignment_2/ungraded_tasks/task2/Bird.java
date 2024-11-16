package fall_24.assignments.assignment_2.ungraded_tasks.task2;

public class Bird {
    public String name = null;
    private int height = 0;

    public void flyUp(int height) {
        System.out.printf("%s has flown up %d feet.\n", this.name, height);
        this.height += height;
    }

    public void flyDown(int height) {
        if (height > this.height) {
            System.out.printf("%s cannot fly down %d feet.\n", this.name, height);
        } else {
            if (height < this.height)
                System.out.printf("%s has flown down %d feet.\n", this.name, height);
            else
                System.out.printf("%s has flown down %d feet and landed.\n", this.name, height);

            this.height -= height;
        }
    }

    public void makeNoise() {
        String noise = name != null && this.name.equals("Parrot") ? "Squawk" : "Squee";
        System.out.println(noise);
    }
}
