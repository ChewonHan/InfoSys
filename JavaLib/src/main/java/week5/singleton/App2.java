package week5.singleton;

public class App2 {
    private LogFile log = LogFile.getInstance();

    App2() { // constructor
        System.out.println("App1 is created: " + log);
    }

    public void doSomething(String something){
        log.INFO(something + " happen");
    }
}
