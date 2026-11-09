package com.intern.backend.service;

import java.time.LocalDateTime;

import com.intern.backend.entity.Inventory;
import com.intern.backend.entity.Product;
import com.intern.backend.exception.InsufficientStockException;

public class InventoryService {

    public void reduceStock(Product product, int quantity) {
        // public Inventory(long id, Product product, int quantity, int minStockLevel,
        // LocalDateTime updatedAt) {
        LocalDateTime updatedAt = LocalDateTime.now();
        Inventory inventory = new Inventory(10001, product, 10, 5, updatedAt);
        if (inventory.getQuantity(product) < quantity) {
            throw new InsufficientStockException("Not enough products in stock.");
        }

        inventory.setQuantity(inventory.getQuantity(product) - quantity);
    }
}
