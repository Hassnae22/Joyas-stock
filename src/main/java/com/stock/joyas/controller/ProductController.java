package com.stock.joyas.controller;

import com.stock.joyas.core.util.dictionary.LogDic;
import com.stock.joyas.dto.ProductDTO;
import com.stock.joyas.service.impl.ProductServImp;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Log4j2
@RestController
@RequiredArgsConstructor
@RequestMapping("/products")
public class ProductController {
    private final ProductServImp productService;

    @GetMapping
    public ResponseEntity<List<ProductDTO>> getAllProducts(){
        log.trace("enter to get all products controller method");
        return log.traceExit(ResponseEntity.ok().body(productService.getAllProducts()));
    }

    @GetMapping("/{product_id}")
    public ResponseEntity<ProductDTO> getProductById(@PathVariable("product_id") Long productId){
        log.trace("enter to getProductById controller method "+ LogDic.PARAM_ONE, productId);
        return log.traceExit(ResponseEntity.ok().body(productService.getProductById(productId)));
    }

    @GetMapping("/provider/{provider_id}")
    public ResponseEntity<List<ProductDTO>> getProductsByProvider(@PathVariable("provider_id") Long provider_id){
        log.trace("enter to getProductsByProvider controller method "+ LogDic.PARAM_ONE, provider_id);
        return log.traceExit(ResponseEntity.ok().body(productService.getProductByProviderId(provider_id)));
    }

    @GetMapping("/category/{category_id}")
    public ResponseEntity<List<ProductDTO>> getProductsByCategory(@PathVariable("category_id") Long category_id){
        log.trace("enter to getProductsByCategory controller method "+LogDic.PARAM_ONE, category_id);
        return log.traceExit(ResponseEntity.ok().body(productService.getProductByCategoryId(category_id)));
    }

     public void updateProduct(@RequestBody ProductDTO productDTO){
         log.trace("enter to updateProduct controller method "+LogDic.PARAM_ONE, productDTO);
        log.traceExit();
     }

     @PostMapping("/save")
     public ResponseEntity<ProductDTO> saveProduct(@RequestBody ProductDTO productDTO) {
         log.trace("enter to saveProduct controller method "+LogDic.PARAM_ONE, productDTO);
        return  log.traceExit(ResponseEntity.ok().body(productService.saveProduct(productDTO)));
     }

     @GetMapping("/outOfStock")
     public ResponseEntity<List<ProductDTO>> getProductsOutOfStock(){
         log.trace("enter to getProductsOutOfStock controller method ");
        return log.traceExit(ResponseEntity.ok().body(productService.getProductOutOfSold()));
     }
}
