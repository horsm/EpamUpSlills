package com.upskill.basics.java.programming_with_classes.simplest_classes_and_objects.task8;

import java.util.ArrayList;
import java.util.Comparator;

public class CustomerHelp {
    private String customersGroup;
    private ArrayList<Customer> base;

    CustomerHelp(String customersGroup, ArrayList<Customer> base) {
        this.customersGroup = customersGroup;
        this.base = base;
    }

    void sortName(){
        base.sort(Comparator.comparing(Customer::getLastName));
    }

    ArrayList<Customer> getCustomerByCreditCardRange(int min, int max){
        ArrayList<Customer> list = new ArrayList<>();
        for (Customer customer : this.base) {
            if ((customer.getCardNumber() > min) && (customer.getCardNumber() < max)) {
                list.add(customer);
            }
        }
        return list;
    }

    void addCustomer (String lastName, String firstName, String patronymic, String address, int cardNumber, int bankAccountNumber){
        this.base.add(new Customer(lastName, firstName, patronymic, address, cardNumber, bankAccountNumber));
    }

    ArrayList<Customer> getBase() {
        return base;
    }

    public void setBase(ArrayList<Customer> base) {
        this.base = base;
    }

    public String getCustomersGroup() {
        return customersGroup;
    }

    public void setCustomersGroup(String customersGroup) {
        this.customersGroup = customersGroup;
    }
}
