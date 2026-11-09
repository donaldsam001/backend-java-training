package com.intern.backend.entity;

public class Store {
    private static int totalProducts = 0;

    public Store(){
        totalProducts++;
    }

    public static int getTotalProducts(){
        return totalProducts;
    }

}
