package com.example.TestAPI_MySelf.Controller;

import com.example.TestAPI_MySelf.Entity.Student;
import com.example.TestAPI_MySelf.Repository.StudentRepository;
import com.example.TestAPI_MySelf.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {
    private StudentService studentService;

    @Autowired
    public UserController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping("/users")
    public Student saveData(@RequestBody Student student) {
        student.setId(0);
        return studentService.addData(student);

    }

    @GetMapping("/users/{id}")
    public Student getDataById(@PathVariable int id) {
        Student result = studentService.getById(id);
        if (result == null) {
            throw new RuntimeException("Not found student ID " + id);
        }
        return result;
    }

    @GetMapping("/users")
    public List<Student> getAll() {
        return studentService.getAll();

    }

    @DeleteMapping("/users/{id}")
    public String deleteById (@PathVariable int id ) {
        Student result = studentService.getById(id);
        if(result == null) {
            throw new RuntimeException("Not found Student ID " + id);
        }else studentService.deleteByID(id);
        return "Student ID " + id + " has been delete";
    }

    @PutMapping("/users")
    public Student updateData(@RequestBody Student student) {
        return studentService.updateData(student);
    }



}
