package com.stock.joyas.model.repository;

import com.stock.joyas.model.CategoryByLang;
import com.stock.joyas.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
