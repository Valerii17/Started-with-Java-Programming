package org.example.oop6.homeWork;

import org.example.oop5.homeWork.model.Employee;

public class ConsoleEmployeeView implements EmployeeView{
    // В классе `ConsoleEmployeeView`, будет выводить информацию о сотруднике в консоль: реализуем
    // Принцип единственной ответственности (Single Responsibility Principle, SRP)
    @Override
    public void printEmployeeDetails(Employee employee) {
        System.out.println("Name: " + employee.getName());
        System.out.println("Age: " + employee.getAge());
    }

    @Override
    public void printEmptyLine() {
        System.out.println();
    }
}
