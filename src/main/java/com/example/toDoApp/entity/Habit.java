package com.example.toDoApp.entity;
import jakarta.persistence.*;

@Entity
@Table(name = "habits")
public class Habit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long habitId;

    @Column(nullable = false)
    private String name;

    private String description;

    @Column(nullable = false)
    private boolean isComplete; // Track whether the habit for the day is complete

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user; // Every habit belongs to a user

    // Getters and Setters
    public Long getHabitId() {
        return habitId;
    }

    public void setHabitId(Long habitId) {
        this.habitId = habitId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isComplete() {
        return isComplete;
    }

    public void setComplete(boolean isComplete) {
        this.isComplete = isComplete;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
