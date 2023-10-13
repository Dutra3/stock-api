package com.dutra.dev.infrastructure.converter;

import com.dutra.dev.domain.model.Department;
import com.dutra.dev.domain.model.Product;
import com.dutra.dev.infrastructure.persistence.relational.DepartmentRow;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class DepartmentToRowTest {

    private static final BigDecimal PRICE = new BigDecimal("200.00");
    private static final Product PRODUCT = getProduct();

    @Test
    public void should_convert() {
        Department department = new Department(1, "Department", List.of(PRODUCT));
        DepartmentRow row = DepartmentToRow.convert(department);

        assertThat(department.id()).isEqualTo(row.getId());
        assertThat(department.name()).isEqualTo(row.getName());
        assertThat(department.products().get(0).id()).isEqualTo(row.getProducts().get(0).getId());
    }

    private static Product getProduct() {
        Department department = new Department(1, "Department", List.of());
        Product product = new Product(1, "Product One", PRICE, department);
        department.setProducts(List.of(product));

        return product;
    }
}
