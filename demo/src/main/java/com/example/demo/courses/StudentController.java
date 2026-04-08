package com.example.demo.courses;

import org.springframework.web.bind.annotation.*;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
@RequestMapping("/api/studentsfetch")
public class StudentController {
private static final Logger logger = LoggerFactory.getLogger(StudentController.class);

    private final StudentRepository studentRepo;

    public StudentController(StudentRepository studentRepo){
        this.studentRepo = studentRepo;
    }

    @GetMapping
    public List<Student> getAllStudents(){
        logger.info("Fetching all students");
        return studentRepo.findAll();
    }

    @PostMapping
    public Student createStudent(@RequestBody Student student){
        logger.info("Creating student: "+ student.getStudentName());
        return studentRepo.save(student);
    }
}