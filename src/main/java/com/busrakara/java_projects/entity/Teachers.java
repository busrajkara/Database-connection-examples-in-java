package com.busrakara.java_projects.entity;

import jakarta.persistence.*;

@Entity
public class Teachers {

    // Primary Key  Öğrenci Tablosuna Benzer Oldu
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long teacherId;

    private String name;
    private String surname;

    @ManyToOne
    @JoinColumn(name = "course_id")
    private Courses courses;

    private Integer teacherNumber;
    private String title;

    public Long getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Long teacherId) {
        this.teacherId = teacherId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Courses getCourses() {
        return courses;
    }

    public void setCourses(Courses courses) {
        this.courses = courses;
    }

    public Integer getTeacherNumber() {
        return teacherNumber;
    }

    public void setTeacherNumber(Integer teacherNumber) {
        this.teacherNumber = teacherNumber;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}