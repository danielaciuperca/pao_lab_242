package service;

import model.*;

import java.util.*;

public class BankAccountService {
    private static final Random RANDOM = new Random();
    private ClientService clientService;

    public BankAccountService(ClientService clientService) {
        this.clientService = clientService;
    }

    public List<BankAccount> getBankAccounts() {
        List<Client> clients = clientService.getClients();
        return List.of(
                new DebitBankAccount(clients.get(0), 7000, String.valueOf(RANDOM.nextInt(10)), String.valueOf(RANDOM.nextInt(16)), 1000),
                new DebitBankAccount(clients.get(1), 5400, String.valueOf(RANDOM.nextInt(10)), String.valueOf(RANDOM.nextInt(16)), 0),
                new DebitBankAccount(clients.get(2), 600, String.valueOf(RANDOM.nextInt(10)), String.valueOf(RANDOM.nextInt(16)), 2000),
                new DebitBankAccount(clients.get(3), 9300, String.valueOf(RANDOM.nextInt(10)), String.valueOf(RANDOM.nextInt(16)), 10000),
                new DebitBankAccount(clients.get(4), 400, String.valueOf(RANDOM.nextInt(10)), String.valueOf(RANDOM.nextInt(16)), 1000),
                new DebitBankAccount(clients.get(5), 37000, String.valueOf(RANDOM.nextInt(10)), String.valueOf(RANDOM.nextInt(16)), 1000),
                new SavingsBankAccount(clients.get(6), 55000, String.valueOf(RANDOM.nextInt(10)), 3),
                new SavingsBankAccount(clients.get(7), 30000, String.valueOf(RANDOM.nextInt(10)), 3),
                new SavingsBankAccount(clients.get(2), 12000, String.valueOf(RANDOM.nextInt(10)), 3),
                new SavingsBankAccount(clients.get(5), 486000, String.valueOf(RANDOM.nextInt(10)), 3),
                new SavingsBankAccount(clients.get(7), 78000, String.valueOf(RANDOM.nextInt(10)), 3),
                new SavingsBankAccount(clients.get(7), 4000, String.valueOf(RANDOM.nextInt(10)), 3),
                new SavingsBankAccount(clients.get(1), 9000, String.valueOf(RANDOM.nextInt(10)), 3)
        );
    }
}
