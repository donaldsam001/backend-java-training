package com.intern.backend.service;

import com.intern.backend.repository.Payable;

import javax.xml.transform.Source;
import java.sql.SQLOutput;

public class CashPayment implements Payable {
    @Override
    public boolean pay(double amount) {
        if (amount < 0){
            throw new ArithmeticException();
        }
        System.out.println("Cash payment: " + amount);

        return true;
    }

    @Override
    public String getPaymentMethod(){
        return "CASH";
    }

    public boolean pay(double amount, double received) {
        return received >= amount;
    }
}
