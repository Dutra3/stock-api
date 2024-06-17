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
@Entity
@Table(name = "product")
public class ProductRow {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cod_product")
    private Integer id;

    @Column(name = "des_name")
    private String name;

    @Column(name = "num_price")
    private BigDecimal price;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cod_department")
    private DepartmentRow department;
}