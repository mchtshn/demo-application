package com.mucahit.rentacar.demoapplication.repository;

import com.mucahit.rentacar.demoapplication.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
