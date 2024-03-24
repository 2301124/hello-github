package report5;

public class Account {
    private String acccountID;
    private String password;
    private String accountName;
    private long balance;
    void deposit(int money) {
        balance += money;
    }
    void withdraw(int money) {
        balance -= money;
    }
    long getBalance() {
        return balance;
    }


}
