package com.example;

import java.beans.Customizer;

public class Bank {

    private Customer[] customers;

    private int numberOfCustomers;

    public Bank(){
        customers = new Customer[10];
        numberOfCustomers = 0;
    }

    public void addCustomer(String isim, String soyisim){
        int i = numberOfCustomers++;
        customers[i] = new Customer(isim,soyisim);
    }

    public  int getNumberOfCustomers(){
        return numberOfCustomers;
    }

    public Customer getCustomer(int customer_index) {
        return customers[customer_index];
    }
}
