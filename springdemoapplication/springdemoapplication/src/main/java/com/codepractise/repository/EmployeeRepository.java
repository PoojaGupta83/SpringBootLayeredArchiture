package com.codepractise.repository;

import com.codepractise.entity.Employee;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeRepository {
public Employee getEmployee(Integer id){
    return new Employee(1,"DummyData","IT",21);
}
}
