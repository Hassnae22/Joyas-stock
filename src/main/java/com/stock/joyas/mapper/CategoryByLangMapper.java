package com.stock.joyas.mapper;

import com.stock.joyas.dto.CategoryByLangDTO;
import com.stock.joyas.model.CategoryByLang;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CategoryByLangMapper {

    CategoryByLangMapper INSTANCE = Mappers.getMapper(CategoryByLangMapper.class);

    CategoryByLangDTO entityToDto(CategoryByLang categoryByLang);

    CategoryByLang dtoToEntity(CategoryByLangDTO categoryByLangDTO);
}
