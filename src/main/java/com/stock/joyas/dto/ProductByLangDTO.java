package com.stock.joyas.dto;

import com.stock.joyas.cons.LangCons;
import com.stock.joyas.model.Product;
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
public class ProductByLangDTO {

    private Long id;
    private LangCons langCode;
    private ProductDTO product;
}
