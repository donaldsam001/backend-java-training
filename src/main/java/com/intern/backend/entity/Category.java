package com.intern.backend.entity;

import lombok.Builder;

@Builder
public class Category {
    private long id;
    private String name;
    private StringBuilder description;
    private boolean active;

    public Category(long id, String name, StringBuilder description, boolean active) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.active = active;
    }

    public void getCategory() {
        System.out.println("Name: " + name);
    }
}
