package com.example.Eureka_server_2;

import jdk.jfr.DataAmount;
import lombok.Data;

import javax.persistence.*;
;
@Data
@Entity
@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private double price;

    public Product() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Product(Integer id, String name, double price) {
        this.id    = id;
        this.name  = name;
        this.price = price;
    }
}
