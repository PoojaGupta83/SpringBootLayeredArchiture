package com.codepractise.service;

import com.codepractise.dto.EmployeeDTO;
import com.codepractise.entity.Employee;
import com.codepractise.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository repository;
    public EmployeeDTO getEmployee(Integer id) {
        Employee emp= repository.getEmployee(id);
        EmployeeDTO employeeDTO=new EmployeeDTO();
        return employeeDTO.employeemapper(emp);
    }
}
