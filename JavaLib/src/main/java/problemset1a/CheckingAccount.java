package problemset1a;

import java.util.Date;

public class CheckingAccount extends Account{

    public static void main(String[] args) {
        CheckingAccount myCheckAcc = new CheckingAccount(1024, 8000.0);
        myCheckAcc.deposit(2000);
        myCheckAcc.withdraw(15000);
        System.out.println(myCheckAcc.getBalance());
        myCheckAcc.withdraw(200);
        System.out.println(myCheckAcc.getBalance());
        myCheckAcc.deposit(7000);
        myCheckAcc.withdraw(200);
        System.out.println(myCheckAcc.getBalance());
    }

    CheckingAccount( int id, double balance){
        setId(id);
        setBalance(balance);
    }

    @Override
    public void withdraw(double amount) {
        if (getBalance() <= -5000){
            System.out.println("over limit");
        }
        else {
            setBalance( getBalance() - amount);
        }
    }
}
