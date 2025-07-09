package com.example.demo.repositories;

import com.example.demo.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

    // Define methods for CRUD operations on Student entities
    // For example:
    // List<Student> findAll();
    // Optional<Student> findById(Long id);
    // Student save(Student student);
    // void deleteById(Long id);
}
