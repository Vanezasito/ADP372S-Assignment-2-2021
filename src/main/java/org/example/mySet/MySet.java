package org.example.mySet;

import org.example.Customer;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class MySet {
    private Set<Customer> customers = new HashSet<>();

    public boolean createCustomer(Customer customer) {
        return customers.add(customer);
    }

    public Customer getCustomer(String id) {
        return customers.stream().filter(customer -> customer.getId().equals(id)).findAny().orElse(null);
    }

    public void delete(Customer customer) {
        customers.remove(customer);
    }
    public Boolean contains(Customer customer){
        return customers.contains(customer);
    }
}
