package com.stock.joyas.model.repository;

import com.stock.joyas.model.CategoryByLang;
import com.stock.joyas.model.Provider;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface ProviderRepository extends JpaRepository<Provider, Long> {
    Optional<Provider> findByName(String name);
}
