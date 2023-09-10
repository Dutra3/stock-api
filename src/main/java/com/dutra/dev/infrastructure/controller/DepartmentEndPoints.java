package com.dutra.dev.infrastructure.controller;

import com.dutra.dev.domain.model.Department;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/departments")
public class DepartmentEndPoints {

    @GetMapping("/{id}")
    public ResponseEntity<Department> findById(@PathVariable Integer id) {
        return ResponseEntity.ok(new Department(1, "Department", new ArrayList<>()));
    }

    @GetMapping("/")
    public ResponseEntity<List<Department>> findAll() {
        return ResponseEntity.ok(List.of(new Department(1, "Department", new ArrayList<>())));
    }

    @PostMapping("/")
    public ResponseEntity<Department> save(@RequestBody Department department) {
        return ResponseEntity.ok(department);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Department> update(@PathVariable Integer id, @RequestBody Department department) {
        return ResponseEntity.ok(department);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {

    }
}