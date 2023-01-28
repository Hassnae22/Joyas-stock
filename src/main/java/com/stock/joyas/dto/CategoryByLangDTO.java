package com.stock.joyas.dto;

import com.stock.joyas.cons.LangCons;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CategoryByLangDTO {

    private Long id;
    private String name;
    private LangCons langCode;
    private CategoryDTO category;
}
