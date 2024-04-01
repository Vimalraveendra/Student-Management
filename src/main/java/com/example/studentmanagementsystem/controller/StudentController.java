package com.example.studentmanagementsystem.controller;

import com.example.studentmanagementsystem.entity.Student;
import com.example.studentmanagementsystem.studentServiceImp.StudentServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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
    @GetMapping("/students/new")
    public String createNewStudentForm(Model model){
        Student student = new Student();
        model.addAttribute("student",student);
        return"create_student";
    }
    @PostMapping("/students")
    public String saveNewStudent(
            @ModelAttribute("student") Student student){
            studentServiceImp.saveStudent(student);
            return "redirect:/students";
    }
    @GetMapping("/students/{id}")
    public String deleteStudent(@PathVariable Long id){
        System.out.println("id " + id);
        studentServiceImp.deleteStudentById(id);
        return "redirect:/students";
    }

}
