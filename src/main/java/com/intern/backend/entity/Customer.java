package com.intern.backend.entity;

import java.time.LocalDateTime;

public class Customer extends Person {
    private LocalDateTime createdAt;
    private int loyaltyPoints;
    private Role role;

    public Customer(String id, String name, String phone, String email, LocalDateTime createdAt, int loyaltyPoints,
            Role role) {
        super(id, name, phone, email);
        this.createdAt = createdAt;
        this.loyaltyPoints = loyaltyPoints;
        this.role = role;
    }

    @Override
    public void displayInformation() {
        System.out.println("Customer: " + name + " " + loyaltyPoints);
    }
}
