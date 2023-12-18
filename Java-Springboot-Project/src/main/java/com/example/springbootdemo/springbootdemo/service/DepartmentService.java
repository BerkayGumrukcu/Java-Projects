package com.example.springbootdemo.springbootdemo.service;

import com.example.springbootdemo.springbootdemo.model.Department;
import com.example.springbootdemo.springbootdemo.model.Employee;

import java.util.List;

public interface DepartmentService {
    public Department depSave(Department D);

    public List<Department> getDepartments();

    public Department getDepartmentById(String id);

    public String deleteDepById(String id);
}

