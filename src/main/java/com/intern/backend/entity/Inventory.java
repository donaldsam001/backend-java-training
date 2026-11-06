package com.intern.backend.entity;

import java.time.LocalDateTime;

public class Inventory {
    private long id;
    private Product product;
    private int quantity;
    private int minStockLevel;
    private LocalDateTime updatedAt;

    public Inventory(long id, Product product, int quantity, int minStockLevel, LocalDateTime updatedAt) {
        this.id = id;
        this.product = product;
        this.quantity = quantity;
        this.minStockLevel = minStockLevel;
        this.updatedAt = updatedAt;
    }

    public int getQuantity(long id) {
        return quantity;
    }
}
