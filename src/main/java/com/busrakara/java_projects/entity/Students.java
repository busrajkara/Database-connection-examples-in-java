package com.busrakara.java_projects.entity;

import jakarta.persistence.*;

@Entity
/*
@Entity: Bu ek açıklama, Students sınıfının bir veritabanı tablosu ile eşleştiğini belirtir. Yani, bu sınıf veritabanında bir tabloya karşılık gelir.
 */
public class Students {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    private String name;
    private String surname;
    private Integer no;
    private Integer classNo;

    @Column(length = 2)
    private String branch;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
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

    public Integer getNo() {
        return no;
    }

    public void setNo(Integer no) {
        this.no = no;
    }

    public Integer getClassNo() {
        return classNo;
    }

    public void setClassNo(Integer classNo) {
        this.classNo = classNo;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }
}
