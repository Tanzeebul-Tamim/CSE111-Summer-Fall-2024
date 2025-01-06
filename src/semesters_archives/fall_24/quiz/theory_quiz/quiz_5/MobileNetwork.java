package semesters_archives.fall_24.quiz.theory_quiz.quiz_5;

public class MobileNetwork extends Network {
    private double limit;

    public MobileNetwork(String name, double bandwidth, String signalStrength, double limit) {
        super(name, bandwidth, signalStrength);
        this.limit = limit;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + "Data Limit: " + this.limit + " GB";
    }

    public void download(double size) {
        if (size > this.limit) {
            System.out.println("File size exceeds download limit.");
        } else {
            if (this.signalStrength.equals("weak")) {
                System.out.printf("%s has %s signal strength.\nDownload stopped.\n", this.name, this.signalStrength);
            } else {
                this.limit -= size;
                double time = size * 1000 / this.bandwidth;
                System.out.printf("Downloading %.1f GB over %.1f seconds.\n", size, time);
            }
        }
    }
}
