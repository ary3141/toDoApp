package com.example.toDoApp.controller;

import com.example.toDoApp.entity.Daily;
import com.example.toDoApp.service.DailyService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/dailies")
public class DailyController {

    private final DailyService dailyService;

    public DailyController(DailyService dailyService) {
        this.dailyService = dailyService;
    }

    @PostMapping
    public ResponseEntity<Daily> createDaily(@RequestBody Daily daily) {
        return ResponseEntity.ok(dailyService.createDaily(daily));
    }

    @GetMapping("/user/{userId}")
    public ResponseEntity<List<Daily>> getDailiesByUserId(@PathVariable Long userId) {
        return ResponseEntity.ok(dailyService.getDailiesByUserId(userId));
    }

    @DeleteMapping("/{dailyId}")
    public ResponseEntity<Void> deleteDaily(@PathVariable Long dailyId) {
        dailyService.deleteDaily(dailyId);
        return ResponseEntity.noContent().build();
    }
}
