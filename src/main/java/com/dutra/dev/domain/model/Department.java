package com.dutra.dev.domain.model;

import java.util.List;

public class Department {

    private Integer id;
    private String name;
    private List<Product> products;

    public Department(Integer id, String name, List<Product> products) {
        this.id = id;
        this.name = name;
        this.products = products;
    }

    public Integer id() {
        return id;
    }

    public void setId(Integer id) {
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