package com.example.demo.repository;

import com.example.demo.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource
public interface StudentRepository extends JpaRepository<Student, Long>
{
    // Notice, there are no methods here, but we still can use all those, which we inherit from JpaRepository
}
