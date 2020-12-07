package com.upskill.basics.java.programming_with_classes.aggregation_and_composition.task4;

import java.util.ArrayList;
import java.util.Comparator;

public class Client {
    private final String firstName;
    private final String lastName;
    private final String passportID;
    private final ArrayList<Account> accounts;

    Client(String firstName, String lastName, String passportID) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.passportID = passportID;
        accounts = new ArrayList<>();
    }

    public String getBalance() {
        double balance = 0;
        for (Account account : accounts) {
            balance += account.getBalance();
        }
        return String.format("%.2f рублей", balance);
    }

    public String getBalancePositiveAccounts() {
        double balance = 0;
        for (Account account : accounts) {
            if (account.getBalance() > 0) {
                balance += account.getBalance();
            }

        }
        return String.format("%.2f рублей", balance);
    }

    public String getBalanceNegativeAccounts() {
        double balance = 0;
        for (Account account : accounts) {
            if (account.getBalance() < 0) {
                balance += account.getBalance();
            }

        }
        return String.format("%.2f рублей", balance);
    }

    public void sortByBalance() {
        accounts.sort(Comparator.comparing(Account::getBalance));
    }

    public Account getAccount (long id) {
        for (Account client : accounts) {
            if (client.getId() == id) {
                return client;
            }
        }
        return null;
    }

    void openAccount (Account account) {
        accounts.add(account);
    }

    public void blockAccaunt (long id) {
        for (Account account : accounts) {
            if(account.getId() == id) {
                account.block();
            }
        }
    }

    public void unlockAccaunt (long id) {
        for (Account account : accounts) {
            if(account.getId() == id) {
                account.unlock();
            }
        }
    }

    public String getInformation () {
        StringBuilder information = new StringBuilder();
        for (Account account : accounts) {
            information.append(String.format("#%d, Счет: %.2f рублей, Состояние: %s\n", account.getId(), account.getBalance(), account.getStatus()));
        }
        return String.format("Клиент %s имеет счета:\n%s", toString(), information.toString());
    }

    public String getPassportID() {
        return passportID;
    }

    @Override
    public String toString() {
        return String.format("%s %s, Паспорт: %s", firstName, lastName, passportID);
    }
}
