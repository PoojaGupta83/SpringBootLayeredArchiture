package com.codepractise.dto;

import com.codepractise.entity.Employee;

public class EmployeeDTO {
    String name;
    String dept;
    int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public EmployeeDTO employeemapper(Employee emp) {
        this.setName(emp.getName());
        this.setAge(emp.getAge());
        this.setDept(emp.getDept());
        return this;
    }
}
