package MIDTERM.OODesignPattern;

public class Subscriber implements Observer{
    private String message;
    private Subject subject;

    public Subscriber(Subject subject){
        this.subject = subject;
        // register itself to the subject
        this.subject.register(this);
    }
    @Override
    public void update(String msg){
        // get update from subject
        this.message = msg;
        // do something according to the update
    }
}
