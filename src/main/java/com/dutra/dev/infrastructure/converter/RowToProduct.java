package com.dutra.dev.infrastructure.converter;

import com.dutra.dev.domain.model.Product;
import com.dutra.dev.infrastructure.persistence.relational.ProductRow;

import java.util.List;
import java.util.stream.Collectors;

public class RowToProduct {

    public static List<Product> convert(List<ProductRow> rows) {
        return rows.stream()
                .map(RowToProduct::convert)
                .collect(Collectors.toList());
    }
    public static Product convert(ProductRow row) {
        return new Product(
                row.getId(),
                row.getName(),
                row.getPrice(),
                RowToDepartment.convert(row.getDepartment())
        );
    }
}