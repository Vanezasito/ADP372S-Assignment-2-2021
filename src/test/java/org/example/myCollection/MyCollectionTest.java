package org.example.myCollection;

import org.example.Customer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * This test class need to be tested each method separately.
 */

class MyCollectionTest {
     Customer customer = null;
     Customer vaneza = null;
     MyCollection myCollection = new MyCollection();
    @BeforeEach
    void setUp() {
        customer = new Customer("001","Espoir","Dite",69);
        vaneza = new Customer("002","Vanessa","Sito",28);
    }

    @Test
    void createCustomer() {
        boolean result = myCollection.createCustomer(customer);
        System.out.println(result);
        assertTrue(result);
    }

    @Test
    void getCustomer() {
        myCollection.createCustomer(customer);
        Customer customer1 = myCollection.getCustomer(customer.getId());
        System.out.println( customer1);
        assertEquals(customer.getName(),customer1.getName());
    }

    @Test
    void getFirst() {
        myCollection.createCustomer(customer);
        myCollection.createCustomer(vaneza);
        Customer customer1 = myCollection.getFirst();

        assertEquals(customer1.getId(),customer.getId());
    }

    @Test
    void delete() {
        myCollection.createCustomer(customer);
        myCollection.delete();
        assertNull(myCollection.getFirst());

    }
    @Test
    void getAll(){

    }
}