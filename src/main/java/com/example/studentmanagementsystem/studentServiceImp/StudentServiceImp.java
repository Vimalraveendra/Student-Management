package com.example.studentmanagementsystem.studentServiceImp;

import com.example.studentmanagementsystem.entity.Student;
import com.example.studentmanagementsystem.repository.StudentRepository;
import com.example.studentmanagementsystem.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentServiceImp implements StudentService {
    @Autowired
    private StudentRepository studentRepository;

    public List<Student> getAllStudents(){
        return null;
    }
    public Student saveStudent(Student student){
        return null;
    }
    public Student getStudentById(Long id){
        return null;
    }
    public Student updateStudent(Student student){
        return null;
    }

    public void deleteStudentById(Long id){
        System.out.println("hello");
    }
}
