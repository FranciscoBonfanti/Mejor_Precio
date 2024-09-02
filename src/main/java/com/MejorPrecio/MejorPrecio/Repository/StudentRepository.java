package com.MejorPrecio.MejorPrecio.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.MejorPrecio.MejorPrecio.Model.Student;

public interface StudentRepository extends MongoRepository<Student, Integer> {
}
