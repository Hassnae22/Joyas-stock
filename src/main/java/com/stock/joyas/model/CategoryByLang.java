package com.stock.joyas.model;

import com.stock.joyas.cons.LangCons;
import lombok.*;


import jakarta.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "CATEGORY_X_LANG")
public class CategoryByLang {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String description;

    @Enumerated(EnumType.STRING)
    private LangCons langCode;

    @ManyToOne()
    @JoinColumn(name = "category_id")
    private Category category;
}
