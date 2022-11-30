package com.stock.joyas.dto;

import com.stock.joyas.cons.LangCons;
import com.stock.joyas.model.Category;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CategoryByLangDTO {

    private Long id;
    private String description;
    private LangCons langCode;
    private CategoryDTO category;
}
