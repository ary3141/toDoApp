package com.example.toDoApp.service;

import com.example.toDoApp.entity.Habit;
import com.example.toDoApp.repository.HabitRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HabitService {

    private final HabitRepository habitRepository;

    public HabitService(HabitRepository habitRepository) {
        this.habitRepository = habitRepository;
    }

    public Habit createHabit(Habit habit) {
        return habitRepository.save(habit);
    }

    public List<Habit> getHabitsByUserId(Long userId) {
        return habitRepository.findByUserId(userId);
    }

    public Optional<Habit> getHabitById(Long habitId) {
        return habitRepository.findById(habitId);
    }

    public Habit updateHabit(Habit habit) {
        return habitRepository.save(habit);
    }

    public void deleteHabit(Long habitId) {
        habitRepository.deleteById(habitId);
    }
}

