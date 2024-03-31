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
    @Override
    public List<Student> getAllStudents(){
        return studentRepository.findAll();
    }
    @Override
    public Student saveStudent(Student student){
        return null;
    }
    @Override
    public Student getStudentById(Long id){
        return null;
    }
    @Override
    public Student updateStudent(Student student){
        return null;
    }
    @Override
    public void deleteStudentById(Long id){
        System.out.println("hello");
    }
}
