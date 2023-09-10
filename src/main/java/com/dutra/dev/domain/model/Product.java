package com.dutra.dev.domain.model;

import java.math.BigDecimal;

public class Product {

    private Integer id;
    private String name;
    private BigDecimal price;
    private Department department;

    public Product(Integer id, String name, BigDecimal price, Department department) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.department = department;
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

    public BigDecimal price() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Department department() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}