package org.example.oop5.homeWork.controller;

import org.example.oop5.homeWork.model.Employee;
import org.example.oop5.homeWork.view.EmployeeView;

import java.util.List;

public class EmployeeController {
    private List<Employee> employees;
    private EmployeeView view;

    public EmployeeController(List<Employee> employees, EmployeeView view) {
        this.employees = employees;
        this.view = view;
    }

    public void setEmployeeName(int index, String name) {
        employees.get(index).setName(name);
    }

    public void setEmployeeAge(int index, int age) {
        employees.get(index).setAge(age);
    }

    public void deleteEmployee(int index) {
        employees.remove(index);
    }

    public void updateView() {
        for (Employee employee : employees) {
            view.printEmployeeDetails(employee);
        }
        System.out.println();
    }

}
