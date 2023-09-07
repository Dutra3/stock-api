package com.dutra.dev.domain.model;

import java.util.List;

public class Department {

    private Long id;
    private String name;
    private List<Product> products;

    public Long id() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String name() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Product> products() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}