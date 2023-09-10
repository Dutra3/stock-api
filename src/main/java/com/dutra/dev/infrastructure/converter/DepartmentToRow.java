package com.dutra.dev.infrastructure.converter;

import com.dutra.dev.domain.model.Department;
import com.dutra.dev.infrastructure.persistence.relational.DepartmentRow;

public class DepartmentToRow {

    public static DepartmentRow convert(Department department) {
        return DepartmentRow.builder()
                .id(department.id())
                .name(department.name())
                .products(ProductToRow.convert(department.products()))
                .build();
    }
}