package com.upskill.basics.java.programming_with_classes.aggregation_and_composition.task4;

/*
4. Счета. Клиент может иметь несколько счетов в банке.
Учитывать возможность блокировки/разблокировки счета. Реализовать поиск и сортировку счетов.
Вычисление общей суммы по счетам. Вычисление суммы по всем счетам,
имеющим положительный и отрицательный балансы отдельно.
 */

public class Main {
    public static void main(String[] args) {
        Bank belarusBank = new Bank("БеларусБанк");

        Client petrov = new Client("Сергей", "Петров", "BM1927865");
        Client alekseev = new Client("Руслан", "Алексеев", "ВМ1456598");

        belarusBank.addNewClient(petrov);
        belarusBank.addNewClient(alekseev);

        petrov.openAccount(new Account(123.45));
        petrov.openAccount(new Account(565.88));
        petrov.openAccount(new Account(-50.01));
        petrov.openAccount(new Account(3010.09));

        alekseev.openAccount(new Account(234.56));
        alekseev.openAccount(new Account(-90.43));
        alekseev.openAccount(new Account(200.43));
        alekseev.openAccount(new Account(456.78));

        //Проверка статуса
        System.out.println("---Проверка статуса---");
        System.out.println(belarusBank.getClient(petrov.getPassportID()).getAccount(1).getStatus());
        belarusBank.getClient(petrov.getPassportID()).blockAccaunt(1);
        System.out.println(belarusBank.getClient(petrov.getPassportID()).getAccount(1).getStatus() + "\n");

        //Информация по счетам
        System.out.println("---Информация по счетам---");
        System.out.println(belarusBank.getClient(petrov.getPassportID()).getInformation());
        System.out.println(belarusBank.getClient(alekseev.getPassportID()).getInformation());

        //Сортировка по балансу
        System.out.println("---Сортировка по балансу----");
        belarusBank.getClient(petrov.getPassportID()).sortByBalance();
        System.out.println(belarusBank.getClient(petrov.getPassportID()).getInformation());
        belarusBank.getClient(alekseev.getPassportID()).sortByBalance();
        System.out.println(belarusBank.getClient(alekseev.getPassportID()).getInformation());

        //Общий баланс
        System.out.println("---Общий баланс---");
        System.out.println(petrov.toString() + ", общая сумма: " + petrov.getBalance());
        System.out.println(alekseev.toString() + ", общая сумма: " + alekseev.getBalance());
        System.out.println();

        //Положительный общий баланс
        System.out.println("---Положительный общий баланс---");
        System.out.println(petrov.toString() + ", положительный счет: " + petrov.getBalancePositiveAccounts());
        System.out.println(alekseev.toString() + ", положительный счет: " + alekseev.getBalancePositiveAccounts());
        System.out.println();

        //Отрицательный общий баланс
        System.out.println("---Отрицательный общий баланс---");
        System.out.println(petrov.toString() + ", отрицательный счет: " + petrov.getBalanceNegativeAccounts());
        System.out.println(alekseev.toString() + ", отрицательный счет: " + alekseev.getBalanceNegativeAccounts());
    }

}
