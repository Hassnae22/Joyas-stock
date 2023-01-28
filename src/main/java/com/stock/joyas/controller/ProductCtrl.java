package com.stock.joyas.controller;

import com.stock.joyas.core.util.dictionary.LogDic;
import com.stock.joyas.dto.ProductDTO;
import com.stock.joyas.service.impl.ProductServImp;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.ResponseEntity;
import org.springframework.web.ErrorResponse;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Log4j2
@RestController
@RequiredArgsConstructor
@RequestMapping("/products")
@Tag(name = "Product", description = "The product API")
public class ProductCtrl {
    private final ProductServImp productService;

    @Operation(summary = "Get all products", description = "Get all products", tags = "Product", responses = {
            @ApiResponse(responseCode = "200", description = "OK", content = @Content(array = @ArraySchema(schema = @Schema(implementation = ProductDTO.class)))),
            @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(schema = @Schema(implementation = ErrorResponse.class))),
            @ApiResponse(responseCode = "401", description = "Unauthorized", content = @Content(schema = @Schema(implementation = ErrorResponse.class))),
            @ApiResponse(responseCode = "404", description = "Not Found", content = @Content(schema = @Schema(implementation = ErrorResponse.class))),
            @ApiResponse(responseCode = "500", description = "Bad GATEWAY", content = @Content(schema = @Schema(implementation = ErrorResponse.class)))
    })
    @GetMapping
    public ResponseEntity<List<ProductDTO>> getAllProducts(){
        log.traceEntry("enter to get all products controller method");
        return log.traceExit(ResponseEntity.ok().body(productService.getAllProducts()));
    }

    @Operation(summary = "Get product by id", description = "Get product by id", tags = "Product", responses = {
            @ApiResponse(responseCode = "200", description = "OK", content = @Content(schema = @Schema(implementation = ProductDTO.class))),
            @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(schema = @Schema(implementation = ErrorResponse.class))),
            @ApiResponse(responseCode = "401", description = "Unauthorized", content = @Content(schema = @Schema(implementation = ErrorResponse.class))),
            @ApiResponse(responseCode = "404", description = "Not Found", content = @Content(schema = @Schema(implementation = ErrorResponse.class))),
            @ApiResponse(responseCode = "500", description = "Bad GATEWAY", content = @Content(schema = @Schema(implementation = ErrorResponse.class)))
    })
    @GetMapping("/{product_id}")
    public ResponseEntity<ProductDTO> getProductById(@PathVariable("product_id") Long productId){
        log.traceEntry("enter to getProductById controller method "+ LogDic.PARAM_ONE, productId);
        return log.traceExit(ResponseEntity.ok().body(productService.getProductById(productId)));
    }

    @Operation(summary = "Get products by provider", description = "Get products by provider", tags = "Product", responses = {
            @ApiResponse(responseCode = "200", description = "OK", content = @Content(array = @ArraySchema(schema = @Schema(implementation = ProductDTO.class)))),
            @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(schema = @Schema(implementation = ErrorResponse.class))),
            @ApiResponse(responseCode = "401", description = "Unauthorized", content = @Content(schema = @Schema(implementation = ErrorResponse.class))),
            @ApiResponse(responseCode = "404", description = "Not Found", content = @Content(schema = @Schema(implementation = ErrorResponse.class))),
            @ApiResponse(responseCode = "500", description = "Bad GATEWAY", content = @Content(schema = @Schema(implementation = ErrorResponse.class)))
    })
    @GetMapping("/provider/{provider_id}")
    public ResponseEntity<List<ProductDTO>> getProductsByProvider(@PathVariable("provider_id") Long provider_id){
        log.traceEntry("enter to getProductsByProvider controller method "+ LogDic.PARAM_ONE, provider_id);
        return log.traceExit(ResponseEntity.ok().body(productService.getProductByProviderId(provider_id)));
    }

    @Operation(summary = "Get products by category", description = "Get products by category", tags = "Product", responses = {
            @ApiResponse(responseCode = "200", description = "OK", content = @Content(array = @ArraySchema(schema = @Schema(implementation = ProductDTO.class)))),
            @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(schema = @Schema(implementation = ErrorResponse.class))),
            @ApiResponse(responseCode = "401", description = "Unauthorized", content = @Content(schema = @Schema(implementation = ErrorResponse.class))),
            @ApiResponse(responseCode = "404", description = "Not Found", content = @Content(schema = @Schema(implementation = ErrorResponse.class))),
            @ApiResponse(responseCode = "500", description = "Bad GATEWAY", content = @Content(schema = @Schema(implementation = ErrorResponse.class)))
    })
    @GetMapping("/category/{category_id}")
    public ResponseEntity<List<ProductDTO>> getProductsByCategory(@PathVariable("category_id") Long category_id){
        log.traceEntry("enter to getProductsByCategory controller method "+LogDic.PARAM_ONE, category_id);
        return log.traceExit(ResponseEntity.ok().body(productService.getProductByCategoryId(category_id)));
    }

    @Operation(summary = "update product", description = "update product", tags = "Product", responses = {
            @ApiResponse(responseCode = "200", description = "OK", content = @Content(schema = @Schema(implementation = ProductDTO.class))),
            @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(schema = @Schema(implementation = ErrorResponse.class))),
            @ApiResponse(responseCode = "401", description = "Unauthorized", content = @Content(schema = @Schema(implementation = ErrorResponse.class))),
            @ApiResponse(responseCode = "404", description = "Not Found", content = @Content(schema = @Schema(implementation = ErrorResponse.class))),
            @ApiResponse(responseCode = "500", description = "Bad GATEWAY", content = @Content(schema = @Schema(implementation = ErrorResponse.class)))
    })
    @PostMapping("/update")
     public ResponseEntity<ProductDTO> updateProduct(@RequestBody ProductDTO productDTO){
        log.traceEntry("enter to updateProduct controller method "+LogDic.PARAM_ONE, productDTO);
        //to be changed from return null to return servicemetjod.update
        return log.traceExit(ResponseEntity.ok().body(null));
     }

    @Operation(summary = "save new product", description = "save new product", tags = "Product", responses = {
            @ApiResponse(responseCode = "200", description = "OK", content = @Content(schema = @Schema(implementation = ProductDTO.class))),
            @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(schema = @Schema(implementation = ErrorResponse.class))),
            @ApiResponse(responseCode = "401", description = "Unauthorized", content = @Content(schema = @Schema(implementation = ErrorResponse.class))),
            @ApiResponse(responseCode = "404", description = "Not Found", content = @Content(schema = @Schema(implementation = ErrorResponse.class))),
            @ApiResponse(responseCode = "500", description = "Bad GATEWAY", content = @Content(schema = @Schema(implementation = ErrorResponse.class)))
    })
     @PostMapping("/save")
     public ResponseEntity<ProductDTO> saveProduct(@RequestBody ProductDTO productDTO) {
         log.traceEntry("enter to saveProduct controller method "+LogDic.PARAM_ONE, productDTO);
        return  log.traceExit(ResponseEntity.ok().body(productService.saveProduct(productDTO)));
     }

    @Operation(summary = "Get products out of stock", description = "Get products out of stock", tags = "Product", responses = {
            @ApiResponse(responseCode = "200", description = "OK", content = @Content(array = @ArraySchema(schema = @Schema(implementation = ProductDTO.class)))),
            @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(schema = @Schema(implementation = ErrorResponse.class))),
            @ApiResponse(responseCode = "401", description = "Unauthorized", content = @Content(schema = @Schema(implementation = ErrorResponse.class))),
            @ApiResponse(responseCode = "404", description = "Not Found", content = @Content(schema = @Schema(implementation = ErrorResponse.class))),
            @ApiResponse(responseCode = "500", description = "Bad GATEWAY", content = @Content(schema = @Schema(implementation = ErrorResponse.class)))
    })
     @GetMapping("/outOfStock")
     public ResponseEntity<List<ProductDTO>> getProductsOutOfStock(){
         log.traceEntry("enter to getProductsOutOfStock controller method ");
        return log.traceExit(ResponseEntity.ok().body(productService.getProductOutOfSold()));
     }
}
