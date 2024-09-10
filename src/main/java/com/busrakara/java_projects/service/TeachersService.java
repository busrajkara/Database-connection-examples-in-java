package com.busrakara.java_projects.service;

import com.busrakara.java_projects.entity.Teachers;
import com.busrakara.java_projects.repository.TeachersRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeachersService {
    private final TeachersRepository teachersRepository;

    // BU KISMI CHATGPT YE SORDUM ANLMADIM
    // TODO:  constructor nedir, ne işe yarar, amaç ne
    public TeachersService(TeachersRepository teachersRepository) {
        this.teachersRepository = teachersRepository;
    }

    // burası create işleminin yapıldığın yer hiç problem değil
    public boolean createTeacher(Teachers teacher) {
        teachersRepository.save(teacher);
        return true;
    }

    // List işlemi kısmı
    public List<Teachers> listTeachers() {
        return teachersRepository.findAll();
    }
}
