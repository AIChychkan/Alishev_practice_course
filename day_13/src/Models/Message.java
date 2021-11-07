package Models;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Message {
    private User sender;
    private User receiver;
    private String text;
    Date date = new Date();

    public Message(User sender, User receiver, String text) {
        this.sender = sender;
        this.receiver = receiver;
        this.text = text;
        date.getTime();
    }

    public String getSender() {
        return sender.getUsername();
    }

    public String getReceiver() {
        return receiver.getUsername();
    }

    public String getText() {
        return text;
    }

    public Date getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "\nFROM: " + sender.getUsername() + "\nTO:   " + receiver.getUsername() + "\nON:   " + date + "\nTEXT: " + text;
    }
}