package collections.model;

public abstract class Account implements Comparable<Account> {
    protected double balance;
    protected String accountNumber;

    public Account(double balance, String accountNumber) {
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    @Override
    public String toString() {
        return balance + " / " + accountNumber;
    }

    @Override
    public int compareTo(Account account) {
        if(this.balance > account.balance) {
            return 1;
        } else if(this.balance == account.balance){
            return 0;
        } else {
            return -1;
        }
    }
}
