package com.stock.joyas.dto;

import com.stock.joyas.model.Category;
import com.stock.joyas.model.Image;
import com.stock.joyas.model.Provider;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class ProductDTO {

    private Long id;
    private Double price;
    private List<ImageDTO> images;
    private CategoryDTO category;
    private Integer quantity;
    private LocalDateTime createdAt;
    private LocalDateTime modifiedAt;
    private LocalDateTime deletedAt;
    private ProviderDTO provider;
}
