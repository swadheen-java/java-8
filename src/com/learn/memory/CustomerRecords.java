package com.learn.memory;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CustomerRecords implements Iterable<Customer> {
    private Map<String,Customer> records;

    public CustomerRecords() {
        this.records = new HashMap<String, Customer>();
    }


    public void addCustomer(Customer c){
        this.records.put(c.getName(), c);
    }

    public Map<String, Customer> getCustomers(){
        return this.records; // returning reference to the map, the underlying map can be changed using this reference, not a good practice
    }

    @Override
    public Iterator<Customer> iterator() {
        return records.values().iterator();
    }
}
