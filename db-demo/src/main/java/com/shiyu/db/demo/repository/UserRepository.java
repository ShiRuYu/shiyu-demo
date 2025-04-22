package com.shiyu.db.demo.repository;

import com.shiyu.db.demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}