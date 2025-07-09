package com.example.demo.controllers;

import com.example.demo.models.Student;
import com.example.demo.repositories.StudentRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/students")
public class StudentController {
    private final StudentRepository studentRepository;

    public StudentController(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }
    // This class will handle HTTP requests related to students
    // It will interact with the StudentRepository to perform CRUD operations

    // Example method to get all students
     @GetMapping
     public List<Student> getAllStudents() {
         return studentRepository.findAll();
     }

     @GetMapping("/{id}")
    public Optional<Student> getStudentById(@PathVariable int id) {
        return studentRepository.findById(id);
    }
    @PostMapping("/add")
    public Student addStudent(@RequestBody Student student) {
        return studentRepository.save(student);
    }
    @PutMapping("/{id}")
    public Student updateStudent(@PathVariable int id, @RequestBody Student student) {
        // Assuming the student object contains the updated data
        student.setId(id); // Set the ID to ensure the correct student is updated
        return studentRepository.save(student);
    }
    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable int id) {
        studentRepository.deleteById(id);
    }
    // Example method to add a new student
    // @PostMapping("/students")
    // public Student addStudent(@RequestBody Student student) {
    //     return studentRepository.save(student);
    // }
}
