package com.intern.backend.service;

import com.intern.backend.repository.Payable;

public class BankPayment implements Payable {
    @Override
    public boolean pay(double amount) {
        if (amount < 0){
            throw new ArithmeticException();
        }
        System.out.println("Bank payment: " + amount);

        return true;
    }

    @Override
    public String getPaymentMethod(){
        return "BANK";
    }

    public boolean pay(double amount, double received) {
        return received >= amount;
    }

}
