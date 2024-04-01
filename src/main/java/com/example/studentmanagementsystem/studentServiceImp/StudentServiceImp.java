package com.example.studentmanagementsystem.studentServiceImp;

import com.example.studentmanagementsystem.entity.Student;
import com.example.studentmanagementsystem.exception.StudentNotFoundException;
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
        return studentRepository.save(student);
    }
    @Override
    public Student getStudentById(Long id){
        return studentRepository.findById(id).get();
    }
    @Override
    public Student updateStudent(Student student){
       return studentRepository.save(student);
    }
    @Override
    public void deleteStudentById(Long id){
        boolean exists = studentRepository.
                findById(id).isPresent();
                if(!exists){
                     new StudentNotFoundException("Student with " + id + " not found");
                }


        studentRepository.deleteById(id);
    }
}
