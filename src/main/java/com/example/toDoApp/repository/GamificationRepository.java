package com.example.toDoApp.repository;

import com.example.toDoApp.entity.Gamification;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GamificationRepository extends JpaRepository<Gamification, Long> {
    List<Gamification> findByUserId(Long userId);
}
