package fall_24.class_notes.class_7.oop.task6;

public class Contact {
    public String number;
    public String[] callHistory;
    public String[] smsHistory;
    private int smsCount;
    private int callCount;

    public void call(Contact contact) {
        int callCapacity = this.callHistory.length - this.callCount;

        if (callCapacity > this.callCount) {
            System.out.printf("%s called %s\n", this.number, contact.number);
            saveHistory(contact.number);
            contact.saveHistory(this.number);
        } else {
            System.out.printf("Maximum calls reached for %s, please recharge more.\n", contact.number);
        }
    }

    public void sendSms(Contact contact, String message) {
        int smsCapacity = this.smsHistory.length - this.smsCount;

        if (smsCapacity > this.smsCount) {
            System.out.printf("SMS sent from %s to %s\n", this.number, contact.number);
            saveHistory(this.number, contact.number, message);
            contact.saveHistory(this.number, contact.number, message);
        } else {
            System.out.printf("Maximum messages reached for %s, please recharge more.\n", contact.number);
        }
    }

    private void saveHistory(String receiver) {
        callHistory[callCount] = receiver;
        callCount++;
    }

    private void saveHistory(String sender, String receiver, String text) {
        String history = "from " + sender + " to " + receiver + ": " + text;
        smsHistory[smsCount] = history;
        smsCount++;
    }

    public void showHistory() {
        System.out.printf("Call history for %s:\n", this.number);

        for (String call : callHistory) {
            if (call != null) {
                System.out.println(call);
            }
        }

        System.out.printf("SMS history for %s:\n", this.number);

        for (String sms : smsHistory) {
            if (sms != null) {
                System.out.println(sms);
            }
        }
    }
}
