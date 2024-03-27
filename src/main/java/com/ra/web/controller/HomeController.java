package com.ra.web.controller;

import com.ra.web.entity.StudentEntity;
import com.ra.web.repository.StudentRepository;
import com.ra.web.service.impl.StudentServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("home")
public class HomeController {
    private StudentServiceImpl studentService;
    private StudentRepository studentRepository;

    public HomeController(StudentServiceImpl studentService, StudentRepository studentRepository) {
        this.studentService = studentService;
        this.studentRepository = studentRepository;
    }

    @GetMapping({"", "/index"})
    public String index (Model model){
        List<StudentEntity> students = studentService.findAll();
        if(students.size()!=0){
            model.addAttribute("data",students);
        }
        return "/home/index";
    }
}
