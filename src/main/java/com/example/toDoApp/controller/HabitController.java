package com.example.toDoApp.controller;

import com.example.toDoApp.entity.Habit;
import com.example.toDoApp.service.HabitService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/habits")
public class HabitController {

    private final HabitService habitService;

    public HabitController(HabitService habitService) {
        this.habitService = habitService;
    }

    @PostMapping
    public ResponseEntity<Habit> createHabit(@RequestBody Habit habit) {
        return ResponseEntity.ok(habitService.createHabit(habit));
    }

    @GetMapping("/user/{userId}")
    public ResponseEntity<List<Habit>> getHabitsByUserId(@PathVariable Long userId) {
        return ResponseEntity.ok(habitService.getHabitsByUserId(userId));
    }

    @GetMapping("/{habitId}")
    public ResponseEntity<Habit> getHabitById(@PathVariable Long habitId) {
        return habitService.getHabitById(habitId)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PutMapping("/{habitId}")
    public ResponseEntity<Habit> updateHabit(@PathVariable Long habitId, @RequestBody Habit habitDetails) {
        habitDetails.setHabitId(habitId);
        return ResponseEntity.ok(habitService.updateHabit(habitDetails));
    }

    @DeleteMapping("/{habitId}")
    public ResponseEntity<Void> deleteHabit(@PathVariable Long habitId) {
        habitService.deleteHabit(habitId);
        return ResponseEntity.noContent().build();
    }
}
