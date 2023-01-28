package com.stock.joyas.mapper;

import com.stock.joyas.dto.ProviderDTO;
import com.stock.joyas.model.Provider;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ProviderMapper {

    ProviderMapper INSTANCE = Mappers.getMapper(ProviderMapper.class);

    ProviderDTO entityToDto (Provider provider);

    @Mapping(target = "products", ignore = true)
    Provider dtoToEntity (ProviderDTO providerDto);


}
