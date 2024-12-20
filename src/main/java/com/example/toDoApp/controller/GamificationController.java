package com.example.toDoApp.controller;

import com.example.toDoApp.entity.Gamification;
import com.example.toDoApp.service.GamificationService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/gamification")
public class GamificationController {

    private final GamificationService gamificationService;

    public GamificationController(GamificationService gamificationService) {
        this.gamificationService = gamificationService;
    }

    @PostMapping
    public ResponseEntity<Gamification> addReward(@RequestBody Gamification reward) {
        return ResponseEntity.ok(gamificationService.addReward(reward));
    }

    @GetMapping("/user/{userId}")
    public ResponseEntity<List<Gamification>> getRewardsByUserId(@PathVariable Long userId) {
        return ResponseEntity.ok(gamificationService.getRewardsByUserId(userId));
    }

    @DeleteMapping("/{rewardId}")
    public ResponseEntity<Void> deleteReward(@PathVariable Long rewardId) {
        gamificationService.deleteReward(rewardId);
        return ResponseEntity.noContent().build();
    }
}
