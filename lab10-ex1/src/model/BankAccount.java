package model;

public abstract class BankAccount implements Comparable<BankAccount> {
    protected Client client;
    protected double balance;
    protected String accountNumber;

    public BankAccount(Client client, double balance, String accountNumber) {
        this.client = client;
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void setAccountNumber(String accountNumber) {
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
        return client.getName() + " / " + balance + " / " + accountNumber;
    }

    @Override
    public int compareTo(BankAccount bankAccount) {
        if(this.balance > bankAccount.balance) {
            return 1;
        } else if(this.balance == bankAccount.balance){
            return 0;
        } else {
            return -1;
        }
    }
}
