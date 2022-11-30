package com.stock.joyas.dto;

import com.stock.joyas.model.Product;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProviderDTO {

    private Long id;
    private String providerCode;
}
