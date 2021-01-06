package com.mucahit.rentacar.demoapplication.service;

import com.mucahit.rentacar.demoapplication.model.Student;

public interface StudentService {

    Student save(Student student);

    Student getStudentById(int id);
}
