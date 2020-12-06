package com.upskill.basics.java.programming_with_classes.simplest_classes_and_objects.task8;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        CustomerHelp clients = new CustomerHelp("Клиенты", new ArrayList<>());

        clients.addCustomer("Иванов", "Иван", "Иванович",
                "Minsk", 12345, 12345678);
        clients.addCustomer("Петров", "Петр", "Петрович",
                "Moscow", 23456, 23456789);
        clients.addCustomer("Мишуть", "Алексей", "Иванович",
                "Tallinn", 34567, 34567891);
        clients.addCustomer("Козлов", "Александр", "Георгиевич",
                "Warsaw", 45678, 45678912);
        clients.addCustomer("Тихонов", "Руслан", "Константинович",
                "Brest", 56789, 56789123);

        System.out.println("Список покупателей в алфавитном порядке:");
        clients.sortName();
        for (int i = 0; i < clients.getBase().size(); i++) {
            System.out.println(clients.getBase().get(i));
        }

        System.out.println("\nСписок покупателей, у которых номер кредитной карточки находится в заданном интервале:");
        ArrayList<Customer> list = clients.getCustomerByCreditCardRange(11111, 99999);
        list.sort(Comparator.comparing(Customer::getCardNumber));
        if (list.size() == 0) {
            System.out.println("банковские карты не найдены");
        } else {
            for (Customer customer : list) {
                System.out.println(customer);
            }
        }
    }
}
