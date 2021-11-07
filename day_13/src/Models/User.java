package Models;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String username;
    boolean isFriend;
    List<User> subscriptions;

    public User(String username) {
        this.username = username;
        subscriptions = new ArrayList<>();
    }

    @Override
    public String toString() {
        return username + subscriptions;
    }

    public String getUsername() {
        return username;
    }

    public List<User> getSubscriptions() {
        return subscriptions;
    }

    public void subscribe(User user){
        subscriptions.add(user);
    }

    public boolean isSubscribed(User user){
        for (User username: subscriptions){
            if (user.getUsername() == username.username){
                return true;
            }
        }
        return false;
    }

    public void setFriend(User user){
        user.isFriend = true;
    }

    public boolean isFriend(User user){
        if(user.isFriend) {
            return true;
        }
        return false;
    }

    public void sendMessage(User user, String text){
        MessageDatabase.addNewMessage(this, user, text);

    }
}