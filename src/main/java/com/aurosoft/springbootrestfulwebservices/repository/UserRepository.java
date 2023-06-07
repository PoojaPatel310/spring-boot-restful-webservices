package com.aurosoft.springbootrestfulwebservices.repository;

import com.aurosoft.springbootrestfulwebservices.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
