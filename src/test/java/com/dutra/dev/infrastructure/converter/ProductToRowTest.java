package com.dutra.dev.infrastructure.converter;

import com.dutra.dev.domain.model.Department;
import com.dutra.dev.domain.model.Product;
import com.dutra.dev.infrastructure.persistence.relational.ProductRow;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class ProductToRowTest {

    private static final BigDecimal PRICE = new BigDecimal("200.00");
    private static final Department DEPARTMENT = getDepartment();

    @Test
    public void should_convert() {
        Product product = new Product(1, "Product One", PRICE, DEPARTMENT);
        ProductRow row = ProductToRow.convert(product);

        assertThat(row.getId()).isEqualTo(product.id());
        assertThat(row.getName()).isEqualTo(product.name());
        assertThat(row.getPrice()).isEqualTo(product.price());
        assertThat(row.getDepartment().getId()).isEqualTo(product.department().id());
    }

    @Test
    public void should_convert_List() {
        List<Product> products = List.of(new Product(1, "Product One", PRICE, DEPARTMENT));
        List<ProductRow> rows = ProductToRow.convert(products);

        assertThat(rows).hasSize(1);
        assertThat(rows.get(0).getId()).isEqualTo(products.get(0).id());
        assertThat(rows.get(0).getName()).isEqualTo(products.get(0).name());
        assertThat(rows.get(0).getPrice()).isEqualTo(products.get(0).price());
        assertThat(rows.get(0).getDepartment().getId()).isEqualTo(products.get(0).department().id());
    }

    private static Department getDepartment() {
        Department department = new Department(1, "Department", List.of());
        Product product = new Product(1, "Product One", PRICE, department);
        department.setProducts(List.of(product));

        return department;
    }
}