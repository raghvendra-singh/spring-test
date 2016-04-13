package com.example;

/**
 * Created by raghvendra.s on 4/13/16.
 */
public class Employee {
    private int id;
    private String name;
    private Address address;
    public Employee(int id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }
    public void showEmployeeDetails() {
        System.out.println(id + " " + name + " ");
        System.out.println(address.toString());
    }
}
