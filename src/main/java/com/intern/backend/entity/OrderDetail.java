package com.intern.backend.entity;

import lombok.Builder;

@Builder
public class OrderDetail {
    private long id;
    private Orders orders;
    private Product product;
    private int quantity;
    private Double unitPrice;
    private Double subtotal;
}
