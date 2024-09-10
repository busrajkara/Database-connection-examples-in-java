package com.busrakara.java_projects.controller;

import com.busrakara.java_projects.entity.Students;
import com.busrakara.java_projects.service.StudentsService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentsController {
    private final StudentsService studentsService;

    public StudentsController(StudentsService studentsService) {
        this.studentsService = studentsService;
    }

    @PostMapping("/create")
    public Boolean createStudents(@RequestBody Students students) {
        return studentsService.createStudens(students);
    }

    @GetMapping("/list")
    public List<Students> listStudents() {
        return studentsService.listStudents();
    }

}
