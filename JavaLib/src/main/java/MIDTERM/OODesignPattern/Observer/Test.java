package MIDTERM.OODesignPattern.Observer;

public class Test {
    public static void main(String[] args) {
        Topic topic50001 = new Topic();
        Subscriber scott = new Subscriber(topic50001);
        Subscriber roger = new Subscriber(topic50001);

        topic50001.postMessage("quiz tomorrow !!!");

        Subscriber man = new Subscriber(topic50001);
        topic50001.postMessage("hw due this wed !!");
    }
}
