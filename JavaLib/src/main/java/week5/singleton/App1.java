package week5.singleton;

public class App1 {
    private LogFile log = LogFile.getInstance();

    App1() { // constructor
        System.out.println("App1 is created: " + log);
    }

    public void registerUser(String username){
        log.INFO(username + " is registered");
    }
}
