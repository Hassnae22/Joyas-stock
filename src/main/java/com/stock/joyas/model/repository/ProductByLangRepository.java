package com.stock.joyas.model.repository;

import com.stock.joyas.cons.LangCons;
import com.stock.joyas.model.CategoryByLang;
import com.stock.joyas.model.Product;
import com.stock.joyas.model.ProductBylang;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductByLangRepository extends JpaRepository<ProductBylang, Long> {

    List<ProductBylang>  findByLangCode(LangCons langCode);
}
