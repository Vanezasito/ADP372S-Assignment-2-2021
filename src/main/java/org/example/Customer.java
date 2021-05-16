package org.example;

public class Customer {
    private String id;
    private String name;
    private String surName;
    private int age;

    public Customer(String id, String name, String surName, int age) {
        this.id = id;
        this.name = name;
        this.surName = surName;
        this.age = age;
    }
    public Customer(Customer customer) {
        this.id = customer.id;
        this.name = customer.name;
        this.surName = customer.surName;
        this.age = customer.age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", age=" + age +
                '}';
    }
}
