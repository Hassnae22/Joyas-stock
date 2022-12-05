package com.stock.joyas.service;

import com.stock.joyas.dto.ProductDTO;

import java.util.List;

public interface ProductService {

    List<ProductDTO> getAllProducts();

    ProductDTO getProductById(Long productId);

    List<ProductDTO> getProductByProviderId(Long providerId);

    List<ProductDTO> getProductByCategoryId(Long categoryId);
    ProductDTO saveProduct(ProductDTO productDto);

    List<ProductDTO> getProductOutOfSold();








}
