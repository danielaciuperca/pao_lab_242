package main;

import model.*;
import service.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ClientService clientService1 = ClientService.getInstance();
        ClientService clientService2 = ClientService.getInstance();

        BankAccountService bankAccountService = new BankAccountService(ClientService.getInstance());
        List<BankAccount> bankAccounts = bankAccountService.getBankAccounts();

        System.out.println("Number of bank accounts for test@gmail.com: " +
                bankAccountService.getNumberOfBankAccountsForEmail(bankAccounts, "test@gmail.com"));

        bankAccountService.printUniqueClientDetails(bankAccounts);

        bankAccountService.printSavingsBankAccountsByBalance(bankAccounts);
    }


}
