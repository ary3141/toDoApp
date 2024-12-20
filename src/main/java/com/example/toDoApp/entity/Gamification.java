package com.example.toDoApp.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "gamifications")
public class Gamification {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long rewardId;

    @Column(nullable = false)
    private int points; // Points awarded for a task or milestone

    @Column(nullable = false)
    private String reason; // Reason for the reward

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user; // User who receives the points

    // Getters and Setters
    public Long getRewardId() {
        return rewardId;
    }

    public void setRewardId(Long rewardId) {
        this.rewardId = rewardId;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
