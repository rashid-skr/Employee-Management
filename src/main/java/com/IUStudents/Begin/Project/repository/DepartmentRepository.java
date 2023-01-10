package com.IUStudents.Begin.Project.repository;

import com.IUStudents.Begin.Project.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
