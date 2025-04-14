package com.example.TestAPI_MySelf.Repository;

import com.example.TestAPI_MySelf.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student , Integer> {
}
