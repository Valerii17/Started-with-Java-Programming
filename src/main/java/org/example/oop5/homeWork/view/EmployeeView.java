package org.example.oop5.homeWork.view;

import org.example.oop5.homeWork.model.Employee;

public class EmployeeView {

    public void printEmployeeDetails(Employee employee) {
        System.out.println("Name: " + employee.getName());
        System.out.println("Age: " + employee.getAge());
    }


}

