package com.stock.joyas.model.repository;

import com.stock.joyas.model.CategoryByLang;
import com.stock.joyas.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

    List<Product> findByCategoryId(Long categoryId);
    List<Product> findByProviderId(Long providerId);
    @Query("from Product as pr where pr.quantity = 0")
    Optional<Product> getProductsOutOfStock();


}
