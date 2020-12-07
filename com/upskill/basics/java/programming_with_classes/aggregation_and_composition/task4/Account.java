package com.upskill.basics.java.programming_with_classes.aggregation_and_composition.task4;

public class Account {
    private static long startId = 0;
    private final long id;
    private final double balance;
    private boolean isOpen = true;

    public Account(double balance) {
        this.balance = balance;
        this.id = ++startId;
    }

    public long getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public String getStatus() {
        String status = isOpen ? "Открыт" : "Заблокирован";
        return String.format("Счёт № %d %s.", id, status);
    }

    public void block() {
        isOpen = false;
    }

    public void unlock() {
        isOpen = true;
    }
}
