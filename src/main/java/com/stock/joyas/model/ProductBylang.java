package com.stock.joyas.model;

import com.stock.joyas.cons.LangCons;
import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "PRODUCT_X_LANG")
public class ProductBylang {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;
    @Enumerated(EnumType.STRING)
    private LangCons langCode;
    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;


}
