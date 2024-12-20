package com.example.toDoApp.entity;

import lombok.*;
import jakarta.persistence.*;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    @Column(nullable = false, unique = true)
    private String username;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private int point = 0;

    @Column(nullable = false)
    private int taskFinished = 0;

    @Column(nullable = false)
    private int taskPending;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getPoints() {
        return point;
    }

    public void setPoints(int point) {
        this.point = point;
    }

    public int getTaskFinished() {
        return taskFinished;
    }

    public void setTaskFinished(int taskFinished) {
        this.taskFinished = taskFinished;
    }

    public int getTaskPending() {
        return taskPending;
    }

    public void setTaskPending(int taskPending) {
        this.taskPending = taskPending;
    }
}
