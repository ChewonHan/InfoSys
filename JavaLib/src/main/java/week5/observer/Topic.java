package week5.observer;

import java.util.ArrayList;

public class Topic implements Subject{
    private String message; // the status
    private ArrayList<Observer> observers;

    public Topic(){
        observers = new ArrayList<Observer>();
    }

    public void notifyObservers(){
        for (Observer o : observers)
            o.update(this.message);
    }

    public void register(Observer o){
        observers.add(o);
    }

    public void unregister(Observer o){
        observers.remove(o);
    }

    public void postMessage(String msg){
        message = msg;
        notifyObservers();
    }
}
