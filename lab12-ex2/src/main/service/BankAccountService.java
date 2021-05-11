package main.service;

import main.model.*;
import main.repository.*;

public class BankAccountService {
    private BankAccountRepository bankAccountRepository;

    public BankAccountService() {
        this.bankAccountRepository = new BankAccountRepository();
    }

    public BankAccount build(String bankAccountDetails) {
        String[] attributes = bankAccountDetails.split("/");
        String accountNumber = attributes[0];
        double balance = Double.valueOf(attributes[1]);
        BankAccountType type = BankAccountType.valueOf(attributes[2]);
        String cardNumber = attributes[3];
        return new BankAccount(accountNumber, balance, type, cardNumber);
    }
}
