package com.intern.backend.entity;

public abstract class Person {
    protected String id;
    protected String name;
    protected String phone;
    protected String email;

    public Person(String id, String name, String phone, String email) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    public abstract void displayInformation();

    public void introduce() {
        System.out.println("Name: " + name);
    }
}
