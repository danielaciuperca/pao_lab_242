package collections.model;

public class DebitBankAccount extends Account {
    private String cardNumber;
    private double withdrawalLimit;

    public DebitBankAccount(double balance, String accountNumber, String cardNumber, double withdrawalLimit) {
        super(balance, accountNumber);
        this.cardNumber = cardNumber;
        this.withdrawalLimit = withdrawalLimit;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public double getWithdrawalLimit() {
        return withdrawalLimit;
    }

    public void setWithdrawalLimit(double withdrawalLimit) {
        this.withdrawalLimit = withdrawalLimit;
    }

    @Override
    public String toString() {
        return super.toString() + " / " + this.cardNumber + " / " + withdrawalLimit;
    }
}
