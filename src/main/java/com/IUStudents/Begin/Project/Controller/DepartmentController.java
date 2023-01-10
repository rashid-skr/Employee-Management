package com.IUStudents.Begin.Project.Controller;

import com.IUStudents.Begin.Project.DepartmentService;
import com.IUStudents.Begin.Project.entity.Department;
import com.IUStudents.Begin.Project.service.DepartmentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;
    @PostMapping("/departments")
    public Department saveDepartment(@RequestBody Department department){
        return departmentService.saveDepartment(department);
    }
    @GetMapping("/department")
 public List<Department> fetchDepartmentList(){
 return departmentService.fetchDepartmentList();

 }
@GetMapping("/department/{id}")
    public Department fetchDepartmentById(@PathVariable("id") Long departmentId){
        return departmentService.fetchDepartmentById(departmentId);
    }
}
