package com.stock.joyas.model.repository;

import com.stock.joyas.model.User_model;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User_model, Long> {

}
