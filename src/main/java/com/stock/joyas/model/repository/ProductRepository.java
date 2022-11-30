package com.stock.joyas.model.repository;

import com.stock.joyas.model.CategoryByLang;
import com.stock.joyas.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {

    List<Product> findByCategoryId(Long categoryId);
}
