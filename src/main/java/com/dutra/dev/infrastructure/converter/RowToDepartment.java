package com.dutra.dev.infrastructure.converter;

import com.dutra.dev.domain.model.Department;
import com.dutra.dev.infrastructure.persistence.relational.DepartmentRow;

public class RowToDepartment {

    public static Department convert(DepartmentRow row) {
        return new Department(
                row.getId(),
                row.getName(),
                RowToProduct.convert(row.getProducts())
        );
    }
}