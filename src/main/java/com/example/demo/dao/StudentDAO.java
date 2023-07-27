package com.example.demo.dao;

import com.example.demo.entity.Student;

import java.lang.reflect.Array;
import java.util.List;

public interface StudentDAO {
    void save(Student student);
    Student findById(Integer id);
    List<Student> findAll();

    List<Student> findByLastName(String lastName);

    void update(Student student);

    void delete(Integer id);
}
