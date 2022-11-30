package com.stock.joyas.model.repository;

import com.stock.joyas.model.Category;
import com.stock.joyas.model.CategoryByLang;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
