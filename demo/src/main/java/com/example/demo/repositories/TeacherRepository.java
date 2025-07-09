package com.example.demo.repositories;

import com.example.demo.models.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherRepository extends JpaRepository<Teacher, Integer> {
    // Define methods for CRUD operations on Teacher entities
    // For example:
    // List<Teacher> findAll();
    // Optional<Teacher> findById(Long id);
    // Teacher save(Teacher teacher);
    // void deleteById(Long id);
}
