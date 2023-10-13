package com.dutra.dev.infrastructure.converter;

import com.dutra.dev.domain.model.Department;
import com.dutra.dev.infrastructure.persistence.relational.DepartmentRow;
import com.dutra.dev.infrastructure.persistence.relational.ProductRow;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class RowToDepartmentTest {

    @Test
    public void should_convert() {
        DepartmentRow row = new DepartmentRow(1, "Department", List.of(new ProductRow()));
        Department department = RowToDepartment.convert(row);

        assertThat(department.id()).isEqualTo(row.getId());
        assertThat(department.name()).isEqualTo(row.getName());
        assertThat(department.products().get(0).id()).isEqualTo(row.getProducts().get(0).getId());
    }
}
