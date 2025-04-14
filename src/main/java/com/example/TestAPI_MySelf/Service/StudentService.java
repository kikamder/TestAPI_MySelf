package com.example.TestAPI_MySelf.Service;

import com.example.TestAPI_MySelf.Entity.Student;
import org.springframework.boot.autoconfigure.security.SecurityProperties;

import java.util.List;

public interface StudentService {
    Student addData(Student student);
    Student getById(int id);
    List<Student> getAll();
    void deleteByID(int id);
    Student updateData(Student student);
}
