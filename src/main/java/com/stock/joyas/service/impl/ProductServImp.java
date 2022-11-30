package com.stock.joyas.service.impl;

import com.stock.joyas.dto.ProductDTO;
import com.stock.joyas.model.repository.ProductRepository;
import com.stock.joyas.service.ProductService;

import java.util.List;

public class ProductServImp implements ProductService {

    final ProductRepository productRepository;

    @Override
    public List<ProductDTO> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public ProductDTO getProductById(Long productId) {
        return null;
    }

    @Override
    public List<ProductDTO> getProductOutOfSold() {
        return null;
    }

    @Override
    public List<ProductDTO> getProductByCategoryId(Long categoryId) {
        return null;
    }

    @Override
    public List<ProductDTO> getProductByProviderId(Long providerId) {
        return null;
    }

    @Override
    public ProductDTO saveProduct(ProductDTO productDto) {
        return null;
    }
}
