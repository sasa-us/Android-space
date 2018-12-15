package com.example.sharry.nanochatfirebase;
//represent a chat message in my front db in android
public class ChatMessage {
    //has two property
    //it is important that spell in same way as they are in JSON, so that firebase can automatically map them from the json to the java class
    String name;
    String message;

    //javabean need empty constructor
    public ChatMessage() {

    }

    //need constructor with param for app
    public ChatMessage(String name, String message) {
        this.name = name;
        this.message = message;
    }

    //need getter

    public String getName() {
        return name;
    }

    public String getMessage() {
        return message;
    }
}
