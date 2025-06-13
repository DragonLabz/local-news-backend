package com.example.local_news_backend.repository;

import com.example.local_news_backend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}