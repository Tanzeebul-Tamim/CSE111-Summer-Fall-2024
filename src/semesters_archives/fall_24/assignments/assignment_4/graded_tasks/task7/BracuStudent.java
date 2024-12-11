package semesters_archives.fall_24.assignments.assignment_4.graded_tasks.task7;

public class BracuStudent {
    public String name;
    public String residence;
    public boolean hasPass;

    public BracuStudent(String name, String residence) {
        this.name = name;
        this.residence = residence;
    }

    public void showDetails() {
        System.out.printf("Student Name: %s\n", this.name);
        System.out.printf("Lives in %s\n", this.residence);
        System.out.printf("Have Bus Pass? %b\n", this.hasPass);
    }

    public void getPass() {
        this.hasPass = true;
    }

    public void updateHome(String residence) {
        this.residence = residence;
    }
}
