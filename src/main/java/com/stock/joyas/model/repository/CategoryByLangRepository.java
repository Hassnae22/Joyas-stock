package com.stock.joyas.model.repository;

import com.stock.joyas.cons.LangCons;
import com.stock.joyas.model.CategoryByLang;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CategoryByLangRepository extends JpaRepository<CategoryByLang, Long> {

    List<CategoryByLang>  findByLangCode(LangCons langCode);
}
