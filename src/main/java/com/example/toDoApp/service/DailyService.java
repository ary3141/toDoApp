package com.example.toDoApp.service;

import com.example.toDoApp.entity.Daily;
import com.example.toDoApp.repository.DailyRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DailyService {

    private final DailyRepository dailyRepository;

    public DailyService(DailyRepository dailyRepository) {
        this.dailyRepository = dailyRepository;
    }

    public Daily createDaily(Daily daily) {
        return dailyRepository.save(daily);
    }

    public List<Daily> getDailiesByUserId(Long userId) {
        return dailyRepository.findByUserId(userId);
    }

    public void deleteDaily(Long dailyId) {
        dailyRepository.deleteById(dailyId);
    }
}

