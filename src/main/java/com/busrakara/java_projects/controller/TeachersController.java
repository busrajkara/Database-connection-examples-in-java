package com.busrakara.java_projects.controller;

import com.busrakara.java_projects.entity.Teachers; // Teachers entity class
import com.busrakara.java_projects.service.TeachersService; // Teachers service class
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/teachers")
public class TeachersController {
    private final TeachersService teachersService;

    public TeachersController(TeachersService teachersService) {this.teachersService = teachersService;}

    @PostMapping("/create")
    public Boolean createTeacher(@RequestBody Teachers teacher) {
        return teachersService.createTeacher(teacher);
    }

    @GetMapping("/list")
    public List<Teachers> listTeachers() {
        return teachersService.listTeachers();
    }
}
