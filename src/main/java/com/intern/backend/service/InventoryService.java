package com.intern.backend.service;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.intern.backend.entity.Inventory;
import com.intern.backend.entity.Product;
import com.intern.backend.exception.InsufficientStockException;

public class InventoryService {

    private final Map<Long, Inventory> inventories = new HashMap<>();
    public void addInventory(Inventory inventory){
        inventories.put(inventory.getProduct().getId(), inventory);
    }

    private Inventory getInventory(Product product){
        Inventory inventory = inventories.get(product.getId());

        if (inventories == null){
            throw new IllegalArgumentException("Inventory not found for product.");
        }

        return inventory;
    }

    public void increaseStock(Product product, int quantity){
        if (quantity <= 0){
            throw new IllegalArgumentException("Quantity must be greater than zero.");
        }

        Inventory inventory = getInventory(product);
        LocalDateTime updatedAt = LocalDateTime.now();

        inventory.setQuantity(inventory.getQuantity()  + quantity);
        inventory.setUpdatedAt(LocalDateTime.now());
        System.out.println(inventory.getQuantity());
    }

    public void reduceStock(Product product, int quantity) {

        if (quantity <= 0){
            throw new IllegalArgumentException("Quantity must be greater than zero.");
        }
        LocalDateTime updatedAt = LocalDateTime.now();
        Inventory inventory = getInventory(product);
        if (inventory.getQuantity() < quantity) {
            throw new InsufficientStockException("Not enough products in stock.");
        }

        inventory.setQuantity(inventory.getQuantity() - quantity);
        inventory.setUpdatedAt(updatedAt);
        System.out.println(inventory.getQuantity());
    }

    public void findProductsWithLowStock(){
        for (Inventory inventory: inventories.values()){
            if (inventory.getQuantity() <= inventory.getMinStockLevel()){
                System.out.println( inventory.getProduct().getName()+ " is low(quantity: " + inventory.getQuantity() + ")" );
            }
        }
    }

    public void getList(){
        for (Inventory inventory: inventories.values()){
            System.out.println("Product: " + inventory.getProduct().getName() + " quantity: " +  inventory.getQuantity());
        }
    }
}
