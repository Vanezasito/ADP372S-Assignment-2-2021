package org.example.mySet;

import org.example.Customer;
import org.example.myMap.MyMap;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MySetTest {
    Customer customer = null;
    Customer vaneza = null;
    MySet mySet = new MySet();

    @BeforeEach
    void setUp() {
        customer = new Customer("001", "Espoir", "Dite", 69);
        vaneza = new Customer("002", "Vanessa", "Sito", 28);
    }

    @Test
    void createCustomer() {
        Boolean result = mySet.createCustomer(customer);
        assertTrue(result);
    }

    @Test
    void getCustomer() {
        mySet.createCustomer(customer);
        Customer result = mySet.getCustomer(customer.getId());
        assertEquals(result.getAge(), customer.getAge());
    }

    @Test
    void delete() {
        mySet.createCustomer(customer);
        mySet.delete(customer);
        Customer result = mySet.getCustomer(customer.getId());
        assertNull(result);

    }

    @Test
    void contains() {
        mySet.createCustomer(customer);
        Boolean result = mySet.contains(customer);
        assertTrue(result);
    }
}