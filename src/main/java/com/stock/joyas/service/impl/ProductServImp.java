package com.stock.joyas.service.impl;

import com.stock.joyas.core.util.dictionary.LogDic;
import com.stock.joyas.dto.ProductDTO;
import com.stock.joyas.mapper.ProductMapper;
import com.stock.joyas.model.Product;
import com.stock.joyas.model.repository.ProductRepository;
import com.stock.joyas.service.ProductService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Log4j2
@Service
@Transactional
@RequiredArgsConstructor
public class ProductServImp implements ProductService {

    final ProductRepository productRepository;

    @Override
    public List<ProductDTO> getAllProducts() {
        log.traceEntry("get all products service");
        List<ProductDTO> allProducts = productRepository
                .findAll()
                .stream()
                .map(ProductMapper.INSTANCE::entityToDto)
                .toList();
        return log.traceExit(allProducts);
    }

    @Override
    public ProductDTO getProductById(Long productId) {
        log.traceEntry("get product by id service "+ LogDic.PARAM_ONE, productId );
        ProductDTO result = new ProductDTO();
        Optional<Product> product = productRepository.findById(productId);
        if(product.isPresent()){
            result = ProductMapper.INSTANCE.entityToDto(product.get());
        }
      return log.traceExit(result);
    }


    @Override
    public List<ProductDTO> getProductByProviderId(Long providerId) {
        log.traceEntry("get getProductByProviderId service "+ LogDic.PARAM_ONE, providerId);
        List<ProductDTO> allProducts = productRepository
                .findByProviderId(providerId)
                .stream()
                .map(ProductMapper.INSTANCE::entityToDto)
                .toList();
        return log.traceExit(allProducts);
    }

    @Override
    public List<ProductDTO> getProductByCategoryId(Long categoryId) {
        log.traceEntry("get getProductByCategoryId service "+ LogDic.PARAM_ONE, categoryId);
         List<ProductDTO> allProducts = productRepository
                .findByCategoryId(categoryId)
                .stream()
                .map(ProductMapper.INSTANCE::entityToDto)
                .toList();
        return log.traceExit(allProducts);

    }


    @Override
    public List<ProductDTO> getProductOutOfSold() {
        log.traceEntry("get getProductOutOfSold service");
        List<ProductDTO> allProducts = productRepository
                .getProductsOutOfStock()
                .stream()
                .map(ProductMapper.INSTANCE::entityToDto)
                .toList();
        return log.traceExit(allProducts);
    }


    @Override
    public ProductDTO saveProduct(ProductDTO productDto) {
        log.traceEntry("get saveProduct service");
        Product product = productRepository.save(ProductMapper.INSTANCE.dtoToEntity(productDto));
        //exception if the object is not inserted
        return log.traceExit(ProductMapper.INSTANCE.entityToDto(product));
    }
}
