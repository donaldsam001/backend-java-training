package com.intern.backend.entity;

import java.time.LocalDateTime;

import com.intern.backend.enums.OrderStatus;

public class Orders {
    private long id;
    private Customer customer;
    private Employee employee;
    private double totalAmount;
    private double discountAmount;
    private double finalAmount;
    private OrderStatus staus;
    private LocalDateTime orderDate;

    public Orders(long id, Customer customer, Employee employee, double totalAmount,
            double discountAmount, double finalAmount,
            OrderStatus status, LocalDateTime orderDate) {
        this.id = id;
        this.customer = customer;
        this.employee = employee;
        this.totalAmount = totalAmount;
        this.discountAmount = discountAmount;
        this.finalAmount = finalAmount;
        this.staus = status;
        this.orderDate = orderDate;
    }

}
