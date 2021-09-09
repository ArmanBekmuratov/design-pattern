package com.arman.basepatterns.structual.composite;

import java.util.ArrayList;
import java.util.List;

public class HeadDepartment implements Department{
    private int id;
    private String name;
    private List<Department> departments;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Department> getDepartments() {
        return departments;
    }

    public void setDepartments(List<Department> departments) {
        this.departments = departments;
    }

    public HeadDepartment(int id, String name) {
        this.id = id;
        this.name = name;
        this.departments = new ArrayList<>();
    }

    @Override
    public void printDepartmentName() {
       departments.forEach(Department::printDepartmentName);
    }

    public void addDepartment(Department department) {
        departments.add(department);
    }

    public void removeDepartment(Department department) {
        departments.remove(department);
    }
}
