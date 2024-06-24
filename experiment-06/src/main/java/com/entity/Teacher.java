package com.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public class Teacher {
    private int id;
    private String name;
    private Title title;
    private List<Course> courses;
    private LocalDateTime createdAt;

    public Teacher() {}
    public Teacher(int id, String name, Title title, List<Course> courses, LocalDateTime createdAt) {
        this.id = id;
        this.name = name;
        this.title = title;
        this.courses = courses;
        this.createdAt = createdAt;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Title getTitle() {
        return title;
    }

    public void setTitle(Title title) {
        this.title = title;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}
