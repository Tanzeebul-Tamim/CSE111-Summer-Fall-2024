package semesters_archives.fall_24.assignments.assignment_8.task6;

public class Bondhus extends SocialMedia {
    private String[] sentMessages;
    private int messageCount;
    boolean flag;

    public Bondhus(String name, String email) {
        super(name, email);
        this.sentMessages = new String[4];
    }

    public void showSentbox() {
        System.out.printf("%s's Sentbox:\n", this.userName);

        if (messageCount > 0) {
            for (String message : this.sentMessages) {
                if (message != null) {
                    System.out.println(message);
                }
            }
        } else {
            System.out.println("No sent messages.");
        }
    }

    public void sendMessage(String message) {
        if (message.equals("Bye.")) {
            this.messageCount++;
        } else {
            if (this.messageCount <= this.sentMessages.length) {
                this.sentMessages[this.messageCount++] = message;
            } else {
                System.out.println("Sentbox is full.");
            }
        }
    }

    @Override
    public String toString() {
        return super.toString() + "\nMessgages Sent: " + this.messageCount;
    }
}
