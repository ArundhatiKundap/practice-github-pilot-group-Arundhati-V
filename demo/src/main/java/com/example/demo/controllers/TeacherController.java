package com.example.demo.controllers;

import com.example.demo.models.Teacher;
import com.example.demo.repositories.TeacherRepository;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import java.util.List;

@RestController
@RequestMapping("/teachers")
public class TeacherController {
    private final TeacherRepository teacherRepository;

    public TeacherController(TeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }
    // This class will handle HTTP requests related to teachers
    // For example, you can add methods to get a list of teachers, add a new teacher, etc.

    // Example method to get all teachers
    // @GetMapping("/teachers")
    // public List<Teacher> getAllTeachers() {
    //     return teacherService.getAllTeachers();
    // }

    // Example method to add a new teacher
    // @PostMapping("/teachers")
    // public Teacher addTeacher(@RequestBody Teacher teacher) {
    //     return teacherService.addTeacher(teacher);
    // }
    @GetMapping
    public List<Teacher> getAllTeachers() {
        return teacherRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Teacher> getTeacher(@PathVariable int id) {
        return teacherRepository.findById(id);
    }

    @PostMapping("/add")
    public Teacher addTeacher(@RequestBody Teacher teacher) {
        return teacherRepository.save(teacher);
    }

    @PutMapping("/{id}")
    public Teacher updateTeacher(@PathVariable int id, @RequestBody Teacher teacher) {
        teacher.setId(id);
        return teacherRepository.save(teacher);
    }

    @DeleteMapping("/{id}")
    public void deleteTeacher(@PathVariable int id) {
        teacherRepository.deleteById(id);
    }
}
