package com.arman.basepatterns.behavioral.mediator;

public class SimpleChatRunner {
    public static void main(String[] args) {
        SimpleTextChat simpleTextChat = new SimpleTextChat();
        Admin admin = new Admin(simpleTextChat, "admin");
        User user1 = new SimpleUser(simpleTextChat, "user1");
        User user2 = new SimpleUser(simpleTextChat, "user2");

        simpleTextChat.setAdmin(admin);
        simpleTextChat.addUserToChat(user1);
        simpleTextChat.addUserToChat(user2);

        user1.sendMessage("Hello");
        admin.sendMessage("Roger that , I am admin");
    }
}
