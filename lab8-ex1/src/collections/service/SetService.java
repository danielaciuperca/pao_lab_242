package collections.service;

import collections.model.*;

import java.util.*;

public class SetService {
    /*
        Collections Framework
        Set<E>
            HashSet<E>
            LinkedHashSet<E>
            TreeSet<E>
     */
    public static void main(String[] args) {
        Set<String> cities = new HashSet<>();
        cities.add("Bucuresti");
        cities.add("Timisoara");
        cities.add("Brasov");
        cities.add("Bucuresti");
        cities.add("Cluj");

        cities.forEach(city -> System.out.println(city));

        Set<String> cities2 = new LinkedHashSet<>();
        cities2.add("Bucuresti");
        cities2.add("Timisoara");
        cities2.add("Brasov");
        cities2.add("Bucuresti");
        cities2.add("Cluj");

        System.out.println("Cities ordered by adding operation");
        cities2.forEach(city -> System.out.println(city));

        Set<String> cities3 = new TreeSet<>();
        cities3.add("Bucuresti");
        cities3.add("Timisoara");
        cities3.add("Brasov");
        cities3.add("Bucuresti");
        cities3.add("Cluj");

        System.out.println("Cities sorted by natural order");
        cities3.forEach(city -> System.out.println(city));

        Set<Account> accounts = new TreeSet<>();
        accounts.add(new DebitBankAccount(
                5000, "12345",
                "1111222233334444", 10000));
        accounts.add(new SavingsBankAccount(
                7000, "1111222233335555", 3));
        accounts.add(new SavingsBankAccount(
                9000, "1111777733335555", 6));
        System.out.println("Accounts sorted by balance");
        accounts.forEach(account -> System.out.println(account));
    }
}
