package com.mucahit.rentacar.demoapplication.controller;


import com.mucahit.rentacar.demoapplication.model.Student;
import com.mucahit.rentacar.demoapplication.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class MainController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/hello")
    public String greeting() {
        return "Hello spring boot";
    }

    @PostMapping("/hello")
    public String greeting2() {
        return "Hello spring boot from post method";
    }

    @PostMapping("/student")
    public Student saveStudent(@RequestBody Student student) {
        return studentService.save(student);
    }

    @GetMapping("/student")
    public ResponseEntity<Student> findById(@RequestParam int id) {

        Student student = studentService.getStudentById(id);
        if (student == null) {
            return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok().body(student);
        }

    }

}
