package com.ra.web.service;

import com.ra.web.entity.StudentEntity;

import java.util.List;

public interface StudentService {
    List<StudentEntity> findAll();
    List<StudentEntity> findByName(String name);
}
