package com.dutra.dev.infrastructure.persistence.repository;

import com.dutra.dev.infrastructure.persistence.relational.ProductRow;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<ProductRow, Integer> {


}
