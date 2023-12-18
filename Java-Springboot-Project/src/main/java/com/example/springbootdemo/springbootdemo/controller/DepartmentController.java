package com.example.springbootdemo.springbootdemo.controller;

import com.example.springbootdemo.springbootdemo.model.Department;
import com.example.springbootdemo.springbootdemo.model.Employee;
import com.example.springbootdemo.springbootdemo.service.DepartmentService;
import com.example.springbootdemo.springbootdemo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/department")
public class DepartmentController {

    @Qualifier("departmentImplementation")
    @Autowired
    DepartmentService service;

    @PostMapping
    public Department save(@RequestBody Department D){
        return   service.depSave(D);
    }

    @GetMapping
    public List<Department> getAllDepartments(){
        return service.getDepartments();
    }

    @GetMapping("/{id}")
    public Department getDepartmentById(@PathVariable(name= "id") String id){
        return service.getDepartmentById(id);
    }

    @DeleteMapping("/{id}")
    public String deleteDepartmentById( @PathVariable String id){
        return service.deleteDepById(id);
    }

}