package com.example.Client_server;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface ProductInterface extends JpaRepository<Product, Long> {
    List<Product> findByName(String name);
    List<Product> findByRole(String role);
}
