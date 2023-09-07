package com.dutra.dev.infrastructure.persistence.relational;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode
@Getter
@Setter
@ToString
@Table(name = "product")
public class ProductRow {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cod_product")
    private Long id;

    @Column(name = "des_name")
    private String name;

    @Column(name = "num_price")
    private BigDecimal price;

    @ManyToOne
    @JoinColumn(name = "cod_department")
    private DepartmentRow department;
}