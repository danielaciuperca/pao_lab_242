package collections.service;

import collections.model.*;

import java.util.*;

public class ListService {
    /*
        Collections Framework
        List<E>
     */
    public static void main(String[] args) {
        List<Account> accounts = new ArrayList<>();
        accounts.add(new DebitBankAccount(
                5000, "12345",
                "1111222233334444", 10000));
        accounts.add(new SavingsBankAccount(
                7000, "1111222233335555", 3));
        accounts.add(new SavingsBankAccount(
                9000, "1111777733335555", 6));

//        System.out.println(accounts.get(1));

        for(Account account : accounts) {
            System.out.println(account);
        }

//        accounts.remove(0);
//        accounts.clear();

        List<Account> newAccounts = new ArrayList<>();
        newAccounts.add(new DebitBankAccount(
                3000, "159874",
                "1111888833334444", 10000));
        newAccounts.add(new DebitBankAccount(
                7500, "1000236",
                "1111888833334444", 10000));
        accounts.addAll(newAccounts);

        System.out.println("Accounts with the new accounts:");
        accounts.forEach(account -> System.out.println(account));

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(Integer.valueOf("2"));

        Collections.sort(accounts);
        System.out.println("Accounts sorted by balance:");
        accounts.forEach(account -> System.out.println(account));
    }
}
