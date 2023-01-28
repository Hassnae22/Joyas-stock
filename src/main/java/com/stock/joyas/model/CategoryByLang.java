package com.stock.joyas.model;

import com.stock.joyas.cons.LangCons;
import lombok.*;


import jakarta.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "CATEGORY_X_LANG", indexes = @Index(name = "categoryLangIndex", columnList = "category_id, langCode", unique = true))
public class CategoryByLang {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @Enumerated(EnumType.STRING)
    private LangCons langCode;
    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;
}
