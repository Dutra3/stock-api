package com.dutra.dev.infrastructure.controller;

import com.dutra.dev.domain.model.Product;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/products")
public class ProductEndPoint {

    @GetMapping("/{id}")
    public ResponseEntity<Product> findById(@PathVariable Integer id) {
        return ResponseEntity.ok(new Product());
    }

    @GetMapping("/")
    public ResponseEntity<List<Product>> findAll() {
        return ResponseEntity.ok(List.of(new Product()));
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
