/*
 * Copyright (c) 2024 Tanzeebul Tamim
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of
 * this software and associated documentation files (the "Software"), to deal in
 * the Software without restriction, including without limitation the rights to
 * use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of
 * the Software, and to permit persons to whom the Software is furnished to do so,
 * subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS
 * FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR
 * COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER
 * IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN
 * CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

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
