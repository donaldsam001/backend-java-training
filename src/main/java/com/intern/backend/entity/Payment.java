package com.intern.backend.entity;

import java.time.LocalDateTime;

import com.intern.backend.enums.ProductStatus;
import lombok.Builder;

@Builder
public class Payment {
    private long id;
    private Category category;
    private String name;
    private StringBuilder description;
    private double price;
    private ProductStatus status;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
