package com.intern.backend.entity;

import java.time.LocalDateTime;

public class Discount {
    private long id;
    private String code;
    private String type;
    private double value;
    private double minOrderAmount;
    private boolean active;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
}
