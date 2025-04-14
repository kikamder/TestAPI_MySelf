package com.example.TestAPI_MySelf.Service;

import com.example.TestAPI_MySelf.Entity.Student;
import com.example.TestAPI_MySelf.Repository.StudentRepository;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceAction implements StudentService{
    private StudentRepository studentRepository;

    @Autowired
     public StudentServiceAction(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }
    @Override
    public Student addData(Student student) {
       return studentRepository.save(student);
    }

    @Override
    public Student getById(int id){
        Optional<Student> result = studentRepository.findById(id);
        Student data = null;
        if (result.isPresent()) {
            data = result.get();
        }else {
            throw new RuntimeException("Not found User ID = " + id + "Test for change");
        }
        return data;
    }

    @Override
    public List<Student> getAll() {

        return studentRepository.findAll();
    }

    @Override
    public void deleteByID(int id) {
        studentRepository.deleteById(id);
    }

    @Override
    public Student updateData(Student student) {

        return studentRepository.save(student);
    }
}
