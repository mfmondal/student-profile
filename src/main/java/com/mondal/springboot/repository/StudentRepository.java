package com.mondal.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mondal.springboot.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{

}