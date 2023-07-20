package org.example.oop6.homeWork;

import org.example.oop5.homeWork.model.Employee;

import java.util.List;

public class EmployeeController {
    //Скоректируем класс `EmployeeController`, который будет отвечать за управление сотрудниками:реализуем
    //Принцип открытости/закрытости (Open-Closed Principle, OCP)
    private EmployeeRepository repository;
    private EmployeeView view;

    public EmployeeController(EmployeeRepository repository, EmployeeView view) {
        this.repository = repository;
        this.view = view;
    }

    public void setEmployeeName(int index, String name) {
        repository.getEmployee(index).setName(name);
    }

    public void setEmployeeAge(int index, int age) {
        repository.getEmployee(index).setAge(age);
    }

    public void deleteEmployee(int index) {
        repository.deleteEmployee(index);
    }

    public void updateView() {
        List<Employee> employees = repository.getAllEmployees();
        for (Employee employee : employees) {
            view.printEmployeeDetails(employee);
        }
        view.printEmptyLine();
    }
}
