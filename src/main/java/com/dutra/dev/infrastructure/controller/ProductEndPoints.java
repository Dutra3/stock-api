package com.dutra.dev.infrastructure.controller;

import com.dutra.dev.domain.model.Department;
import com.dutra.dev.domain.model.Product;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;

@RestController
@RequestMapping("/api/v1/products")
public class ProductEndPoints {

    @GetMapping("/{id}")
    public ResponseEntity<Product> findById(@PathVariable Integer id) {
        return ResponseEntity.ok(new Product(1, "Product", BigDecimal.TEN, new Department(1, "Department", null)));
    }

    @GetMapping("/")
    public ResponseEntity<List<Product>> findAll() {
        return ResponseEntity.ok(List.of(new Product(1, "Product", BigDecimal.TEN, new Department(1, "Department", null))));
    }

    @PostMapping("/")
    public ResponseEntity<Product> save(@RequestBody Product product) {
        return ResponseEntity.ok(product);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Product> update(@PathVariable Integer id, @RequestBody Product product) {
        return ResponseEntity.ok(product);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {

    }
}