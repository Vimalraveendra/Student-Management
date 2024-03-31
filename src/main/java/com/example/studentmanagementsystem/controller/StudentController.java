package com.example.studentmanagementsystem.controller;

import com.example.studentmanagementsystem.studentServiceImp.StudentServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class StudentController {
    @Autowired
    private StudentServiceImp studentServiceImp;
    @GetMapping("/students")
    public String getStudents(Model model){
      model.addAttribute("students",studentServiceImp.getAllStudents());
      return "students";
    }

}
