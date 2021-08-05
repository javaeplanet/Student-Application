package com.javaeplanet.project.service;

import com.javaeplanet.project.entity.Student;

import java.util.List;

public interface StudentService {
    public Integer saveStudent(Student student);

    public List<Student> getAllStudents();
    public Student getStudentById(Integer sno);

    public void deleteStudent(Integer sno);
}
