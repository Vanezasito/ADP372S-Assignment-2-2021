package org.example.myMap;

import org.example.Customer;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class MyMap {
    private HashMap<String, Customer> customerMap = new HashMap<>();

    public MyMap() {

    }

    public Customer createCustomer(Customer customer){
        return customerMap.put(customer.getId(),customer);
    }
    public Customer getCustomer(String id){
        return customerMap.get(id);
    }
    public Map getAll(){
        return customerMap;
    }
    public void delete(){
        customerMap.clear();
    }
}
