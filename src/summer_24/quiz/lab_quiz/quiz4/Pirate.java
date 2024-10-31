package summer_24.quiz.lab_quiz.quiz4;

public class Pirate {
    String name = "empty";
    String level = null;
    int bounty = 0;

    void showPoster() {
        if (this.name.equals("empty")) {
            System.out.println("Add name to show poster");
        } else {
            System.out.printf("%s's Poster:\n", this.name);
            System.out.printf("Pirate's Bounty: %dM berries\n", this.bounty);
            System.out.printf("Pirate's level: %s\n", this.level);
        }
    }

    void awakePower(String cheatCode) {
        if (cheatCode.equals("haki")) {
            System.out.printf("%s's bounty raised by 200M berries\n", this.name);
            this.bounty += 200;
        } else if (cheatCode.equals("dream")) {
            System.out.printf("%s's bounty raised by 3000M berries\n", this.name);
            this.bounty += 3000;
        }
    }
}
