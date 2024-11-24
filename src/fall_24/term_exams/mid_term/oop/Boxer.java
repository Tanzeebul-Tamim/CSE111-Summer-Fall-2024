package fall_24.term_exams.mid_term.oop;

public class Boxer {
    private String name;
    private double weight;
    private int totalMatch;
    private int won;
    private int lost;
    private int fights;
    private String[] opponents;
    private boolean[] results;

    public void updateDetails(String name, double weight, int totalMatch) {
        this.name = name;
        this.weight = weight;
        this.totalMatch = totalMatch;

        this.opponents = new String[this.totalMatch];
        this.results = new boolean[this.totalMatch];

        System.out.printf("%s can fight %d opponents.\n", this.name, this.totalMatch);
    }

    public void showDetails() {
        System.out.printf("Name: %s, Weight: %.1f KG\n", this.name, this.weight);

        if (this.fights == 0) {
            System.out.println("No fights yet.");
        } else {
            System.out.println("Fights:");

            for (int i = 0; i < fights; i++) {
                String opponent = this.opponents[i];
                String result = this.results[i] ? "Won" : "Lost";

                System.out.printf("vs %s: %s\n", opponent, result);
            }
        }
    }

    public void fight(String opponent, boolean result) {
        if (fights >= totalMatch) {
            System.out.printf("Cannot fight more than %d opponents\n", this.totalMatch);
        } else {
            this.opponents[fights] = opponent;
            this.results[fights] = result;
            this.fights++;

            if (result) {
                this.won++;
            } else {
                this.lost++;
            }
        }
    }

    public void fight(String opponent) {
        fight(opponent, false);
    }

    public String winMatchRatio() {
        int w = this.won;
        int l = this.lost;

        while (w != l) {
            if (w < l) {
                int temp = w;
                w = l;
                l = temp;
            }

            w -= l;
        }

        w = this.won / w;
        l = this.lost / l;

        String output = "Career Stats:\nWon:Lost - " + w + ":" + l;
        return output;
    }
}