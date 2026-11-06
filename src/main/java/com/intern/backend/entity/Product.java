package com.intern.backend.entity;

import com.intern.backend.enums.ProductStatus;
import java.time.LocalDateTime;

// import lombok.experimental.FieldDefaults;

// @FieldDefaults(level = AccessLevel.PRIVATE)
public class Product {
    private long id;
    private Category category;
    private String name;
    private String description;
    private double price;
    private ProductStatus status;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public Product(
            long id,
            Category category,
            String name,
            String description,
            double price,
            ProductStatus status) {
        this.id = id;
        this.category = category;
        this.name = name;
        this.description = description;
        this.price = price;
        this.status = status;
        this.createdAt = LocalDateTime.now();
        this.updatedAt = LocalDateTime.now();
    }

    public void updatePrice(double price) {
        this.price = price;
        this.updatedAt = LocalDateTime.now();
    }

    // Getters and Setters
    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public ProductStatus getStatus() {
        return status;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }
}
