package com.stock.joyas.mapper;

import com.stock.joyas.dto.ProductDTO;
import com.stock.joyas.model.Product;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.Optional;

@Mapper
public interface ProductMapper {

    ProductMapper INSTANCE = Mappers.getMapper(ProductMapper.class);

    ProductDTO entityToDto (Product product);

    Product dtoToEntity (ProductDTO productDto);


}
