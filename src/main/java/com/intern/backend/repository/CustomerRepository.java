package com.intern.backend.repository;

import com.intern.backend.entity.Customer;

import javax.swing.text.html.Option;

public interface CustomerRepository {
    Customer findByEmail(String email);
    boolean existsByEmail(String email);
}
