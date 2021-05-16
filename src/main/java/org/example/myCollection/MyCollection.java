package org.example.myCollection;

import org.example.Customer;

import java.util.ArrayDeque;
import java.util.Collection;

public class MyCollection {
    private Collection<Customer> customers = new ArrayDeque<Customer>();

    public MyCollection() {
    }
    public boolean createCustomer(Customer customer){
        return customers.add(customer);
    }
    public Customer getCustomer(String id){
        for(Customer customer: customers){
            if(customer.getId().equals(id)){
                return customer;
            }
        }
      return null;
    }
    public Collection<Customer> getAll(){
        return customers;
    }
    public Customer getFirst(){
        return customers.stream().findFirst().orElse(null);
    }
    public void delete(){
         customers.clear();
    }
}
