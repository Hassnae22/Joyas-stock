package com.stock.joyas.model;

import com.stock.joyas.cons.LangCons;
import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "PRODUCT_X_LANG")
public class ProductBylang {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private LangCons langCode;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;


}
