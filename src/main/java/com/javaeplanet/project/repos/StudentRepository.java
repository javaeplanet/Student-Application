package com.javaeplanet.project.repos;

import com.javaeplanet.project.entity.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student,Integer> {
}
