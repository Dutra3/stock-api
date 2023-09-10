package com.dutra.dev.infrastructure.persistence.relational;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode
@Getter
@Setter
@ToString
@Table(name = "department")
public class DepartmentRow {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cod_department")
    private Integer id;

    @Column(name = "des_name")
    private String name;

    @OneToMany
    @JoinColumn(name = "cod_product")
    private List<ProductRow> products;
}