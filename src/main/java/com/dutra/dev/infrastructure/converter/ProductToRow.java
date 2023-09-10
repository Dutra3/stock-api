package com.dutra.dev.infrastructure.converter;

import com.dutra.dev.domain.model.Product;
import com.dutra.dev.infrastructure.persistence.relational.ProductRow;

import java.util.List;
import java.util.stream.Collectors;

public class ProductToRow {

    public static List<ProductRow> convert(List<Product> products) {
        return products.stream()
                .map(ProductToRow::convert)
                .collect(Collectors.toList());
    }

    public static ProductRow convert(Product product) {
        return ProductRow.builder()
                .id(product.id())
                .name(product.name())
                .price(product.price())
                .department(DepartmentToRow.convert(product.department()))
                .build();
    }
}