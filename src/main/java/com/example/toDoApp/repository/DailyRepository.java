package com.example.toDoApp.repository;

import com.example.toDoApp.entity.Daily;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DailyRepository extends JpaRepository<Daily, Long> {
    List<Daily> findByUserId(Long userId);
}
