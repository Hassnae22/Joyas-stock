package com.stock.joyas.controller;

import com.stock.joyas.dto.CategoryDTO;
import com.stock.joyas.dto.ProductDTO;
import com.stock.joyas.model.Product;
import com.stock.joyas.service.impl.ProductServImp;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/products")
public class ProductController {
    private final ProductServImp productService;

    @GetMapping
    public ResponseEntity<List<ProductDTO>> getAllProducts(){
        return ResponseEntity.ok().body(productService.getAllProducts());
    }

    @GetMapping("/{product_id}")
    public ResponseEntity<ProductDTO> getProductById(@PathVariable("product_id") Long productId){
        return ResponseEntity.ok().body(productService.getProductById(productId));
    }

    @GetMapping("/provider/{provider_id}")
    public ResponseEntity<List<ProductDTO>> getProductsByProvider(@PathVariable("provider_id") Long provider_id){
        return ResponseEntity.ok().body(productService.getProductByProviderId(provider_id));
    }

    @GetMapping("/category/{category_id}")
    public ResponseEntity<List<ProductDTO>> getProductsByCategory(@PathVariable("category_id") Long category_id){
        return ResponseEntity.ok().body(productService.getProductByCategoryId(category_id));
    }

     public void updateProduct(Product product){


     }

     @PostMapping("/save")
     public ResponseEntity<ProductDTO> saveProduct(@RequestBody ProductDTO productDTO) {

        return  ResponseEntity.ok().body(productService.saveProduct(productDTO));
     }

     @GetMapping("/outOfStock")
     public ResponseEntity<List<ProductDTO>> getProductsOutOfStock(){

        return ResponseEntity.ok().body(productService.getProductOutOfSold());
     }
}
