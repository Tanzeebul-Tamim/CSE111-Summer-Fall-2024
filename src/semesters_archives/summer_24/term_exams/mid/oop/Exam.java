package semesters_archives.summer_24.term_exams.mid.oop;

public class Exam {
    private String eName;
    private double time;
    private int subCount;
    private int hasSub;
    private boolean hasEnded;
    private String[] topics;

    void createExam(String eName, double time, int subCount) {
        this.eName = eName;
        this.time = time;
        this.subCount = subCount;
        this.topics = new String[subCount];
    }

    void printInfo() {
        System.out.printf("%s Examination:\n", eName);
        System.out.print("Time left: ");

        if (hasEnded) {
            System.out.println("0.0 mins");
        } else {
            System.out.printf("%.1f mins\n", time);

            if (hasSub > 0) {
                System.out.printf("Topics chosen:\n");

                for (String topic : topics) {
                    if (topic != null) {
                        System.out.println(topic);
                    }
                }
            } else {
                System.out.println("No topics were chosen.");
            }
        }
    }

    void setTopic(String topic) {
        if (hasEnded) {
            System.out.println("The exam has already ended.");
        } else {
            if (hasSub < subCount) {
                topics[hasSub] = topic;
                hasSub++;
            } else {
                System.out.printf("Couldn't add topic %s.\n", topic);
            }
        }
    }

    String endExam() {
        hasEnded = true;
        return "The " + eName + " examination has ended.";
    }
}
