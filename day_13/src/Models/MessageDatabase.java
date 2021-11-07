package Models;

import java.util.ArrayList;
import java.util.List;

public class MessageDatabase {
    private static List<Message> messages = new ArrayList<>();

    public static void addNewMessage(User sender, User receiver, String text){
        messages.add(new Message(sender, receiver, text));
    }

//    public static List<String> getMessages(){
//        return messages;
//    }

    public static void showDialog(User u1, User u2){
        for (Message message: messages){
            if(message.getSender() == u1.getUsername() && message.getReceiver() == u2.getUsername() || message.getSender() == u2.getUsername() && message.getReceiver() == u1.getUsername()){
                System.out.println(message.getSender() + ": " + message.getText());
            }
        }
    }
}