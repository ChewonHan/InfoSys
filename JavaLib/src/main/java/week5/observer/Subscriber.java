package week5.observer;

import jdk.internal.loader.AbstractClassLoaderValue;

public class Subscriber implements Observer{
    private String username;
    private String message;
    private Subject subject;

    // When subscriber is created, we set the username and register it to a topic
    Subscriber(String username, Subject subject){
        this.username = username;
        subject.register( this);
    }

    @Override
    public void update(String msg) {
        message = msg;
        System.out.println( username + " received a message " + msg);
    }
}