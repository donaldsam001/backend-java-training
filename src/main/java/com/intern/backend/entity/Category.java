package com.intern.backend.entity;

public class Category {
    private long id;
    private String name;
    private String description;
    private boolean active;

    public Category(long id, String name, String description, boolean active) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.active = active;
    }

    public void getCategory() {
        System.out.println("Name: " + name);
    }
}
