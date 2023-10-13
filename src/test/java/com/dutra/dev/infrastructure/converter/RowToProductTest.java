package com.dutra.dev.infrastructure.converter;

import com.dutra.dev.domain.model.Product;
import com.dutra.dev.infrastructure.persistence.relational.DepartmentRow;
import com.dutra.dev.infrastructure.persistence.relational.ProductRow;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

import java.math.BigDecimal;
import java.util.List;

public class RowToProductTest {

    private static final BigDecimal PRICE = new BigDecimal("200.00");
    private static final DepartmentRow DEPARTMENT = new DepartmentRow();

    @Test
    public void should_convert() {
        ProductRow row = new ProductRow(1, "Product One", PRICE, DEPARTMENT);
        Product product = RowToProduct.convert(row);

        assertThat(product.id()).isEqualTo(row.getId());
        assertThat(product.name()).isEqualTo(row.getName());
        assertThat(product.price()).isEqualTo(row.getPrice());
        assertThat(product.department().id()).isEqualTo(row.getDepartment().getId());
    }

    @Test
    public void should_convert_List() {
        List<ProductRow> rows = List.of(new ProductRow(1, "Product One", PRICE, DEPARTMENT));
        List<Product> products = RowToProduct.convert(rows);

        assertThat(products).hasSize(1);
        assertThat(products.get(0).id()).isEqualTo(rows.get(0).getId());
        assertThat(products.get(0).name()).isEqualTo(rows.get(0).getName());
        assertThat(products.get(0).price()).isEqualTo(rows.get(0).getPrice());
        assertThat(products.get(0).department().id()).isEqualTo(rows.get(0).getDepartment().getId());
    }
}