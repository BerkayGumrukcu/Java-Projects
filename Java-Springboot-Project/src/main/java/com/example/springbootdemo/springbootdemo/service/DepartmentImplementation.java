package com.example.springbootdemo.springbootdemo.service;

import com.example.springbootdemo.springbootdemo.error.EmployeeNotFoundException;
import com.example.springbootdemo.springbootdemo.model.Department;
import com.example.springbootdemo.springbootdemo.model.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class DepartmentImplementation implements DepartmentService {
    List<Department> depList = new ArrayList<>();

    @Override
    public Department depSave(Department D) {
        if (D.getDepid() == null || D.getDepName().isEmpty()) {
            D.setDepid(UUID.randomUUID().toString());
        }
        depList.add(D);
        return D;
    }

    @Override
    public List<Department> getDepartments() {
        return depList;
    }

    @Override
    public Department getDepartmentById(String id) {
        Department d = depList
                .stream()
                .filter(t -> t.getDepid().equalsIgnoreCase(id))
                .findFirst()
                .orElseThrow(
                        () ->
                                new EmployeeNotFoundException("there is no " +
                                        "mathcing Record with id  :" + id));
        return d;
    }

    @Override
    public String deleteDepById(String id) {
        Department d = depList
                .stream()
                .filter(t -> t.getDepid().equalsIgnoreCase(id))
                .findFirst()
                .orElseThrow(
                        () ->
                                new EmployeeNotFoundException("there is no " +
                                        "mathcing Record with id  :" + id));
        depList.remove(d);
        return "the Employee Record with id :" + id + " is DELETED";
    }
}