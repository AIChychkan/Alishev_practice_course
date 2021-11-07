package com.Chychkan.socialNetwork;

import Models.*;

public class Main {

    public static void main(String[] args) {
        User user0 = new User("Artem");
        User user1 = new User("USACarsYouTube");
        User user2 = new User("CookingWithJackYouTube");
        User user3 = new User("BestMakeUpYouTube");
        User user4 = new User("VinesYouTube");

        user0.subscribe(user1);
        user0.subscribe(user2);
        user0.subscribe(user3);

        System.out.println("------My-subscriptions---------");
        //System.out.println(user0.getSubscriptions());
        System.out.println(user0);

        System.out.println("------Check-subscriptions------");
        System.out.println(user0.isSubscribed(user3));
        System.out.println(user0.isSubscribed(user4));

        System.out.println("------Set-friendship-----------");
        user0.setFriend(user4);
        System.out.println(user0.isFriend(user4));
        System.out.println(user0.isFriend(user3));
        System.out.println(user0.isFriend(user2));

//---Messages---
        user0.sendMessage(user1, "Hello, user1!");
        user1.sendMessage(user0, "Greetings, user0!");
        user0.sendMessage(user1, "How's it going?");
        user1.sendMessage(user0, "Great!");

        System.out.println("------Message-history----------");
        MessageDatabase.showDialog(user0, user1);
    }
}