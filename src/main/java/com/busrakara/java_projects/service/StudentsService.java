package com.busrakara.java_projects.service;

import com.busrakara.java_projects.entity.Students;
import com.busrakara.java_projects.repository.StudentsRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentsService {
    private final StudentsRepository studentsRepository;

    public StudentsService(StudentsRepository studentsRepository) {
        this.studentsRepository = studentsRepository;
    }

    public boolean createStudens(Students students) {
        studentsRepository.save(students);

        return true;
    }

    public List<Students> listStudents() {
        return studentsRepository.findAll();
    }
}
