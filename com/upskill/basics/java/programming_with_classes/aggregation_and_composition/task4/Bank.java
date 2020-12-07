package com.upskill.basics.java.programming_with_classes.aggregation_and_composition.task4;

import java.util.ArrayList;

public class Bank {
    private final String name;
    private final ArrayList<Client> clients;

    Bank(String name) {
        this.name = name;
        this.clients = new ArrayList<>();
    }

    public Client getClient (String passportID) {
        for (Client person : clients) {
            if (person.getPassportID().equals(passportID)) {
                return person;
            }
        }
        return null;
    }

    public void addNewClient(Client client) {
        clients.add(client);
    }

    @Override
    public String toString() {
        return String.format("Банк %s имеет %d вкладчиков", name, clients.size());
    }
}
