package com.IUStudents.Begin.Project;

import com.IUStudents.Begin.Project.entity.Department;

import java.util.List;

public interface DepartmentService {

  public Department saveDepartment(Department department);

 public List<Department> fetchDepartmentList();

   public Department fetchDepartmentById(Long departmentId);
}
