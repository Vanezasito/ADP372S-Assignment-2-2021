package org.example.myMap;

import org.example.Customer;
import org.example.myCollection.MyCollection;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class MyMapTest {
    Customer customer = null;
    Customer vaneza = null;
    MyMap myMap = new MyMap();
    @BeforeEach
    void setUp() {
        customer = new Customer("001","Espoir","Dite",69);
        vaneza = new Customer("002","Vanessa","Sito",28);
    }

    @Test
    void createCustomer() {
        Customer customer1 = myMap.createCustomer(customer);
        assertNull(customer1);
    }

    @Test
    void getCustomer() {
        myMap.createCustomer(customer);
        Customer customer1 = myMap.getCustomer(customer.getId());
        System.out.println(customer1);
    }

    @Test
    void getAll() {
        myMap.createCustomer(customer);
        Map<String, Customer> map = myMap.getAll();
        assertNotNull(map);
    }

    @Test
    void delete() {
        myMap.createCustomer(customer);
        myMap.delete();
        Customer customer1 = myMap.getCustomer(customer.getId());
        assertNull(customer1);
    }
}