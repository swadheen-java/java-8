package com.learn.memory;

import java.util.Map;

public class CustomerRecordsClient {
    public static void main(String[] args) {
        CustomerRecords records = new CustomerRecords();

        records.addCustomer(new Customer("John"));
        records.addCustomer(new Customer("simon"));

        for(Customer next : records){
            System.out.println(next);

        }

    }
}
