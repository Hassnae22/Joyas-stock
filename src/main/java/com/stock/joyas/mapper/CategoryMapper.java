package com.stock.joyas.mapper;

import com.stock.joyas.dto.CategoryDTO;
import com.stock.joyas.model.Category;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CategoryMapper {

    CategoryMapper INSTANCE = Mappers.getMapper(CategoryMapper.class);

    CategoryDTO entityToDto (Category category);

    @Mapping(target = "products", ignore = true)
    Category dtoToEntity (CategoryDTO categoryDTO);


}
