package com.challenge.design.bridge;

public abstract class Message {
    MessageSender messageSender;

    public Message(MessageSender messageSender) {
        this.messageSender = messageSender;
    }

    abstract public void send();
}
