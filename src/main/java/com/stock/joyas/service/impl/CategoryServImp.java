package com.stock.joyas.service.impl;

import com.stock.joyas.dto.CategoryByLangDTO;
import com.stock.joyas.mapper.CategoryByLangMapper;
import com.stock.joyas.model.CategoryByLang;
import com.stock.joyas.model.repository.CategoryByLangRepository;
import com.stock.joyas.service.CategoryService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.List;

@Log4j2
@Service
@Transactional
@RequiredArgsConstructor
public class CategoryServImp implements CategoryService {

    final CategoryByLangRepository categoryByLangRepository;


    @Override
    public List<CategoryByLangDTO> getAllcategories() {
        log.traceEntry("get all categories service");
        List<CategoryByLangDTO> categoriesByLang = categoryByLangRepository
                .findAll()
                .stream()
                .map(CategoryByLangMapper.INSTANCE::entityToDto)
                .toList();
        return log.traceExit(categoriesByLang);
    }

    @Override
    public List<CategoryByLangDTO> getCategoryById(Long categoryId) {
        log.traceEntry("get category by Id, get gategory by all languages");
        List<CategoryByLangDTO> categoryByLangByCategoryId = categoryByLangRepository
                .getCategoriesLangByCategoryId(categoryId)
                .stream()
                .map(CategoryByLangMapper.INSTANCE::entityToDto)
                .toList();
        return log.traceExit(categoryByLangByCategoryId);
    }

    @Override
    public CategoryByLangDTO addCategory(CategoryByLangDTO categoryByLangDTO) {
        log.traceEntry("add new Category");
        CategoryByLang categoryByLang = categoryByLangRepository.save(CategoryByLangMapper.INSTANCE.dtoToEntity(categoryByLangDTO));
        //exception if the object is not inserted
        return log.traceExit(CategoryByLangMapper.INSTANCE.entityToDto(categoryByLang));
    }


}
