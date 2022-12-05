package com.stock.joyas.service.impl;

import com.stock.joyas.dto.ProductDTO;
import com.stock.joyas.mapper.ProductMapper;
import com.stock.joyas.model.Product;
import com.stock.joyas.model.repository.ProductRepository;
import com.stock.joyas.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ProductServImp implements ProductService {

    final ProductRepository productRepository;

    @Override
    public List<ProductDTO> getAllProducts() {
        List<ProductDTO> allProducts = productRepository
                .findAll()
                .stream()
                .map(ProductMapper.INSTANCE::entityToDto)
                .toList();
        return allProducts;
    }

    @Override
    public ProductDTO getProductById(Long productId) {

      return ProductMapper.INSTANCE.entityToDto(productRepository.findById(productId).get());

    }


    @Override
    public List<ProductDTO> getProductByProviderId(Long providerId) {
        List<ProductDTO> allProducts = productRepository
                .findByProviderId(providerId)
                .stream()
                .map(ProductMapper.INSTANCE::entityToDto)
                .toList();
        return allProducts;
    }

    @Override
    public List<ProductDTO> getProductByCategoryId(Long categoryId) {
         List<ProductDTO> allProducts = productRepository
                .findByCategoryId(categoryId)
                .stream()
                .map(ProductMapper.INSTANCE::entityToDto)
                .toList();
        return allProducts;

    }


    @Override
    public List<ProductDTO> getProductOutOfSold() {
        List<ProductDTO> allProducts = productRepository
                .getProductsOutOfStock()
                .stream()
                .map(ProductMapper.INSTANCE::entityToDto)
                .toList();
        return allProducts;
    }


    @Override
    public ProductDTO saveProduct(ProductDTO productDto) {
        return ProductMapper.INSTANCE.entityToDto(productRepository.save(ProductMapper.INSTANCE.dtoToEntity(productDto)));
    }
}
