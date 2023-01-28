package com.stock.joyas.model.repository;

import com.stock.joyas.cons.LangCons;
import com.stock.joyas.model.CategoryByLang;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CategoryByLangRepository extends JpaRepository<CategoryByLang, Long> {

    List<CategoryByLang> findByLangCode(LangCons langCode);

    @Query(value = "SELECT * FROM category_x_lang cat_lang WHERE cat_lang.category_id = ?1", nativeQuery = true)
    List<CategoryByLang> getCategoriesLangByCategoryId(Long categoryId);
}
