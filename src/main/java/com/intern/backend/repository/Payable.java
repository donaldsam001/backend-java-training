package com.intern.backend.repository;

public interface Payable {
    boolean pay(double amount);
    String getPaymentMethod();
}
