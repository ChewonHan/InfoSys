package problemset1a;

import java.util.Date;

// static keyword --> set attribute/ method to class attribute/ method
class Account {

    private int id; // when should i use Integer and int -> int is for declaring variable/ Integer is for indicating the data type
    private static double balance;
    private static double annualInterestRate = 0; // static = sharing the same value
    private Date dateCreated = new Date(); // whenever the user creates it works

//    public static void main(String[] args) throws InterruptedException {
//        Account acc = new Account(); // invoke no-arg constructor
//        Thread.sleep(5000);
//        Account acc2 = new Account(5,32.0);// invoke arg constructor
//        System.out.println( acc.toString());
//        System.out.println( acc2.toString());
//    }

    Account() { // no-arg constructor
        /*id = 0;
        balance = 0; */

        this(0,0.0);
        /* invoke the other constructor:
         Account(int id, double balance */
    }

    Account(int id, double balance) {
        this.id = id; // this. -> to differentiate the arguments and new var; without it, it will check argument first
        this.balance = balance;
        dateCreated = new Date();
    } //method over-loading = make more than one the same methods

    public int getId() {
        return id; // no need this. -> no conflicting
    }

    public void setId(int newId){
        id = newId;
    }

    public static double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public static double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public static void setAnnualInterestRate(double annualInterestRate) {
        Account.annualInterestRate = annualInterestRate;
    }

    //accessor for date created
    public Date getDateCreated() {
        return dateCreated;
    }

    public static double getMonthlyInterestRate(){
        return getAnnualInterestRate() / 12.0;
    }

    public double getMonthlyInterest(){ // no need static -> it depends on my account -> not the same for everyone
        return getBalance() * getMonthlyInterestRate() / 100.0; // if have static then cannot access getter method
    }

    public void withdraw(double amount){ // data type = void
        setBalance( getBalance() - amount); // change the balance through setter and getter -> in the setter might have the unique logic
        // whenever wanna interact with the var -> use getter and setter
    }

    public void deposit(double amount) {
        setBalance( getBalance() + amount);
    }

    public String toString(){
        return ("id : " + id + "  balance : " + balance);
    }
}
