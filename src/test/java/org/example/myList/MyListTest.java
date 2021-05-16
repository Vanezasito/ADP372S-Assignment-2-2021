package org.example.myList;

import org.example.Customer;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/***
 * Test each method separatly.
 */
class MyListTest {
Customer customer = null;
MyList myList = new MyList();
    @Test
    void createCustomer() {
        customer = new Customer("010","Dikson","Balela",32);
        boolean result = myList.createCustomer(customer);
        assertTrue(result);
    }

    @Test
    void getCustomer() {
        customer = new Customer("010","Dikson","Balela",32);
        myList.createCustomer(customer);
        Customer result = myList.getCustomer(customer.getId());
        assertNotNull(result);
    }

    @Test
    void deleteCustomer() {
        customer = new Customer("010","Dikson","Balela",32);
        myList.createCustomer(customer);
        myList.deleteCustomer(customer.getId());
        Customer result = myList.getCustomer(customer.getId());
        assertNull(result);
    }

    @Test
    void destroy() {
        customer = new Customer("010","Dikson","Balela",32);
        myList.createCustomer(customer);
        myList.destroy();
        Customer result = myList.getCustomer(customer.getId());
        assertNull(result);
    }

    @Test
    void readAll() {
        customer = new Customer("010","Dikson","Balela",32);
        List result = myList.readAll();
        assertNotNull(result);
    }
}