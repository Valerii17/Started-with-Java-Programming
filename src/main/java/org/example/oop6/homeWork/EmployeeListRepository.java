package org.example.oop6.homeWork;

import org.example.oop5.homeWork.model.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeListRepository implements EmployeeRepository {
    // В классе `EmployeeListRepository`,  представляем список сотрудников: реализуем
    // Принцип единственной ответственности (Single Responsibility Principle, SRP)
    private List<Employee> employees;

    public EmployeeListRepository() {
        employees = new ArrayList<>();
    }

    @Override
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    @Override
    public void deleteEmployee(int index) {
        employees.remove(index);
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employees;
    }

    @Override
    public Employee getEmployee(int index) {
        return employees.get(index);
    }
}


