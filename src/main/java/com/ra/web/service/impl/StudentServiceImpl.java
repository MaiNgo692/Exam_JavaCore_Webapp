package com.ra.web.service.impl;

import com.ra.web.entity.StudentEntity;
import com.ra.web.repository.StudentRepository;
import com.ra.web.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentServiceImpl implements StudentService {
    private StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public List<StudentEntity> findAll() {
        return studentRepository.findAll();
    }

    @Override
    public List<StudentEntity> findByName(String name) {
        return studentRepository.findStudentEntitiesByStudentNameContainingIgnoreCase(name);
    }
}
