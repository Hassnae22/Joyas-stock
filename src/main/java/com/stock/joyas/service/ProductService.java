package com.stock.joyas.service;

import com.stock.joyas.dto.ProductDTO;

import java.util.List;

public interface ProductService {

    List<ProductDTO> getAllProducts();

    ProductDTO getProductById(Long productId);

    List<ProductDTO> getProductOutOfSold();

    List<ProductDTO> getProductByCategoryId(Long categoryId);

    List<ProductDTO> getProductByProviderId(Long providerId);

    ProductDTO saveProduct(ProductDTO productDto);


}
