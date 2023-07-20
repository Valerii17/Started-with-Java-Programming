package org.example.oop6.homeWork;

import org.example.oop5.homeWork.model.Employee;

public interface EmployeeView {
    // Создан интерфейс `EmployeeView`, который будет отвечать за вывод информации о сотруднике:
    // принцип  Принцип разделения интерфейса (Interface Segregation Principle, ISP)
    void printEmployeeDetails(Employee employee);
    void printEmptyLine();
}
