package org.example.oop6.homeWork;

import org.example.oop5.homeWork.model.Employee;

import java.util.List;

public interface EmployeeRepository {
    // Создан интерфейс `EmployeeRepository`, который будет отвечать за хранение и управление списком сотрудников:
    // принцип  Принцип разделения интерфейса (Interface Segregation Principle, ISP)
    void addEmployee(Employee employee);
    void deleteEmployee(int index);
    List<Employee> getAllEmployees();
    Employee getEmployee(int index);
}
