package com.example.farmfarm.Entity;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="product_catalog")
@NoArgsConstructor
@Getter
@Setter
public class ProductCategoryEntity {
    @Id
    @GeneratedValue
    @Column(name = "c_id")
    private Long cId;

    private String name;

    @Builder
    public ProductCategoryEntity(Long cId, String name) {
        this.cId = cId;
        this.name = name;
    }
}
