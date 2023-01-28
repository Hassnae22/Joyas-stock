package com.stock.joyas.service.impl;

import com.stock.joyas.dto.ProviderDTO;
import com.stock.joyas.mapper.ProviderMapper;
import com.stock.joyas.model.repository.ProviderRepository;
import com.stock.joyas.service.ProviderService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.List;

@Log4j2
@Service
@Transactional
@RequiredArgsConstructor
public class ProviderServImp implements ProviderService {

    final ProviderRepository providerRepository;

    @Override
    public List<ProviderDTO> getAllProviders() {
        log.traceEntry("get all providers service");
        List<ProviderDTO> providers = providerRepository
                .findAll()
                .stream()
                .map(ProviderMapper.INSTANCE::entityToDto)
                .toList();
        return log.traceExit(providers);
    }
}
