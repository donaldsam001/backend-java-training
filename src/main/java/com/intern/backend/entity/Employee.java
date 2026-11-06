package com.intern.backend.entity;

import java.time.LocalDateTime;

public class Employee extends Person {
    private double salary;
    private Role role;

    public Employee(String id, String name, String phone, String email, double salary, Role role) {
        super(id, name, phone, email);
        this.salary = salary;
        this.role = role;
    }

    @Override
    public void displayInformation() {
        System.out.println("Employee: " + name);
    }
}
