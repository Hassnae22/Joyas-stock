package com.stock.joyas.service;

import com.stock.joyas.dto.CategoryByLangDTO;

import java.util.List;

public interface CategoryService {

    List<CategoryByLangDTO> getAllcategories();

    List<CategoryByLangDTO> getCategoryById(Long categoryId);

    CategoryByLangDTO addCategory(CategoryByLangDTO categoryByLangDTO);
}
