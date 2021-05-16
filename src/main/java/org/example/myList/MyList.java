package org.example.myList;

import org.example.Customer;

import java.util.ArrayList;
import java.util.List;

public class MyList {
    List<Customer> customers = new ArrayList<>();
    public boolean createCustomer(Customer customer){
        return customers.add(customer);
    }
    public Customer getCustomer(String id){
        return customers.stream().filter(customer -> customer.getId().equals(id)).findAny().orElse(null);
    }
    public void deleteCustomer(String id){
        customers.removeIf(customer -> customer.getId().equals(id));
    }
    public void destroy(){
        customers.clear();
    }
    public List readAll(){
        return customers;
    }
}
