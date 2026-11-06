package com.intern.backend.entity;

public abstract class Person {
    protected String id;
    protected String name;
    protected String phone;

    public Person(String id, String name, String phone) {
        this.id = id;
        this.name = name;
        this.phone = phone;
    }

    public abstract void displayInformation();

    public void introduce() {
        System.out.println("Name: " + name);
    }
}
