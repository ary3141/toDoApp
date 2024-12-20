package com.example.toDoApp.service;

import com.example.toDoApp.entity.Gamification;
import com.example.toDoApp.repository.GamificationRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GamificationService {

    private final GamificationRepository gamificationRepository;

    public GamificationService(GamificationRepository gamificationRepository) {
        this.gamificationRepository = gamificationRepository;
    }

    public Gamification addReward(Gamification gamification) {
        return gamificationRepository.save(gamification);
    }

    public List<Gamification> getRewardsByUserId(Long userId) {
        return gamificationRepository.findByUserId(userId);
    }

    public void deleteReward(Long rewardId) {
        gamificationRepository.deleteById(rewardId);
    }
}

